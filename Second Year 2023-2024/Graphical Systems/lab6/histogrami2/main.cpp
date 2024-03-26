#include <graphics.h>
#include <iostream>
using namespace std;

int main() {
    float food[] = {300, 370, 340};
    float bills[] = {280, 260, 200};
    char months[][20] = {"������", "��������", "����"};

    int n = sizeof(food) / sizeof(food[0]);
    int winwidth = 800, winheight = 600;

    int Px = 400, Py = 400, D = 40, Ds = 70, Dc = 50, x0 = 100, y0 = 450;

    // �������� �� ��������� �� ��������� �� �������
    float amin = 0;
    float amax = food[0] + bills[0];
    for (int i = 1; i < n; i++) {
        float total = food[i] + bills[i];
        if (total > amax) amax = total;
    }

    // ���������� �� ������� ���������� �� ������� ��� ����������� (������������)
    float s = amax / Py;

    // ���������� �� ������ ��������� �� �������������� ��
    int y0n = y0 - amin / s;

    // ������������� �� ���������� �������
    initwindow(winwidth, winheight);

    // ����������� �� ��������� ��������
    line(x0, y0n, x0 + Px, y0n); // ������������ ��
    line(x0, y0, x0, y0 - Py);    // ���������� ��

    int I = Py / D; // ���� ������� �� ������� ��� �����������
    char text[10];

    // ����������� � ���������� �� ��������� �� ���� ��� �����������
    for (int i = 0; i <= I; i++) {
        line(x0, y0 - D * i, x0 - 3, y0 - D * i); // ����������� �� ���������
        gcvt(i * D * s, 5.2, text);               // ������������� �� �������� ��������
        settextjustify(2, 1);
        outtextxy(x0 - 10, y0 - D * i + 5, text); // ��������� �� ����������
    }

    // ���������� �� �������� �� �������������� ��
    for (int i = 0; i < n; i++) {
        settextjustify(1, 2);
        outtextxy(x0 + i * (Ds + Dc) + Ds / 2, y0 + 5, months[i]);
    }

    // ������������ �� ����������� �� �����
    for (int i = 0; i < n; i++) {
        int x1 = x0 + i * (Ds + Dc);                 // x ���������� �� ����� ��� ����
        int y1 = y0 - food[i] / s;                   // y ���������� �� ����� ��� ����
        int x2 = x1 + Ds;                            // x ���������� �� ����� ����� ����
        int y2 = y0;                                 // y ���������� �� ����� ����� ����
        setfillstyle(1, BLUE);                       // ��� ���� �� �����
        bar(x1, y1, x2, y2);
    }

    // ������������ �� ����������� �� ������
    for (int i = 0; i < n; i++) {
        int x1 = x0 + i * (Ds + Dc);                 // x ���������� �� ����� ��� ����
        int y1 = y0 - (food[i] + bills[i]) / s;      // y ���������� �� ����� ��� ����
        int x2 = x1 + Ds;                            // x ���������� �� ����� ����� ����
        int y2 = y0 - food[i] / s;                   // y ���������� �� ����� ����� ����
        setfillstyle(1, YELLOW);                     // ���� ���� �� ������
        bar(x1, y1, x2, y2);
    }

    getch();
    return 0;
}

