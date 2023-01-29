#include <iostream>
#include <fstream>
#include <string>
#include <iomanip> //biblioteki

using namespace std;

struct participant //struktira
{
	int number;
	string name;
	int age;
	string gender;
	double hip;
	double shoulder;
	double neck;
	double calf;
};

void add(participant*& arr, int& size) //funkciq za dobawqne na uchastnik
{
	cout << "How many participants: ";
	int n;
	cin >> n;
	if (n + size > 30)
	{
		cout << "The maximum number of participants is 30" << endl;
		return;
	}
	participant* temp = new participant[size + n];
	for (int i = 0; i < size; i++)
	{
		temp[i] = arr[i];
	}
	delete[] arr;
	arr = temp;
	for (int i = size; i < size + n; i++)
	{
		cout << "Enter the number of participant: ";
		cin >> arr[i].number;
		cout << "Enter the name of participant: ";
		cin >> arr[i].name;
		cout << "Enter the age of participant: ";
		cin >> arr[i].age;
		cout << "Enter the gender of participant: ";
		cin >> arr[i].gender;
		cout << "Enter the hip of participant: ";
		cin >> arr[i].hip;
		cout << "Enter the shoulder of participant: ";
		cin >> arr[i].shoulder;
		cout << "Enter the neck of participant: ";
		cin >> arr[i].neck;
		cout << "Enter the calf of participant: ";
		cin >> arr[i].calf;
	}
	size += n;
}

void display(participant* arr, int size) // izvejdane na uchastnicite
{
	cout << setw(10) << "Number" << setw(10) << "Name" << setw(10) << "Age" << setw(10) << "Gender" << setw(10) << "Hip" << setw(10) << "Shoulder" << setw(10) << "Neck" << setw(10) << "Calf" << endl;
	for (int i = 0; i < size; i++)
	{
		cout << setw(10) << arr[i].number << setw(10) << arr[i].name << setw(10) << arr[i].age << setw(10) << arr[i].gender << setw(10) << arr[i].hip << setw(10) << arr[i].shoulder << setw(10) << arr[i].neck << setw(10) << arr[i].calf << endl;
	}
}

void search_display_youngest_contestant(participant* arr, int size) // funkciq za namirane na nai-malkiq uchastnik
{
	int min = arr[0].age;
	for (int i = 1; i < size; i++)
	{
		if (arr[i].age < min)
		{
			min = arr[i].age;
		}
	}
	cout << setw(10) << "Number" << setw(10) << "Name" << setw(10) << "Age" << setw(10) << "Gender" << setw(10) << "Hip" << setw(10) << "Shoulder" << setw(10) << "Neck" << setw(10) << "Calf" << endl;
	for (int i = 0; i < size; i++)
	{
		if (arr[i].age == min)
		{
			cout << setw(10) << arr[i].number << setw(10) << arr[i].name << setw(10) << arr[i].age << setw(10) << arr[i].gender << setw(10) << arr[i].hip << setw(10) << arr[i].shoulder << setw(10) << arr[i].neck << setw(10) << arr[i].calf << endl;
		}
	}
}

void search_name(participant* arr, int size) //funkciq za tursene na uchastnik po ime
{
	string name;
	cout << "Enter the name of participant: ";
	cin >> name;
	cout << setw(10) << "Number" << setw(10) << "Name" << setw(10) << "Age" << setw(10) << "Gender" << setw(10) << "Hip" << setw(10) << "Shoulder" << setw(10) << "Neck" << setw(10) << "Calf" << endl;
	for (int i = 0; i < size; i++)
	{
		if (arr[i].name == name)
		{
			cout << setw(10) << arr[i].number << setw(10) << arr[i].name << setw(10) << arr[i].age << setw(10) << arr[i].gender << setw(10) << arr[i].hip << setw(10) << arr[i].shoulder << setw(10) << arr[i].neck << setw(10) << arr[i].calf << endl;
		}
	}
}

