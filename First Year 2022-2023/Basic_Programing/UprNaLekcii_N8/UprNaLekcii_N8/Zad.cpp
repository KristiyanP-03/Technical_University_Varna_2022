#include<iostream>
using namespace std;
const int DECLARED_SIZE = 20;

void fill_array(int a[], int size, int& number_used);
int search(const int a[], int number_ussed, int target);

int main()
{
	int arr[DECLARED_SIZE], list_size, target;
	fill_array(arr, DECLARED_SIZE, list_size);
	char ans;
	int result;
	do {
		cout << "Enter a number to search for: ";
		cin >> target;
		result = search(arr, list_size, target);
		if (result == -1)
			cout << target << "is not on the list.\n";
		else
			cout << target << "is stored in array position" << result << endl << "(Remember: The first position is 0.\n";
		cout << "Search again?(y/n followed by Return): ";
		cin >> ans;
	} while ((ans != 'n') && (ans != 'N'));
	cout << "End of program.\n";
	return 0;
}