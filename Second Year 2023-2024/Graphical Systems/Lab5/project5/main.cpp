#include <graphics.h>
#include <iostream>
using namespace std;

int main() {
    float a[] = {5, 12, 18, 8, 13, 23, 14, 10};
    char labels[][20] = {"a", "b", "c", "d", "e", "f", "g", "h"};

    int n = sizeof(a) / sizeof(a[0]);
    int winwidth = 800, winheight = 600;

    int Px = 600, Py = 400, D = 50, Ds = 40, Dc = 30, x0 = 100, y0 = 450;

    // намиране на диапазона на изменение на данните
    float amin = a[0];
    float amax = a[0];
    for (int i = 1; i < n; i++) {
        if (a[i] < amin) amin = a[i];
        if (a[i] > amax) amax = a[i];
    }

    if (amin > 0) amin = 0;
    if (amax < 0) amax = 0;

    // определяне на скалния коефициент за скалата със стойностите(вертикалната)
    float s = (amax - amin) / Py;

    // определяне на новото положение на хоризонталната ос
    int y0n = y0 + amin / s;

    // инициализация на графичната система
    initwindow(winwidth, winheight);

    // изчертаване на графичния прозорец
    line(x0, y0n, x0 + Px, y0n); // хоризонтална ос
    line(x0, y0, x0, y0 - Py);    // вертикална ос

    int I = Py / D; // брой деления по скалата със стойностите
    char text[10];

    // изчертаване и надписване на деленията по оста със стойностите
    for (int i = 0; i <= I; i++) {
        line(x0, y0 - D * i, x0 - 3, y0 - D * i); // изчертаване на деленията
        gcvt(amin + i * D * s, 3.2, text);        // преобразуване на реалната стойност
        settextjustify(2, 1);
        outtextxy(x0 - 10, y0 - D * i + 5, text); // извеждане на стойността
    }

    // надписване на оста с надписите
    for (int i = 1; i <= n; i++) {
        settextjustify(1, 2);
        outtextxy(x0 + i * (Ds + Dc) - Ds / 2, y0 + 5, labels[i - 1]);
    }

    // изобразяване на стълбчетата
    for (int i = 1; i < n + 1; i++) {
        int x1 = x0 + i * (Ds + Dc) - Ds;       // x координата на горен ляв ъгъл
        int y1 = y0n - (a[i - 1]) / s;          // y координата на горен ляв ъгъл
        int x2 = x0 + i * (Ds + Dc);            // x координата на долен десен ъгъл
        int y2 = y0n;                            // y координата на долен десен ъгъл
        setfillstyle(1, i + 1);
        bar(x1, y1, x2, y2);
    }

    getch();
    return 0;
}
