#include <graphics.h>
#include <cmath>

int main() {
    int x0 = 50, y0 = 600, Px = 600, Py = 500, Dx = 60, Dy = 100;

    initwindow(1000, 800);

    float x_values[] = {-10, -3, 12, 20, 24, 32, 41, 48, 55, 63};
    float y_values[] = {13, 20, -6, 7, 18, 5, 23, 10, -3, 2};

    int n = sizeof(x_values) / sizeof(x_values[0]); // Определяне на броя на данните

    // Изчертаване на осите
    line(x0, y0, x0 + Px, y0); // хоризонтална ос
    line(x0, y0, x0, y0 - Py); // вертикална ос

    // Минимални и максимални стойности за x и y
    float xmin = x_values[0], xmax = x_values[9];
    float ymin = y_values[2], ymax = y_values[4];
    for (int i = 1; i < n; i++) {


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
        gcvt(xmin + i * Dx * sx, 5, text);
        settextjustify(1, 2);
        outtextxy(x0 + i * Dx, y0 + 5, text);
    }

    // Надписване на деленията на вертикалната ос
    for (int j = 0; j <= Jp; j++) {
        char text[10];
        line(x0, y0 - j * Dy, x0 - 3, y0 - j * Dy);
        gcvt(ymin + j * Dy * sy, 5, text);
        settextjustify(2, 1);
        outtextxy(x0 - 10, y0 - j * Dy, text);
    }

    // Преобразуване на входните данни в координати на пиксели и изобразяване на точките
    for (int i = 0; i < n; i++) {
        int xprim = x0 + (x_values[i] - xmin) / sx;
        int yprim = y0 - (y_values[i] - ymin) / sy;
        circle(xprim, yprim, 2);
    }

    // Свързване на точките с отсечки
    for (int i = 0; i < n - 1; i++) {
        int x1 = x0 + (x_values[i] - xmin) / sx;
        int y1 = y0 - (y_values[i] - ymin) / sy;
        int x2 = x0 + (x_values[i + 1] - xmin) / sx;
        int y2 = y0 - (y_values[i + 1] - ymin) / sy;
        line(x1, y1, x2, y2);
    }



    getch();
    return 0;
}
