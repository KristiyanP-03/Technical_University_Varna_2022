#include <graphics.h>
#include <iostream>
using namespace std;

int main() {
    float food[] = {300, 370, 340};
    float bills[] = {280, 260, 200};
    char months[][20] = {"януари", "февруари", "март"};

    int n = sizeof(food) / sizeof(food[0]);
    int winwidth = 800, winheight = 600;

    int Px = 400, Py = 400, D = 40, Ds = 70, Dc = 50, x0 = 100, y0 = 450;

    // Намиране на диапазона на изменение на данните
    float amin = 0;
    float amax = food[0] + bills[0];
    for (int i = 1; i < n; i++) {
        float total = food[i] + bills[i];
        if (total > amax) amax = total;
    }

    // Определяне на скалния коефициент за скалата със стойностите (вертикалната)
    float s = amax / Py;

    // Определяне на новото положение на хоризонталната ос
    int y0n = y0 - amin / s;

    // Инициализация на графичната система
    initwindow(winwidth, winheight);

    // Изчертаване на графичния прозорец
    line(x0, y0n, x0 + Px, y0n); // хоризонтална ос
    line(x0, y0, x0, y0 - Py);    // вертикална ос

    int I = Py / D; // Брой деления по скалата със стойностите
    char text[10];

    // Изчертаване и надписване на деленията по оста със стойностите
    for (int i = 0; i <= I; i++) {
        line(x0, y0 - D * i, x0 - 3, y0 - D * i); // Изчертаване на деленията
        gcvt(i * D * s, 5.2, text);               // Преобразуване на реалната стойност
        settextjustify(2, 1);
        outtextxy(x0 - 10, y0 - D * i + 5, text); // Извеждане на стойността
    }

    // Надписване на месеците на хоризонталната ос
    for (int i = 0; i < n; i++) {
        settextjustify(1, 2);
        outtextxy(x0 + i * (Ds + Dc) + Ds / 2, y0 + 5, months[i]);
    }

    // Изобразяване на стълбчетата за храна
    for (int i = 0; i < n; i++) {
        int x1 = x0 + i * (Ds + Dc);                 // x координата на горен ляв ъгъл
        int y1 = y0 - food[i] / s;                   // y координата на горен ляв ъгъл
        int x2 = x1 + Ds;                            // x координата на долен десен ъгъл
        int y2 = y0;                                 // y координата на долен десен ъгъл
        setfillstyle(1, BLUE);                       // Син цвят за храна
        bar(x1, y1, x2, y2);
    }

    // Изобразяване на стълбчетата за сметки
    for (int i = 0; i < n; i++) {
        int x1 = x0 + i * (Ds + Dc);                 // x координата на горен ляв ъгъл
        int y1 = y0 - (food[i] + bills[i]) / s;      // y координата на горен ляв ъгъл
        int x2 = x1 + Ds;                            // x координата на долен десен ъгъл
        int y2 = y0 - food[i] / s;                   // y координата на долен десен ъгъл
        setfillstyle(1, YELLOW);                     // Жълт цвят за сметки
        bar(x1, y1, x2, y2);
    }

    getch();
    return 0;
}

