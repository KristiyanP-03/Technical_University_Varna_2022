#include <graphics.h>
#include <iostream>
using namespace std;

int main() {
    float a[] = {5, 12, 18, 8, 13, 23, 14, 10};
    char labels[][20] = {"a", "b", "c", "d", "e", "f", "g", "h"};

    int n = sizeof(a) / sizeof(a[0]);
    int winwidth = 800, winheight = 600;

    int Px = 600, Py = 400, D = 50, Ds = 40, Dc = 30, x0 = 100, y0 = 450;

    // �������� �� ��������� �� ��������� �� �������
    float amin = a[0];
    float amax = a[0];
    for (int i = 1; i < n; i++) {
        if (a[i] < amin) amin = a[i];
        if (a[i] > amax) amax = a[i];
    }

    if (amin > 0) amin = 0;
    if (amax < 0) amax = 0;

    // ���������� �� ������� ���������� �� ������� ��� �����������(������������)
    float s = (amax - amin) / Py;

    // ���������� �� ������ ��������� �� �������������� ��
    int y0n = y0 + amin / s;

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
        gcvt(amin + i * D * s, 3.2, text);        // ������������� �� �������� ��������
        settextjustify(2, 1);
        outtextxy(x0 - 10, y0 - D * i + 5, text); // ��������� �� ����������
    }

    // ���������� �� ���� � ���������
    for (int i = 1; i <= n; i++) {
        settextjustify(1, 2);
        outtextxy(x0 + i * (Ds + Dc) - Ds / 2, y0 + 5, labels[i - 1]);
    }

    // ������������ �� �����������
    for (int i = 1; i < n + 1; i++) {
        int x1 = x0 + i * (Ds + Dc) - Ds;       // x ���������� �� ����� ��� ����
        int y1 = y0n - (a[i - 1]) / s;          // y ���������� �� ����� ��� ����
        int x2 = x0 + i * (Ds + Dc);            // x ���������� �� ����� ����� ����
        int y2 = y0n;                            // y ���������� �� ����� ����� ����
        setfillstyle(1, i + 1);
        bar(x1, y1, x2, y2);
    }

    getch();
    return 0;
}
