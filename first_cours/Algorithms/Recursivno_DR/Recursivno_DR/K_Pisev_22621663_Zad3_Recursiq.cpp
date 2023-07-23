/*
Задача 3.
Да се състави програма, която генерира символен низ с дължина N(N <= 100), 
образуван  от  буквите  ‘А’, ‘B’  и  ‘C’  и  несъдържащ  два  идентични  съседни  подниза. 
(Например, за  N = 6  такъв  низ  е  ‘АВАСАВ’.Низовете  ‘ААВАСА’, ‘АВСВСА’  и ‘АВСАВС’ са грешни).
Програмата да се реализира с рекурсия(задължително на С++).
*/

#include <iostream>
using namespace std;
int randomizer = 1 + (rand() % 5);

void recursivna_funkciq(int &n, string &sinvolniqt_niz)
{
	
	if (n == 0) return;

	sinvolniqt_niz += 'A';
	n--;

	if (n == 0) return;

	switch (randomizer % 2)
	{
		case 0:
			sinvolniqt_niz += 'B';
			n--; 
			randomizer++;
			break;
		case 1:
			sinvolniqt_niz += 'C';
			n--;
			randomizer++;
	}

	
	recursivna_funkciq(n, sinvolniqt_niz);
}


int main()
{
	int n;
	string sinvolniqt_niz;

	do
	{
		cout << "Input N (n <= 100): ";
		cin >> n;
	} while (n > 100 && n < 0);
	cout << endl;

	recursivna_funkciq(n, sinvolniqt_niz);

	cout << sinvolniqt_niz;
}