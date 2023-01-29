//SDR - frame of library

//Syzdajte masiv s knigi(struktura book): catalojen nomer,zaglavie, avtor,godina na izdavane,
//broj zakupeni knigi w bibliotekata, zaeti w momenta knigi, nalichni knigi;
//Syhranete masiva w fail
//Fajlyt se obnovqva chrez dobawqne na grupa ot knigi
//ili edna po edna kniga sled zapitvane za dobavqne
//Da se izvejda katalog na knigi w grupi po 5
//Da se zaema kniga ot bibliotekata po ukazan avtor
//Da se vrysta kniga po ukazano zaglavie
//Da se vrysta kniga po catalojen nomer
//Da se izwejda spravka za knigi izdadeni sled 2020 godina
//Da se syhranqva fajla sled korekcii

#include <iostream>
#include <fstream>
#include <cstring>
using namespace std;
const int N = 100;  //max broj knigi
const char Filename[] = "Librari.dat";
struct book
{
    int catnum;
    char title[30];
    char avtor[30];
    int year;
    int br;
    int zaem;
    int nalich;
};
fstream fp;

int menu()
{
    int ch;
    cout << "\n \n \n \t menu";
    cout << "\n 1.Append several books (max 5)";
    cout << "\n 2.Append a new book and ask for next";
    cout << "\n 3.Print all books";
    cout << "\n 4.Borrow the book by autor";
    cout << "\n 5.Return book on title";
    cout << "\n 6.Return book on catalog number";
    cout << "\n 7 Queries";
    cout << "\n 8 Save library";
    cout << "\n 9 Exit";
    do {
        cout << "\n Your choice is:";
        cin >> ch;
    } while (ch < 1 || ch>9);
    return(ch);
}

book input()
{
    book a = { 0 };
    cout << "\n Catalog number:"; cin >> a.catnum; cin.ignore();
    cout << "\n Title:"; cin.getline(a.title, 30);
    cout << "\n Avtor:"; cin.getline(a.avtor, 30);
    cout << "\n Year of publication:"; cin >> a.year;
    do { cout << "\n Number of books:"; cin >> a.br; } while (a.br < 0);//ot edna kniga
    do { cout << "\n Borrow number:"; cin >> a.zaem; } while (a.zaem<0 || a.zaem>a.br);
    cout << "\n number presenting books:";
    a.nalich = a.br - a.zaem; cout << a.nalich;
    return(a);
}

int enter(book Lib[], int n)
{
    int i, m;
    do {
        cout << "\n How many books to enter(max 5):";
        cin >> m;
    } while (m < 0 || m>5);
    if (m + n < 100)
    {
        for (i = n; i < n + m; i++)
        {
            cout << "\n book " << i + 1;
            Lib[i] = input();
        }
        return (n + m);
    }
    else
        cout << "\n There are no free places in array Lib\n";
}

void saveinfile(book Lib[], int n)
{
    fp.open(Filename, ios::binary | ios::out);
    if (!fp) { cout << "\n Error in file \n"; exit(1); }
    fp.write((char*)Lib, sizeof(book) * n);
    fp.close();
}
void append()
{
    book b = { 0 };
    fp.open(Filename, ios::binary | ios::app);
    if (!fp) { cout << "\n Error in file \n"; exit(1); }
    cout << "\n Append one new book to library\n";
    b = input();
    fp.write((char*)&b, sizeof(book));
    fp.close();
}
void output(book Lib[], int n)
{
    int i, k = 0;
    cout << "\n \t Catalogue of books\n";
    for (i = 0; i < n; i++)
    {
        cout << "\n" << i + 1 << "\t" << Lib[i].avtor << " " << Lib[i].title;
        cout << " " << Lib[i].year << " " << Lib[i].catnum << " " << Lib[i].br << " " << Lib[i].nalich;

        k++; if (k % 5 == 0)cout << "\n \n  \n \n \n";
    }
}

int loadfile(book Lib[])
{
    long pos; int n = 0, i; book b;
    fp.open(Filename, ios::binary | ios::in);
    if (!fp) { cout << "\n file not exist\n"; return n; }

    fp.seekg(0l, ios::end);
    pos = fp.tellg();
    fp.close();
    n = pos / (sizeof(book));
    fp.open(Filename, ios::binary | ios::in);
    if (!fp) { cout << "\n Error in file \n"; exit(1); }
    for (i = 0; i < n; i++)
    {
        fp.read((char*)&b, sizeof(book));
        Lib[i] = b;
    }
    fp.close();
    return n;
}



void query(book Lib[], int n)
{
    int i, k = 0;
    cout << "\n \t Book published after 2020 year\n";
    for (i = 0; i < n; i++)
    {
        if (Lib[i].year >= 2020)
        {
            k++;
            cout << "\n" << i + 1 << "\t" << Lib[i].avtor << " " << Lib[i].title;
            cout << " " << Lib[i].year << " " << Lib[i].catnum << " " << Lib[i].br << " " << Lib[i].nalich;
        }
    }
    cout << "\n Number of books published after 2020 year is equal:" << k << endl;
}

int main()
{
    int choice, n = 0;
    book Lib[N];
    char ans = 'y';
    n = loadfile(Lib);
    do {
        choice = menu();
        switch (choice)
        {
        case 1:n = enter(Lib, n); saveinfile(Lib, n); break;
        case 2:do {
            append(); n++;
            if (n > N) { cout << "\n over size of array:"; break; }
            cout << "\n One more?[y/n]:";
            cin >> ans;
        } while (!(ans == 'N' || ans == 'n')); break;
        case 3:n = loadfile(Lib); output(Lib, n); break;
        case 4:break;
        case 5:break;
        case 6:break;
        case 7:n = loadfile(Lib); query(Lib, n); break;
        case 8:saveinfile(Lib, n); break;
        }
    } while (choice != 9);
}