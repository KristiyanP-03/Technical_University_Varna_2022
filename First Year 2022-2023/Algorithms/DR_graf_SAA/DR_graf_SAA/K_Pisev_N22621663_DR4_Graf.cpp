/*Задача 63.Съставете програмаза работа с ориентиран граф, представен чрез списъци на съседство, 
която да предлага меню с основните операции със структурата граф.
Да се напише функция, която брои и визуализира изолирани върхове в дадения граф и се добави към менюто.*/


#include <iostream>
using namespace std;
const int n = 5;
struct link
{
    char key;
    link* next;
    link* last;
} *G[n];


void add_peak(int peak_index, char new_peak_to_connect)
{
    link* p = new link;

    p->key = new_peak_to_connect;
    p->next = NULL;

    if (G[peak_index] == NULL)
    {
        G[peak_index] = p;
    }
    else
    {
        link* last = G[peak_index];
        while (last->next != NULL)
        {
            last = last->next;
        }
        last->next = p;
    }
}


void print_graph()
{
    for (int current_list = 0; current_list < n; current_list++)
    {
        cout << current_list << ": ";
        for (link* p = G[current_list]; p != NULL; p = p->next)
        {
            cout << p->key << " ";
        }
        cout << endl;
    }
}


void isolated_peaks()
{
    int isolated_peaks = 0;

    for (int i = 0; i < n; i++)
    {
        bool has_neighbors = false;

        for (link* p = G[i]; p != NULL; p = p->next)
        {
            if (p->next != NULL)
            {
                has_neighbors = true;
                break;
            }
        }
        if (!has_neighbors)
        {
            bool is_neighbor = false;

            for (int j = 0; j < n; j++)
            {
                if (j != i)
                {
                    for (link* p = G[j]; p != NULL; p = p->next)
                    {
                        if (p->next != NULL && p->next->key == G[i]->key)
                        {
                            is_neighbor = true;
                            break;
                        }
                    }
                }
                if (is_neighbor)
                {
                    break;
                }
            }
            if (!is_neighbor)
            {
                isolated_peaks++;
                cout << G[i]->key << " ";
            }
        }
    }
    cout << endl << "Total isolated peaks: " << isolated_peaks << endl;
}



int main()
{
    add_peak(0, 'A');
    add_peak(0, 'B');
    add_peak(1, 'A');
    add_peak(1, 'C');
    add_peak(1, 'D');
    add_peak(1, 'B');
    add_peak(2, 'E');
    add_peak(3, 'F');
    add_peak(4, 'G');
    add_peak(4, 'C');

    int choice;
    do {
        cout << "=== | MENU | ===" << endl;
        cout << "1. Print Graph" << endl;
        cout << "2. Isolated Peaks" << endl;
        cout << "3. Exit" << endl;
        cout << "Your choice: ";
        cin >> choice;
        cout << endl;

        switch (choice) {
        case 1:
            print_graph();
            break;
        case 2:
            isolated_peaks();
            break;
        case 3:
            cout << "Bye" << endl;
            break;
        default:
            cout << "No" << endl;
            break;
        }
        cout << endl;
    } while (choice != 3);

    return 0;
}