void sort(participant* arr, int size) // funkciq za sortirane bez izwejdane na ekran
{
	for (int i = 0; i < size - 1; i++)
	{
		for (int j = 0; j < size - i - 1; j++)
		{
			if (arr[j].age > arr[j + 1].age)
			{
				participant temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
}

void outputToFile(participant* arr, int size) //funkciq za zapazvane vuv fail
{
	ofstream outFile("participants.bin", ios::binary);

	if (outFile.is_open())
	{
		outFile.write((char*)&size, sizeof(int));

		for (int i = 0; i < size; i++)
		{
			outFile.write((char*)&arr[i].number, sizeof(int));
			outFile.write((char*)&arr[i].name, sizeof(string));
			outFile.write((char*)&arr[i].age, sizeof(int));
			outFile.write((char*)&arr[i].gender, sizeof(string));
			outFile.write((char*)&arr[i].hip, sizeof(double));
			outFile.write((char*)&arr[i].shoulder, sizeof(double));
			outFile.write((char*)&arr[i].neck, sizeof(double));
			outFile.write((char*)&arr[i].calf, sizeof(double));
		}

		outFile.close();
		cout << "Data saved to file." << endl << endl;
	}
	else
	{
		cout << "Error opening file!" << endl << endl;
	}
}

void inputFromFile(participant*& arr, int& size) //funkciq za prochitane ot fail
{
	ifstream inFile("participants.bin", ios::binary);

	if (inFile.is_open())
	{
		inFile.read((char*)&size, sizeof(int));

		arr = new participant[size];

		for (int i = 0; i < size; i++)
		{
			inFile.read((char*)&arr[i].number, sizeof(int));
			inFile.read((char*)&arr[i].name, sizeof(string));
			inFile.read((char*)&arr[i].age, sizeof(int));
			inFile.read((char*)&arr[i].gender, sizeof(string));
			inFile.read((char*)&arr[i].hip, sizeof(double));
			inFile.read((char*)&arr[i].shoulder, sizeof(double));
			inFile.read((char*)&arr[i].neck, sizeof(double));
			inFile.read((char*)&arr[i].calf, sizeof(double));
		}
		inFile.close();
		cout << "Data loaded from file." << endl << endl;
	}
	else
	{
		cout << "Error opening file!" << endl << endl;
	}
}


void sort_by_age_name(participant* arr, int size) // funkciq za sortirane po godini i ime
{
	for (int i = 0; i < size; i++) {
		for (int j = 0; j < size; j++) {
			if (arr[i].age < arr[j].age) {
				participant temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}
			else if (arr[i].age == arr[j].age) {
				if (arr[i].name < arr[j].name) {
					participant temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
	}
	for (int i = 0; i < size; i++)
	{
		cout << setw(10) << arr[i].number << setw(10) << arr[i].name << setw(10) << arr[i].age << setw(10) << arr[i].gender << setw(10) << arr[i].hip << setw(10) << arr[i].shoulder << setw(10) << arr[i].neck << setw(10) << arr[i].calf << endl;
	}
}

void search_age_gender(participant* arr, int size) // funkciq za tursene po godini i pol
{
	int age;
	string gender;
	cout << "Search by age and gender: " << endl;
	cin >> age;
	cin >> gender;

	for (int i = 0; i < size; i++) {
		if (arr[i].age == age && arr[i].gender == gender) {
			cout << setw(10) << arr[i].number << setw(10) << arr[i].name << setw(10) << arr[i].age << setw(10) << arr[i].gender << setw(10) << arr[i].hip << setw(10) << arr[i].shoulder << setw(10) << arr[i].neck << setw(10) << arr[i].calf << endl;
		}
	}
}
void printContestants(participant arr[], int size) // izwejdane na spisuk s uchastnicite po kategoriq
{
	for (int i = 0; i < size; i++)
	{
		cout << arr[i].number << " " << arr[i].name << " " << arr[i].age << " " << arr[i].gender << " " << arr[i].hip << " " << arr[i].shoulder << " " << arr[i].neck << " " << arr[i].calf << endl;
	}
}

void printContestantsByAge(participant arr[], int size) // razdelqne na uchastnicite po vuzrastovi grupi
{
	participant contestantsByAge[30];
	int sizeByAge = 0;
	for (int i = 0; i < size; i++)
	{
		if (arr[i].age >= 14 && arr[i].age <= 16)
		{
			contestantsByAge[sizeByAge] = arr[i];
			sizeByAge++;
		}
	}
	if (sizeByAge == 0)
	{
		cout << "No contestants in this age category!" << endl;
	}
	else
	{
		cout << "Contestants in age category I (14-16):" << endl;
		printContestants(contestantsByAge, sizeByAge);
	}
	sizeByAge = 0;
	for (int i = 0; i < size; i++)
	{
		if (arr[i].age >= 17 && arr[i].age <= 19)
		{
			contestantsByAge[sizeByAge] = arr[i];
			sizeByAge++;
		}
	}
	if (sizeByAge == 0)
	{
		cout << "No contestants in this age category!" << endl;
	}
	else
	{
		cout << "Contestants in age category II (17-19):" << endl;
		printContestants(contestantsByAge, sizeByAge);
	}
	sizeByAge = 0;
	for (int i = 0; i < size; i++)
	{
		if (arr[i].age >= 20 && arr[i].age <= 22)
		{
			contestantsByAge[sizeByAge] = arr[i];
			sizeByAge++;
		}
	}
	if (sizeByAge == 0)
	{
		cout << "No contestants in this age category!" << endl;
	}
	else
	{
		cout << "Contestants in age category III (20-22):" << endl;
		printContestants(contestantsByAge, sizeByAge);
	}
	sizeByAge = 0;
	for (int i = 0; i < size; i++)
	{
		if (arr[i].age >= 23 && arr[i].age <= 25)
		{
			contestantsByAge[sizeByAge] = arr[i];
			sizeByAge++;
		}
	}
	if (sizeByAge == 0)
	{
		cout << "No contestants in this age category!" << endl;
	}
	else
	{
		cout << "Contestants in age category IV (23-25):" << endl;
		printContestants(contestantsByAge, sizeByAge);
	}
}

void printWinner(participant arr[], int size) // funkciq za opredelqne na pobeditelq
{
	participant winner;
	double maxP = 0;
	for (int i = 0; i < size; i++)
	{
		double P = arr[i].hip / (arr[i].neck + arr[i].shoulder + arr[i].calf);
		if (P >= 0.54 && P <= 0.62)
		{
			if (P > maxP)
			{
				maxP = P;
				winner = arr[i];
			}
		}
	}
	if (maxP == 0)
	{
		for (int i = 0; i < size; i++)
		{
			double P = arr[i].hip / (arr[i].neck + arr[i].shoulder + arr[i].calf);
			if (P > 0.63)
			{
				if (P < maxP)
				{
					maxP = P;
					winner = arr[i];
				}
			}
		}
		if (maxP == 0)
		{
			for (int i = 0; i < size; i++)
			{
				double P = arr[i].hip / (arr[i].neck + arr[i].shoulder + arr[i].calf);
				if (P < 0.53)
				{
					if (P > maxP)
					{
						maxP = P;
						winner = arr[i];
					}
				}
			}
		}
	}
	cout << "The winner is " << winner.name << " with P = " << maxP << endl;
}

int MAINmenu() // osnovno menu
{
	int c;
	cout << "\n \t Menu";
	cout << "\n 1. Add new participants";
	cout << "\n 2. Display participants";
	cout << "\n 3. Search and Display youngest participants";
	cout << "\n 4. Search by name";
	cout << "\n 5. Sort participants by ascending order by their age";
	cout << "\n 6. Output the array to a file";
	cout << "\n 7. Entering the array from a file";
	cout << "\n 8. More options";
	do {
		cout << "\n Your choice is: ";
		cin >> c;
	} while (c < 1 || c>8);
	return c;
}

char Seconmenu() // podmenu
{
	int a;
	cout << "\n \t Choose an option:";
	cout << "\n 9. Sort all participants by age and name";
	cout << "\n 10. Search participant by age and gender";
	cout << "\n 11. Print participants by category";
	cout << "\n 12. Print participants by age";
	cout << "\n 13. Print winner";
	cout << "\n 14. Exit";
	do {
		cout << "\n Your choice is: ";
		cin >> a;
	} while (a < 9 || a>14);
	return a;
}

int main()
{
	participant* arr = new participant[0];
	int size = 0;
	int ch;
	bool running = true;
	do {
		ch = MAINmenu();
		switch (ch)
		{
		case 1:cout << "1. Add" << endl;
			add(arr, size); break;
		case 2:cout << "2. Display" << endl;
			display(arr, size); break;
		case 3:cout << "3. Search and Display youngest contestant" << endl;
			search_display_youngest_contestant(arr, size); break;
		case 4:cout << "4. Search by name" << endl;
			search_name(arr, size); break;
		case 5:cout << "5. Sort" << endl;
			sort(arr, size); break;
		case 6:cout << "6. Output" << endl;
			outputToFile(arr, size); break;
		case 7:cout << "7. Input" << endl;
			inputFromFile(arr, size); break;
		case 8:cout << "More options" << endl;
			do {
				ch = Seconmenu();
				switch (ch)
				{
				case 9:cout << "\n 9. Order on age and name" << endl;
					sort_by_age_name(arr, size); break;
				case 10:cout << "\n 10. Search by age and gender" << endl;
					search_age_gender(arr, size); break;
				case 11:cout << "\n 11. Participants by category" << endl;
					printContestants(arr, size); break;
				case 12:cout << "\n 12. Participants by age" << endl;
					printContestantsByAge(arr, size); break;
				case 13:cout << "\n 13. Print winner" << endl;
					printWinner(arr, size); break;
				case 14:cout << "\n 14. Exit" << endl;
					running = false;
					return 0;
					break;
				}
			} while (ch != 8);

		}
	} while (running);
	return 0;
}