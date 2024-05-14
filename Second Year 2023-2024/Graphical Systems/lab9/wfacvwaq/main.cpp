#include <graphics.h>
#include <iostream>
#include <dos.h>
#include <math.h>
using namespace std;

int main()
{
    int gd = DETECT, gm; // графичния драйвер и режим
    initgraph(&gd, &gm, ""); // инициализация на графичната система

    // Дефиниране на дадените точки
    int Mx = 200, My = 200; // т. M
    int Dx = 100, Dy = 300; // т. D

    // Намиране на т. A, B, C
    int AMx = Mx - Dx;
    int AMy = My - Dy;
    int MCx = Dx + 5 * (Mx - Dx);
    int MCy = Dy + 5 * (My - Dy);
    int Ax = 2 * MCx - AMx;
    int Ay = 2 * MCy - AMy;
    int Bx = Dx;
    int By = Dy;
    int Cx = 2 * Dx - MCx;
    int Cy = 2 * Dy - MCy;

    // Изчертаване на т. A, B, C
    putpixel(Ax, Ay, WHITE);
    putpixel(Bx, By, WHITE);
    putpixel(Cx, Cy, WHITE);

    // Изчертаване на правоъгълник ABCD
    line(Ax, Ay, Bx, By);
    line(Bx, By, Cx, Cy);
    line(Cx, Cy, Dx, Dy);
    line(Dx, Dy, Ax, Ay);

    delay(1000); // Изчакване за демонстрация

    // Завъртане на фигурата около т. A на 20 градуса
    int angle = 20;
    double radians = angle * M_PI / 180; // Преобразуване на ъгъла в радиани
    int Axr = Ax;
    int Ayr = Ay;
    int Bxr = (Bx - Ax) * cos(radians) - (By - Ay) * sin(radians) + Ax;
    int Byr = (Bx - Ax) * sin(radians) + (By - Ay) * cos(radians) + Ay;
    int Cxr = (Cx - Ax) * cos(radians) - (Cy - Ay) * sin(radians) + Ax;
    int Cyr = (Cx - Ax) * sin(radians) + (Cy - Ay) * cos(radians) + Ay;
    int Dxr = (Dx - Ax) * cos(radians) - (Dy - Ay) * sin(radians) + Ax;
    int Dyr = (Dx - Ax) * sin(radians) + (Dy - Ay) * cos(radians) + Ay;

    // Изчертаване на завъртяната фигура
    line(Axr, Ayr, Bxr, Byr);
    line(Bxr, Byr, Cxr, Cyr);
    line(Cxr, Cyr, Dxr, Dyr);
    line(Dxr, Dyr, Axr, Ayr);

    delay(1000); // Изчакване за демонстрация

    // Мащабиране на завъртяната фигура спрямо т. A с коефициенти Sx = 2, Sy = 1.5
    double Sx = 2, Sy = 1.5;
    Bxr = Ax + (Bxr - Ax) * Sx;
    Byr = Ay + (Byr - Ay) * Sy;
    Cxr = Ax + (Cxr - Ax) * Sx;
    Cyr = Ay + (Cyr - Ay) * Sy;
    Dxr = Ax + (Dxr - Ax) * Sx;
    Dyr = Ay + (Dyr - Ay) * Sy;

    // Изчертаване на мащабирания правоъгълник
    line(Axr, Ayr, Bxr, Byr);
    line(Bxr, Byr, Cxr, Cyr);
    line(Cxr, Cyr, Dxr, Dyr);
    line(Dxr, Dyr, Axr, Ayr);

    delay(1000); // Изчакване за демонстрация

    getch(); // Чака потребителя да натисне клавиш, преди да затвори прозореца
    closegraph(); // Затваря графичния прозорец

    return 0;
}
