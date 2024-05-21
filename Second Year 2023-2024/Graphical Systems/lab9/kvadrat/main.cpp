#include <graphics.h>
#include <iostream>
using namespace std;

int main()
{
    int gd = DETECT, gm; // графичния драйвер и режим
    initgraph(&gd, &gm, ""); // инициализация на графичната система

    // Дефиниране на дадените точки
    int Ax = 300, Ay = 300; // т. A
    int side_length = 100; // страна на квадрата в пиксели

    // Намиране на останалите върхове на квадрата
    int Bx = Ax + side_length;
    int By = Ay;
    int Cx = Bx;
    int Cy = By + side_length;
    int Dx = Ax;
    int Dy = Ay + side_length;

    // Изчертаване на квадрата ABCD
    line(Ax, Ay, Bx, By);
    line(Bx, By, Cx, Cy);
    line(Cx, Cy, Dx, Dy);
    line(Dx, Dy, Ax, Ay);

    delay(5000); // Изчакване за демонстрация

    getch(); // Чака потребителя да натисне клавиш, преди да затвори прозореца
    closegraph(); // Затваря графичния прозорец

    return 0;
}
