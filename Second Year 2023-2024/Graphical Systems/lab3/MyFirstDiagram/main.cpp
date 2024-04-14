#include <graphics.h>
#include <iostream>
using namespace std;

int main() {
    // Задаване на входните данни - двойки стойности реални числа
    float x[] = {-5, 12, 78, -23, 34, -10, 65, 30, 44}, temp;
    float y[] = {40, -10, 70, 80, 90, 40, -22, 12, 30};
    int n = sizeof(x) / sizeof(x[0]); // Определяне на броя на входните данни
    int i, j;
    int winwidth = 800, winheight = 600; // Параметри на прозореца на графичната система
    int Px = 500, Py = 400, Dx = 50, Dy = 40, x0 = 100, y0 = 450; // Параметри на графичния прозорец

    // Сортиране на входните данни, в случай, че те са експериментални
    for (i = 0; i < n; i++) {
        for (j = 0; j < n - i - 1; j++) {
            if (x[j] > x[j + 1]) {
                temp = x[j];
                x[j] = x[j + 1];
                x[j + 1] = temp;
                temp = y[j];
                y[j] = y[j + 1];
                y[j + 1] = temp;
            }
        }
    }

    // Намиране на диапазона на изменение на входните данни - xmin, xmax, ymin, ymax
    // След сортирането xmin и xmax са съответно първия и последен елемент от масива x
    float xmin = x[0];
    float xmax = x[n - 1];
    // Намиране на ymin и ymax
    float ymin = y[0];
    float ymax = y[0];
    for (int i = 1; i < n; i++) {
        if (y[i] < ymin) ymin = y[i];
        if (y[i] > ymax) ymax = y[i];
    }

    // Определяне на скалните коефициенти
    float sx = (xmax - xmin) / Px;
    float sy = (ymax - ymin) / Py;

    // Инициализация на графичната система чрез отваряне на графичен прозорец със зададен размер
    initwindow(winwidth, winheight);

    // Изчертаване на графичния прозорец
    line(x0, y0, x0 + Px, y0); // Хоризонтална ос
    line(x0, y0, x0, y0 - Py); // Вертикална ос

    // Изчертаване на деленията по хоризонталната ос
    int Ip = Px / Dx;
    for (i = 1; i <= Ip; i++) {
        line(x0 + i * Dx, y0, x0 + i * Dx, y0 + 3); // Изчертаване на деленията
        char text[10];
        gcvt(xmin + i * Dx * sx, 5, text); // Преобразуване на реалната стойност в символен низ
        settextjustify(1, 2);
        outtextxy(x0 + i * Dx, y0 + 5, text); // Извеждане на стойността, съответстваща на делението
    }

    // Изчертаване на деленията по вертикалната ос
    int Jp = Py / Dy;
    for (i = 1; i <= Jp; i++) {
        line(x0, y0 - i * Dy, x0 - 3, y0 - i * Dy); // Изчертаване на деленията
        char text[10];
        gcvt(ymin + i * Dy * sy, 5, text); // Преобразуване на реалната стойност в символен низ
        settextjustify(2, 1);
        outtextxy(x0 - 10, y0 - Dy * i + 5, text); // Извеждане на стойността, съответстваща на делението
    }

    // Преобразуване на входните данни в координати на пиксели, които се използват за центрове на
    // окръжности с радиус 3 пиксела
    for (i = 0; i < n; i++) {
        int xprim = x0 + (x[i] - xmin) / sx;
        int yprim = y0 - (y[i] - ymin) / sy;
        circle(xprim, yprim, 3);
    }

    // Свързване на окръжностите с отсечки и получаване на 2D графика, съответстваща на входните
    // данни x,y
    for (i = 0; i < n - 1; i++) {
        int xa = x0 + (x[i] - xmin) / sx;
        int ya = y0 - (y[i] - ymin) / sy;
        int xb = x0 + (x[i + 1] - xmin) / sx;
        int yb = y0 - (y[i + 1] - ymin) / sy;
        line(xa, ya, xb, yb);
    }

    getch();
    return 0;
}

