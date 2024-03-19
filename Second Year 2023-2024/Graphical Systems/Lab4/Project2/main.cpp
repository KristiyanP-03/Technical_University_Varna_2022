#include <graphics.h>
#include <cmath>

int main() {
    int x0 = 140, y0 = 500, Px = 400, Py = 350, Dx = 80, Dy = 70;

    initwindow(1000, 800);

    float x_values[65];
    float y_values[65];
    float step = 6.28 / 64; // Шагът между стойностите, за да се покрие диапазонът от -3.14 до 3.14

    // Генериране на стойности за x и изчисляване на съответните стойности за y
    for (int i = 0; i < 65; i++) {
        x_values[i] = -3.14 + i * step;
        y_values[i] = sin(x_values[i]);
    }

    // Изчертаване на осите
    line(x0, y0, x0 + Px, y0);
    line(x0, y0, x0, y0 - Py);

    // Минимални и максимални стойности за x и y
    float xmin = x_values[0], xmax = x_values[64];
    float ymin = y_values[0], ymax = y_values[0];
    for (int i = 1; i < 65; i++) {
        if (y_values[i] < ymin) ymin = y_values[i];
        if (y_values[i] > ymax) ymax = y_values[i];
    }

    // Скаларни коефициенти
    float sx = (xmax - xmin) / Px;
    float sy = (ymax - ymin) / Py;

    // Брой деления по хоризонталната и вертикалната ос
    int Ip = abs(Px / Dx);
    int Jp = abs(Py / Dy);

    // Надписване на деленията на хоризонталната ос
    for (int i = 0; i <= Ip; i++) {
        char text[10];
        line(x0 + i * Dx, y0, x0 + i * Dx, y0 + 3);
        gcvt(xmin + i * Dx * sx, 5.2, text);
        settextjustify(1, 2);
        outtextxy(x0 + i * Dx, y0 + 5, text);
    }

    // Надписване на деленията на вертикалната ос
    for (int j = 0; j <= Jp; j++) {
        char text[10];
        line(x0, y0 - j * Dy, x0 - 3, y0 - j * Dy);
        gcvt(ymin + j * Dy * sy, 5.2, text);
        settextjustify(2, 1);
        outtextxy(x0 - 10, y0 - j * Dy, text);
    }

    getch();
    return 0;
}
