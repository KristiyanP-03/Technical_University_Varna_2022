#include <graphics.h>
#include <cmath>

int main() {
    int x0 = 140, y0 = 500, Px = 400, Py = 350, Dx = 80, Dy = 70;
    float Xfmin = -3.14, Xfmax = 3.14;


    initwindow(1000, 800);



    line(x0, y0, x0 + Px, y0);
    line(x0, y0, x0, y0 - Py);


    float xmin = x[0], xmax = x[n - 1];
    float ymin = y[0], ymax = y[0];
    for (int i = 1; i < n; i++) {
        if (y[i] < ymin) ymin = y[i];
        if (y[i] > ymax) ymax = y[i];
    }


    float sx = (xmax - xmin) / Px;
    float sy = (ymax - ymin) / Py;



    int Ip = abs(Px / Dx);
    int Jp = abs(Py / Dy);



    for (int i = 0; i <= I_p; i++) {
        line(x0 + i * Dx, y0, x0 + i * Dx, y0 + 3);
        char text[10];
        gcvt(xmin + i * Dx * 2 * 3.14 / Px, 5, text);
        settextjustify(1, 2);
        outtextxy(x0 + i * Dx, y0 + 5, text);
    }


    for (int j = 0; j <= J_p; j++) {
        line(x0, y0 - j * Dy, x0 - 3, y0 - j * Dy);
        char text[10];
        gcvt(ymin + j * Dy * 2 / Py, 5, text);
        settextjustify(2, 1);
        outtextxy(x0 - 10, y0 - j * Dy, text);
    }




    getch();
    return 0;
}
