#include <graphics.h>
#include <iostream>
using namespace std;

int main() {
    // Инициализация на графичния прозорец
    initwindow(800, 800);

    //Условие
    // Параметри на графичния прозорец
    int Px = 600, Py = 500, Dx = 60, Dy = 100, x0 = 50, y0 = 600;
        // Изчертаване на графичния прозорец
        line(x0, y0, x0 + Px, y0); // Хоризонтална ос
        line(x0, y0, x0, y0 - Py); // Вертикална ос

    // Задаване на входните данни - двойки стойности реални числа
    float x[] = {-10, -3, 12, 20, 24, 32, 41, 48, 55, 63};
    float y[] = {13, 20, -6, -7, 18, 52, 23, 10, -32, -2};



    // ПЪРВА СТЪПКА ОТ АЛГОРИТЪМА
    //==================================================================================================================================
    int n = sizeof(x) / sizeof(x[0]); // Определяне на броя на входните данни



    // ВТОРА СТЪПКА ОТ АЛГОРИТЪМА
    //==================================================================================================================================
    // Намиране на диапазона на изменение на входните данни
    float xmin = x[0], xmax = x[n - 1];
    float ymin = y[0], ymax = y[0];
    for (int i = 1; i < n; i++) {
        if (y[i] < ymin) ymin = y[i];
        if (y[i] > ymax) ymax = y[i];
    }



    // ТРЕТА СТЪПКА ОТ АЛГОРИТЪМА
    //==================================================================================================================================
    // Определяне на скалните коефициенти
    float sx = (xmax - xmin) / Px;
    float sy = (ymax - ymin) / Py;





    // ЧЕТВЪРТА СТЪПКА ОТ АЛГОРИТЪМА
    //==================================================================================================================================
    // Изчертаване и надписване на деленията по хоризонталната ос
    char text[10];
    for (int i = 0; i <= Px / Dx; i++) {
        line(x0 + i * Dx, y0, x0 + i * Dx, y0 + 3);
        gcvt(xmin + i * Dx * sx, 5.2, text);
        settextjustify(1, 2);
        outtextxy(x0 + i * Dx, y0 + 5, text);
    }

    // Изчертаване и надписване на деленията по вертикалната ос
    for (int i = 0; i <= Py / Dy; i++) {
        line(x0, y0 - i * Dy, x0 - 3, y0 - i * Dy);
        gcvt(ymin + i * Dy * sy, 5.2, text);
        settextjustify(2, 1);
        outtextxy(x0 - 10, y0 - Dy * i + 5, text);
    }





    // ПЕТА СТЪПКА ОТ АЛГОРИТЪМА
    //==================================================================================================================================
    // Преобразуване на входните данни в координати на пиксели и изобразяване на точките
    for (int i = 0; i < n; i++) {
        int xprim = x0 + (x[i] - xmin) / sx;
        int yprim = y0 - (y[i] - ymin) / sy;
        circle(xprim, yprim, 3);
    }

    // Изчертаване на връзките между точките
    for (int i = 0; i < n - 1; i++) {
        int xa = x0 + (x[i] - xmin) / sx;
        int ya = y0 - (y[i] - ymin) / sy;
        int xb = x0 + (x[i + 1] - xmin) / sx;
        int yb = y0 - (y[i + 1] - ymin) / sy;
        line(xa, ya, xb, yb);
    }






    getch();
    return 0;
}
