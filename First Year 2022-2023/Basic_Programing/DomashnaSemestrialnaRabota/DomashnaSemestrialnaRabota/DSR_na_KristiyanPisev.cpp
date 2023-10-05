#include <iostream>
#include <string>
#include <iomanip>
#include <fstream>
using namespace std;

const int MAX_CURRENCY_TYPES_YOU_CAN_OWN = 50;


struct changer
{
	char currency_name[30];
	char iso_code[4];
	double sell_order;
	double buy_order;
	double available_amount;
	double max_trade_size;
	char is_it_tradeable[3];
};

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//A. Меню за избор на функциите от програмата
int menu()
{
	int choice_option;

	cout << " ===== Меню ===== " << endl;
	cout << "1. Добавяне на N на брой валути" << endl;
	cout << "2. Извеждане на екрана" << endl;
	cout << "3. Търсене и извеждане на екрана" << endl;
	cout << "4. Подреждане на валутите в намаляващ ред на предвидения от обменното бюро марж (разлика между курс продава и курс купува)" << endl;
	cout << "5. Управление на файл" << endl;
	cout << "6. Още търсене" << endl;
	cout << "7. Покупко-продажба на валута" << endl;
	cout << "8. Изход" << endl;

	do {
		cout << "Избери опция от менюто (1-8): ";
		cin >> choice_option;
		cout << endl;
	} while (choice_option < 1 || choice_option > 8);

	return choice_option;
}
int add_currency(changer currency_list[], int currency_counter);
changer add_currency_details();
void print_changer(int currency_counter, changer currency_list[]);
void searching_currency_with_low_amount(int currency_counter, changer currency_list[]);
void searching_currency_by_iso_code(int currency_counter, changer currency_list[]);
void sort_by_high_to_low_value(int currency_counter, changer currency_list[]);
fstream file_pointer;
void save_to_file(int currency_counter, changer currency_list[]);
int get_data_from_file(changer currency_list[]);
void second_menu(int currency_counter, changer currency_list[]);
void tradable_and_sorted(int currency_counter, changer currency_list[]);
void sorted_by_amount_and_per(int currency_counter, changer currency_list[]);
void buy_sell_currency(int currency_counter, changer currency_list[]);
void profit_BGN(int currency_counter, changer currency_list[], double k, double given_amount);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



