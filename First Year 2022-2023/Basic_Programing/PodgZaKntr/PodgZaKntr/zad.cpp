#include <iostream>
#include <string>
#include <fstream>
using namespace std;

const int Phonebook_Max_Size = 30;

struct contact
{
	string nickname;
	string first_name;
	string last_name;
	string phonenumber;
	int phone_bill;
};

int input(contact phonebook[]);
contact current_contact();
void output(int contacts_count, contact phonebook[]);
fstream file_pointer;

int main()
{
	contact phonebook[Phonebook_Max_Size];
	int contacts_count;

	contacts_count = input(phonebook);
	output(contacts_count, phonebook);
}

int input(contact phonebook[])
{

	int contacts_count;
	do {
		cout << "How many contacts you want to add (max 30): ";
		cin >> contacts_count;
	} while (contacts_count < 0 || contacts_count > 10);

	for (int i = 0; i < contacts_count; i++)
	{
		cout << "\nYour contact " << i + 1 << " info:" << endl;
		cout << "==================" << endl;
		phonebook[i] = current_contact();
	}
	
	
	for (int i = 0; i < contacts_count; i++)
	{
		for (int j = i + 1; j < contacts_count; j++)
		{
			if (phonebook[i].phone_bill < phonebook[j].phone_bill)
			{
				contact temp = {};
				temp = phonebook[i];
				phonebook[i] = phonebook[j];
				phonebook[j] = temp;
			}
		}
		
	}

	int user = 0;
	file_pointer.open("phonebook.txt", ios::out);

	for (int i = 0; i < contacts_count; i++)
	{
		user++;

		if (!file_pointer) 
		{
			cout << "File not openned!";
		}
		else 
		{
			cout << "File created successfully!";

			file_pointer << "Contact " << user << " :" << endl;
			file_pointer << phonebook[i].nickname;
			file_pointer << phonebook[i].first_name;
			file_pointer << phonebook[i].last_name;
			file_pointer << phonebook[i].phonenumber;
			file_pointer << phonebook[i].phone_bill;
		}
	}
	file_pointer.close();

	return contacts_count;
}

contact current_contact()
{
	
	cout << "\n";

	contact data = {};
	cout << "How the person is called: ";
	cin >> data.nickname;
	cout << "First name: ";
	cin >> data.first_name;
	cout << "Last name: ";
	cin >> data.last_name;
	cout << "Phone number: ";
	cin >> data.phonenumber;
	cout << "He/She has to pay: ";
	cin >> data.phone_bill;

	return data;
}

void output(int contacts_count, contact phonebook[])
{
	cout << "\n" << "\n" << endl;

	cout << "--- Your contacts (array) ---" << endl;
	for (int i = 0; i < contacts_count; i++)
	{
		cout << "Contact " << i + 1 << ": " << phonebook[i].nickname << endl;
		cout << "First name: " << i + 1 << ": " << phonebook[i].first_name << endl;
		cout << "Last name: " << i + 1 << ": " << phonebook[i].last_name << endl;
		cout << "Phone number: " << i + 1 << ": " << phonebook[i].phonenumber << endl;
		cout << "Bill: " << i + 1 << ": " << phonebook[i].phone_bill << endl;
		cout << endl;
	}

	cout << "\n" << "\n" << endl;

	cout << "--- Your phonebook (file) ---" << endl;
	char line;
	file_pointer.open("phonebook.txt", ios::in);
	while (!file_pointer.eof()) {
		file_pointer >> line;
		cout << line;
	}
	file_pointer.close();
	cout << endl;
}