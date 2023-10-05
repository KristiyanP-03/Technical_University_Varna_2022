/*
#include <iostream>
#include "HelloF.h"
using namespace std;

int main() {
	cout << "Console say hello, plz!" << endl;
	say_hello();

	int result = 5.9;
	cout << result;
}
*/

/*
#include <iostream>
#include <string>
using namespace std;

string check(int& x, int y);

int main() {
	int a = 5;
	int b = 6;
	string answer = check(a, b);
	cout << answer << a;
}

string check(int& x, int y)
{
	if (x < y)
	{
		x *= 10;
		return "Number a is smaller. So after incremating a now is: ";
	}
}
*/
/*
#include <iostream>
using namespace std;
void fill_up(int arrayto[], int size)
{
for (int i = 0; i < size; i++)
	{
		cin >> arrayto[i];
	}
}
int main()
{
	int arrayA[3];
	fill_up(arrayA, 3);
	for (int i = 0; i < sizeof(arrayA) / sizeof(int); i++)
	{
		cout << arrayA[i];
	}
}
*/
/*
#include <iostream>
using namespace std;
int main()
{
	int ar[6] = { -20, 30, -80, 400, 7, -5 }; bool flag = true;
	for (int i = 0; i < 6 - 1; i++)
	{
		if (flag == false)break;
		else flag = false;
		for (int j = i + 1; j < 6; j++)
		{
			if (ar[i] > ar[j])
			{
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;

				flag = true;
			}
		}
	}

	for (int i = 0; i < 6; i++)
	{
		cout << ar[i] << endl;
	}
}
*/
/*
#include <iostream>
using namespace std;
int main()
{
	char array[10] = { 'V', 'a', 'r', 'n', 'a', '0', '_', '_', '_', '_' };
	for (int i = 0; i < 10; i++)
	{
		cout << array[i] << endl;
	}
	
}*/
/*
#include <iostream>
#include <string>
#include <fstream>
using namespace std;
int main()
{
	ofstream f;
	f.open("d.txt");
	f << "da";
	f.close();
	system("notepad /p d.txt");
	cout << "printing";
}
*/
/*
#include <iostream>
#include <string>
#include <fstream>
using namespace std;
int main()
{
	// create a file buf, and open it on a file named "your_output.txt":
	basic_filebuf<char, char_traits<char> > b;
	b.open("your_output.txt", ios_base::out);

	// connect `std::cout` to the chosen file via our file_buf:
	cout.rdbuf(&b);

	// write some output (which shouldn't show up on screen.
	cout << "This is some junk";
	return 0;
}
*/
/*
#include <iostream>
#include <string>
#include <fstream>
using namespace std;
int main()
{
	int a = 10;
	cout << a;
	int* address;
	int stoinost = 10;
	address = &stoinost;
	cout << *address;
	
}
*/

#include <iostream>
#include <string>
#include <iomanip> 
#include <conio.h>
#include <fstream>

//#define PI 3.14; const float Pi = 3.14;
using namespace std;

struct Date
{
	int day;
	int month;
	int year;
};
struct Person
{
	char name[20];
	Date birthday;
};

int main()
{
	/*
	Person book[1] = {};
	Person dude_1 = {};
	cin.getline(dude_1.name, 20);
	cin >> dude_1.birthday.day;
	cin >> dude_1.birthday.month;
	cin >> dude_1.birthday.year;
	book[0] = dude_1;

	for (int i = 0; i < 1; i++)
	{
		cout << book[i].name << endl; 
		cout << book[i].birthday.day << endl;
		cout << book[i].birthday.month << endl;
		cout << book[i].birthday.year << endl;
	}
	*/
	//char a = _getch(); // _getche(); getchar();
	//_putch(a);
	//exit(0);
	

	system("microsoftedge http://www.google.com");
	
	//int a = 1; int b(2);
	//cout << a << " " << b;

	// Scientific/Експоненциален format 1.27e10/2.56e-10 където е е основоа на степента, а степента е числото след е
	
	/*
	int a;
	scanf_s("%i", &a);
	printf("a is: %i", a);
	*/

	//string school_name = "\"Петър берон\""; cout << school_name;
	
	/*
	float a = 2.3567123124;
	float b = 3.1381142214;
	cout.setf(ios::fixed);
	cout.setf(ios::right);
	cout.setf(ios::showpos);
	cout << setprecision(2) << setw(10) << a << endl;
	cout.width(10);
	cout << b;
	cout.unsetf(ios::right);
	*/

	/*
	char ch = 'z';
	int char_code = 0;
	while (ch != '0')
	{
		ch = getchar();
		char_code = int(ch);
		cout << "Code of this character is: " << char_code << endl;
		if (char_code >= 97 && char_code <= 122)
		{
			cout << "The uppercase of this character is: " << char(char_code - 32) << endl;
		}
		ch = getchar();
	}
	*/

	/*
	char ch;
	cin.get(ch);
	cout.put(ch);
	*/
	
	/*
	char a[4] = "abc";
	char reversed_a[4];
	int index = 0;
	for (int i = strlen(a)-1; i >= 0; i--)
	{
		reversed_a[index] = a[i];
		index++;
	}
	for (int i = 0; i < strlen(reversed_a)-1; i++)
	{
		cout << reversed_a[i];
	}
	*/
	
}
/*
#include <iostream>
#include <string>
#include <fstream>
using namespace std;
int main()
{
	ifstream get_from_file;
	ofstream write_to_file;

	int ar[3] = { 3251, 1325, 3754 };
	int ar2[3] = {};

	write_to_file.open("file.txt");
	for (int i = 0; i < 3; i++)
	{
		write_to_file << ar[i] << endl;
	}
	write_to_file.close();

	get_from_file.open("file.txt");
	for (int i = 0; i < 3; i++)
	{
		get_from_file >> ar2[i];
	}
	get_from_file.close();

	for (int i = 0; i < 3; i++)
	{
		cout << ar2[i] << endl;
	}
}
*/