//====================================================================================================================================================================================================
//							MAIN
int main()
{
	changer currency_list[MAX_CURRENCY_TYPES_YOU_CAN_OWN] = {};
	int currency_counter = 0;

	int choiced_option;
	int number_of_currency_you_have_added;
	currency_counter += get_data_from_file(currency_list);

	do {
		choiced_option = menu();
		switch (choiced_option)
		{
		case 1:
			number_of_currency_you_have_added = add_currency(currency_list, currency_counter);
			currency_counter += number_of_currency_you_have_added;
			break;
		case 2: print_changer(currency_counter, currency_list); break;
		case 3: searching_currency_with_low_amount(currency_counter, currency_list), searching_currency_by_iso_code(currency_counter, currency_list); break;
		case 4: sort_by_high_to_low_value(currency_counter, currency_list); break;
		case 5: save_to_file(currency_counter, currency_list); break;
		case 6: second_menu(currency_counter, currency_list); break;
		case 7: buy_sell_currency(currency_counter, currency_list);
		}
	} while (choiced_option != 8);

	if (choiced_option == 8)
	{
		save_to_file(currency_counter, currency_list);
	}
	system("pause");
}
//====================================================================================================================================================================================================


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//B.Добавяне на валути : a. Добавянето трябва да позволява да се въвеждат различен брой нови валути като се допълват в масива.Не трябва да превишава максималния брой поддържани валути (50).
int add_currency(changer currency_list[], int currency_counter)
{
	int number_of_currency_you_want_to_add; int input_try = 0;
	int space_for_more_currencies;

	if (currency_counter == MAX_CURRENCY_TYPES_YOU_CAN_OWN)
	{
		cout << endl << "Не могат да бъдат добавени още валути (лимитът е 50)" << endl;
		return 0;
	}
	else
	{
		space_for_more_currencies = MAX_CURRENCY_TYPES_YOU_CAN_OWN - currency_counter;
		cout << endl;
		cout << "Могат да бъдат добавени още [" << space_for_more_currencies << "] валути." << endl;
	}


	do {
		if (input_try > 0)
			cout << "Не може да въведете толкова валути!!!" << endl;
		cout << "Колко на брой нови валути да бъдат добавени? : ";
		cin >> number_of_currency_you_want_to_add;
		cout << endl;
		input_try++;
	} while (number_of_currency_you_want_to_add < 1 || number_of_currency_you_want_to_add > space_for_more_currencies);
	input_try = 0;

	for (int i = 0; i < number_of_currency_you_want_to_add; i++)
	{
		cout << "Нова валута N" << i + 1 << " данни:" << endl;
		cin.ignore();
		currency_list[currency_counter + i] = add_currency_details();
		cout << endl;
	}

	return number_of_currency_you_want_to_add;
}	changer add_currency_details()
{
	changer data = {};

	cout << "Име на валутата - ";
	cin.getline(data.currency_name, 30);
	cout << "ISO kод на валутата - ";
	cin >> data.iso_code;
	cout << "Kурс продава - ";
	cin >> data.sell_order;
	cout << "Курс купува - ";
	cin >> data.buy_order;
	cout << "Наличност - ";
	cin >> data.available_amount;
	cout << "Максимална сума за обмен при една транзакция - ";
	cin >> data.max_trade_size;
	cin.ignore();
	cout << "Търгува ли се (Да/Не) - ";
	cin >> data.is_it_tradeable;

	return data;
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//C.Извеждане на екрана: a. Извеждане на всички валути в оформен вид
void print_changer(int currency_counter, changer currency_list[])
{
	cout.setf(ios::fixed);
	cout.setf(ios::showpoint);

	cout << "--- Всички валути в change бюрото: ---" << endl; 
	cout.width(43);
	cout << right << "Име на валутата" << " | " << "ISO kод на валутата" << " | " << "Kурс продава" << " | " << "Курс купува" << " | " << "Наличност" << " | " << "Максимална сума за обмен при една транзакция" << " | " << "Търгува ли се" << " |" << endl;
	for (int i = 0; i < currency_counter; i++)
	{
		cout.width(30);
		cout << currency_list[i].currency_name << " | ";
		cout.width(19);
		cout << currency_list[i].iso_code << " | ";
		cout.width(12);
		cout << setprecision(2) << currency_list[i].sell_order << " | ";
		cout.width(11);
		cout << setprecision(2) << currency_list[i].buy_order << " | ";
		cout.width(9);
		cout << setprecision(2) << currency_list[i].available_amount << " | ";
		cout.width(44);
		cout << setprecision(2) << currency_list[i].max_trade_size << " | ";
		cout.width(13);
		cout << currency_list[i].is_it_tradeable << " |";
		cout << endl;
	}
	cout << endl;
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//D. Търсене и извеждане на екрана: a/b
//a.Намиране и извеждане на валутата с най - ниска наличност;
void searching_currency_with_low_amount(int currency_counter, changer currency_list[])
{
	int minimal_avaible_amount = 2147483647;
	string minimal_avaible_amount_target;

	for (int i = 0; i < currency_counter; i++)
	{
		if (currency_list[i].available_amount < minimal_avaible_amount)
		{
			minimal_avaible_amount = currency_list[i].available_amount;
			minimal_avaible_amount_target = currency_list[i].currency_name;
		}
	}
	cout << endl;
	cout << "Валутата с най-малка наличност е " << minimal_avaible_amount_target << "." << endl;
}
//b. Търсене и извеждане на валута по въведен от клавиатурата код по ISO.
void searching_currency_by_iso_code(int currency_counter, changer currency_list[])
{
	bool flag = false;
	string desire_iso_code;
	changer target_by_iso;

	cin.ignore();
	cout << "Въведете ISO кода на търсена от Вас валута: ";
	getline(cin, desire_iso_code);
	for (int i = 0; i < currency_counter; i++)
	{
		if (!desire_iso_code.compare(currency_list[i].iso_code))
		{
			cout.setf(ios::fixed);
			cout.setf(ios::showpoint);

			flag = true;
			target_by_iso = currency_list[i];
			cout << "ISO кода беше намеренa >>>\t";
			cout << endl;
			cout << "\tИме: " << currency_list[i].currency_name << " | Kурс продава: " << setprecision(2) << currency_list[i].sell_order
				<< " | Курс купува: " << setprecision(2) << currency_list[i].buy_order << " | Наличност: " << setprecision(2) << currency_list[i].available_amount
				<< " | Максимална сума за обмен при една транзакция: " << setprecision(2) << currency_list[i].max_trade_size << " | Търгува ли се: " << currency_list[i].is_it_tradeable;
			cout << endl;
		}
	}
	if (flag == false)
		cout << "Валута с този код не е открита." << endl;
	cout << endl;
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//E. Подреждане на основния масив с валути, без да се извежда на екрана: a. Подреждане на валутите в намаляващ ред на предвидения от обменното бюро марж (разлика между курс продава и курс купува)
void sort_by_high_to_low_value(int currency_counter, changer currency_list[])
{
	cout << endl;
	for (int i = 0; i < currency_counter - 1; i++)
	{
		for (int j = i + 1; j < currency_counter; j++)
		{
			if ((currency_list[i].sell_order - currency_list[i].buy_order) < (currency_list[j].sell_order - currency_list[j].buy_order))
			{
				changer temp = currency_list[i];
				currency_list[i] = currency_list[j];
				currency_list[j] = temp;
			}
		}
	}
	cout << "Сортирането е успешно по намаляваща разлика в копуването и продаването!" << endl;
	cout << endl;
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//F. Управление на файл: a/b
//a.Извеждане на масива с валути във файл(двоичен)
void save_to_file(int currency_counter, changer currency_list[])
{
	file_pointer.open("changer.bin", ios::binary | ios::out);
	if (file_pointer.fail())
	{
		cout << "Файлa не е намерен!" << endl;
		exit(1);
	}
	file_pointer.write((char*)currency_list, sizeof(changer) * currency_counter);
	cout << "Файлa е запазен!" << endl;
	cout << endl;
	file_pointer.close();
}
//b. Въвеждане на масива с валути от файл (двоичен)
int get_data_from_file(changer currency_list[])
{
	long pos;
	int n = 0;
	changer c;
	file_pointer.open("changer.bin", ios::binary | ios::in);
	if (file_pointer.fail())
	{
		cout << "Файлa не е намерен!" << endl; cout << endl; return n;
	}
	file_pointer.seekg(0l, ios::end);
	pos = file_pointer.tellg();
	file_pointer.close();
	n = pos / (sizeof(changer));
	file_pointer.open("changer.bin", ios::binary | ios::in);
	if (!file_pointer) { cout << "Файлa не е намерен!" << endl; exit(1); }
	for (int i = 0; i < n; i++)
	{
		if (i >= 50)
		{
			cout << "Лимитът на валути (50) беше достигнат!" << endl;
			break;
		}
		file_pointer.read((char*)&c, sizeof(changer));
		currency_list[i] = c;
	}
	file_pointer.close();
	return n;
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//G.Създайте подменю, в което се влиза от основното, с нови функции за :
void second_menu(int currency_counter, changer currency_list[])
{
	cout << "1. Извеждане на валутите, които се търгуват, в подреден ред по наименованието на валутата" << endl;
	cout << "2. Търсене и извеждане на валутите, чиято наличност е над въведена от клавиатурата стойност и чийто марж(разлика между курс продава и курс купува) е под въведен от клавиатурата процент." << endl;

	int choice_search;
	int input_try = 0;

	cout << endl;
	do
	{
		if (input_try > 0)
			cout << "Невалидна опция!!!" << endl;
		cout << "Изберете опция (1-2): ";
		cin >> choice_search;
		cout << endl;
		input_try++;
	} while (choice_search < 1 || choice_search > 2);
	input_try = 0;

	if (choice_search == 1)
	{
		tradable_and_sorted(currency_counter, currency_list);
	}
	else if (choice_search == 2)
	{
		sorted_by_amount_and_per(currency_counter, currency_list);
	}
}
//a. Извеждане на валутите, които се търгуват, в подреден ред по наименованието на валутата, без да се променя основния масив.
void tradable_and_sorted(int currency_counter, changer currency_list[])
{
	int skiped = 0;
	int n = currency_counter;
	bool inserted = false;
	changer tradable_and_sorted_new_currency_list[MAX_CURRENCY_TYPES_YOU_CAN_OWN] = { 0 };
	for (int i = 0; i < n; i++)
	{
		if (currency_list[i].is_it_tradeable[0] == 'D' && currency_list[i].is_it_tradeable[1] == 'a')
		{
			tradable_and_sorted_new_currency_list[i - skiped] = currency_list[i];
		}
		else
		{
			skiped++;
		}
	}
	n -= skiped;
	cout << endl;

	for (int i = 0; i < n - 1; i++)
	{
		for (int j = i + 1; j < n; j++)
		{
			if (tradable_and_sorted_new_currency_list[i].currency_name[0] > tradable_and_sorted_new_currency_list[j].currency_name[0])
			{
				changer temp = tradable_and_sorted_new_currency_list[i];
				tradable_and_sorted_new_currency_list[i] = tradable_and_sorted_new_currency_list[j];
				tradable_and_sorted_new_currency_list[j] = temp;
			}
		}
	}
	print_changer(n, tradable_and_sorted_new_currency_list);
	cout << endl;
}
//b. Търсене и извеждане на валутите, чиято наличност е над въведена от клавиатурата стойност и чийто марж(разлика между курс продава и курс купува) е под въведен от клавиатурата процент.
void sorted_by_amount_and_per(int currency_counter, changer currency_list[])
{
	int above_this_amount;
	cout << "Колко да е минималното количество? - ";
	cin >> above_this_amount;
	int per;
	cout << "Колко да е максималният процент разлика между курс продава и курс купува)? - ";
	cin >> per;
	cout << endl;

	int skiped = 0;
	int n = currency_counter;
	int new_n = 0;
	changer sorted_by_amount_and_per_new_currency_list[MAX_CURRENCY_TYPES_YOU_CAN_OWN] = {};
	for (int i = 0; i < n; i++)
	{
		if ((currency_list[i].available_amount > above_this_amount) && (per > ((currency_list[i].sell_order / currency_list[i].buy_order) - 1) * 100))
		{
			sorted_by_amount_and_per_new_currency_list[i - skiped] = currency_list[i];
			new_n++;
		}
		else
		{
			skiped++;
		}
	}

	n -= skiped;
	print_changer(new_n, sorted_by_amount_and_per_new_currency_list);
	cout << endl;
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//H.Покупко - продажба на валута(да се предвидят съответни позиции в менюто на програмата за извикването на тези функционалности).
void buy_sell_currency(int currency_counter, changer currency_list[])
{
	bool flag = false;
	string desire_iso_code;
	changer target_by_iso;
	cout.setf(ios::fixed);
	cout.setf(ios::showpoint);

	cin.ignore();
	cout << "Въведете ISO кода на търсена от Вас валута: ";
	getline(cin, desire_iso_code);
	for (int i = 0; i < currency_counter; i++)
	{
		if (!desire_iso_code.compare(currency_list[i].iso_code))
		{
			flag = true;
			if (currency_list[i].is_it_tradeable[0] == 'D' && currency_list[i].is_it_tradeable[1] == 'a')
			{
				double wanted_amount;
				double new_wanted_amount;
				double another_new_wanted_amount;
				string answer;
				target_by_iso = currency_list[i];
				double k = target_by_iso.sell_order;
				cout << "ISO кода беше намеренa >>>\t";
				cout << "Сума, която искате да закупите: ";
				cin >> wanted_amount;
				cout << endl;

				if (wanted_amount < target_by_iso.available_amount && wanted_amount < target_by_iso.max_trade_size)
				{
					currency_list[i].available_amount -= wanted_amount;
					profit_BGN(currency_counter, currency_list, k, wanted_amount);
					cout << "Сума е успешно закупена!" << endl;
					cout << endl;
				}
				else if (wanted_amount > target_by_iso.available_amount)
				{
					do {
						cout << "Превишено е количеството ни на валута (" << setprecision(2) << currency_list[i].available_amount << ")!!!" << endl;
						cout << "Искате ли да въведете нова сума? (Да/Не) - ";
						cin.ignore();
						cin >> answer;
						if (answer == "Da")
						{
							cout << "Въведете нова количествена сума: ";
							cin >> new_wanted_amount;
							cout << endl;
						}
						else if (answer == "Ne")
						{
							exit(1);
						}
					} while (new_wanted_amount < 0.01 || new_wanted_amount > currency_list[i].available_amount);
					cout << endl;

					if (new_wanted_amount > target_by_iso.max_trade_size)
					{
						do {
							cout << "Превишен е търговия лимит (" << setprecision(2) << currency_list[i].max_trade_size << ")!!!" << endl;
							cout << "Искате ли да въведете нова сума? (Да/Не) - ";
							cin.ignore();
							cin >> answer;
							if (answer == "Da")
							{
								cout << "Въведете нова търгова сума: ";
								cin >> another_new_wanted_amount;;
								cout << endl;
							}
							else if (answer == "Ne")
							{
								exit(1);
							}
						} while (another_new_wanted_amount < 0.01 || another_new_wanted_amount > currency_list[i].max_trade_size);
						cout << endl;
						currency_list[i].available_amount -= another_new_wanted_amount;
						profit_BGN(currency_counter, currency_list, k, another_new_wanted_amount);
						cout << "Сума е успешно закупена!" << endl;
						cout << endl;
					}
					else
					{
						currency_list[i].available_amount -= new_wanted_amount;
						profit_BGN(currency_counter, currency_list, k, new_wanted_amount);
						cout << "Сума е успешно закупена!" << endl;
						cout << endl;
					}
				}
				else if (wanted_amount < target_by_iso.available_amount && wanted_amount > target_by_iso.max_trade_size)
				{
					do {
						cout << "Превишен е търговия лимит (" << setprecision(2) << currency_list[i].max_trade_size << ")!!!" << endl;
						cout << "Искате ли да въведете нова сума? (Да/Не) - ";
						cin.ignore();
						cin >> answer;
						if (answer == "Da")
						{
							cout << "Въведете нова търгова сума: ";
							cin >> new_wanted_amount;
							cout << endl;
						}
						else if (answer == "Ne")
						{
							exit(1);
						}
					} while (new_wanted_amount < 0.03 || new_wanted_amount > currency_list[i].max_trade_size);
					cout << endl;

					currency_list[i].available_amount -= new_wanted_amount;
					profit_BGN(currency_counter, currency_list, k, new_wanted_amount);
					cout << "Сума е успешно закупена!" << endl;
					cout << endl;
				}
			}
			else
			{
				cout << "Валутата не се търгува!" << endl;
				cout << endl;
			}
		}
	}
	if (flag == false)
		cout << "Обменното бюро не работи с подобна валута." << endl;
	cout << endl;
}void profit_BGN(int currency_counter, changer currency_list[], double k, double given_amount)
{
	string BGN_iso_code = "BGN";
	for (int i = 0; i < currency_counter; i++)
	{
		if (!BGN_iso_code.compare(currency_list[i].iso_code))
		{
			currency_list[i].available_amount += k * given_amount;
			break;
		}
	}
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
