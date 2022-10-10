#include <iostream>
using namespace std;


int main()
{
	// zad 1
	/* 
	cout << "Hello world" << endl;
	*/

	// zad 2
	/* 
	char name[20], Sp[5];
	long FN;
	char ans;
	int course, group;
	cout << "\n What's your name:";
	cin.getline(name, 20);
	cout << "\n Wallcome to TU - Varna " << name << endl;
	cout << "\n What's your major:";
	cin >> Sp;
	cout << Sp << " is the best choice for you\n";
	cout << "\n Faculty number:";
	cin >> FN;
	cout << "\n Don't forget your it: " << FN << " is important feature of every student" << endl;
	cout << "\n Which year student are you:";
	cin >> course;
	cout << "\ you are absolute beginner - first year student" << endl;
	cout << "\n Number of group:";
	cin >> group;
	cout << group << " is the funniest group - enjoy the class" << endl;
	cout << "\n Are you a girl [y/n]:";
	cin >> ans;
	if (ans == 'y' || ans == 'Y')
		cout << "female" << endl;
	else
		cout << "male" << endl;
	*/

	//zad 3
	/*
	float a, b, c, d, f;
	cout << "\n a=";
	cin >> a;
	cout << "\n b=";
	cin >> b;
	cout << "\n c=";
	cin >> c;
	d = (a + b) / a - c / (a - b);
	cout << "\n Result d=" << d << endl;
	f = (3 + 4 * a) / (4 - 2 * c) + ((8 - a * a) * (4 + 2 * c)) / (b - c);
	cout << "\n f=" << f << endl;
	*/

	// moq zad 1
	/*
	double grade;
	cin >> grade;
	if (grade <= 2.99)
	{
		cout << "Poor" << endl;
	}
	else if (grade >= 3.00 && grade <= 3.49)
	{
		cout << "bad" << endl;
	}
	else if (grade >= 3.50 && grade <= 4.49)
	{
		cout << "Good" << endl;
	}
	else if (grade >= 4.50 && grade <= 5.49)
	{
		cout << "Very Good" << endl;
	}
	else if (grade >= 5.50 && grade <= 6.00)
	{
		cout << "Execllent" << endl;
	}
	else
	{
		cout << "Invalid grade" << endl;
	}
	*/

	// moq zad 2
	string shape;
	cin >> shape;
	double weight;
	double height;
	double radius;
	double area;
	if (shape == "square")
	{
		cin >> weight;
		area = weight * weight;
	}
	else if (shape == "rectangle")
	{
		cin >> weight;
		cin >> height;
		area = weight * height;
	}
	else if (shape == "circle")
	{
		cin >> radius;
		area = 3.14 * (radius * radius);
	}
	else if (shape == "triangle")
	{
		cin >> weight;
		cin >> height;
		area = (weight * height) / 2;
	}
	else
	{
		cout << "Invalid shape!" << endl;
		return 0;
	}
	cout << area << endl;
}
