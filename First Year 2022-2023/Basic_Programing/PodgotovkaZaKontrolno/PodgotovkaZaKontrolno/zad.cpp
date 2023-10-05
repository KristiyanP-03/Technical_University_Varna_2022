#include <iostream>
#include <iomanip>
using namespace std;

int input(int A[])
{
	int K;

	do
	{
		cout << "Give valid array lenght (between 1 and 20): ";
		cin >> K;
	} while (K < 1 || K > 20);

	for (int i = 0; i < K; i++)
	{
		cout << "\nAdd value/number to you array A[ on index " << i << " ] = ";
		cin >> A[i];
	}

	return K;
}


int copy(int K, int A[], int AN[])
{
	int even_numbers_count = 0;

	for (int i = 0; i < K; i++)
	{
		if (A[i] % 2 == 0)
		{
			AN[i] = A[i];
			even_numbers_count++;
		}
	}

	return even_numbers_count;
}

float average(int AN_K, int AN[], int* sum_of_even_num)
{
	float avg = 0.00;

	for (int i = 0; i < AN_K; i++)
	{
		sum_of_even_num += AN[i];
	}

	return avg;
}


void output(int K, int A[], int AN_K, int AN[], float avg)
{
	cout << "Elemnts in array A[ ";
	for (int i = 0; i < K; i++)
	{
		cout << A[i] << " ";
	}
	cout << "]" << endl;

	cout << "Elemnts in array AN[ ";
	for (int i = 0; i < AN_K; i++)
	{
		cout << AN[i] << " ";
	}
	cout << "]" << endl;

	cout << "Average sum of all even nums in array AN: " << fixed << setprecision(2) << avg << endl;
}

int main()
{
	int A[30];
	int AN[30];
	int* sum_of_even_num = 0;

	int K = input(A);
	int AN_K = copy(K, A, AN);
	float avg = average(AN_K, AN, sum_of_even_num);
	output(K, A, AN_K, AN, avg);

	system("pause");
}


