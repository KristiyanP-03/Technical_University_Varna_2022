//1 zad: n!
/*
#include <iostream>
using namespace std;

void fact(int n, int &sum)
{
	if (n == 0)
		return;
	cout << n << " ";
	sum *= n;
	fact(n - 1, sum);
}

int main()
{
	int n;
	int sum = 1;
	cout << "Enter n as n! : ";
	cin >> n;
	cout << endl;
	cout << "Output: ";
	fact(n, sum);
	cout << sum;
}
*/

//2 zad: fibonachi
/*
#include <iostream>
using namespace std;

int fib (int i)
{
	if (i<1)return 0;
	if (i==1)return 1;
	return fib(i-1)+fib(i-2);
}

int main()
{
	int n;
	cout<<"n=";
	cin>>n;
	for (int j=0; j<n; j++)
		cout<<fib(j)<<"  ";
	return 0;
}
*/

//3 zad: Matrica
#include <iostream>
using namespace std;

int main()
{
	const int size = 5;

	int a[size][size];

	for (int i = 0; i < size; i++)
	{
		cout << "Enter a[" << i << "]: ";
		for (int j = 0; j < size; j++)
		{
			cin >> a[i][j];
		}
	}

	int x;
	int y;
	

	int count_of_1 = 0;
	while(true)
	{
		cout << "Enter location (\"x y\"): ";
		cin >> x;
		cin >> y;

		if (a[x][y] == 1)
		{
			cout << "Good job, you hit 1!";
			cout << endl;
		}

		else
		{
			cout << "Ops, you hit 0!";
			break;
		}
	}
	/*
	cout << "The matrix is:" << endl;
	for (int i = 0; i < size; i++)
	{
		for (int j = 0; j < size; j++)
			cout << a[i][j] << " ";
		cout << endl;
	}
	*/
	return 0;
}
