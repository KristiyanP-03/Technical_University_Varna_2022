#include <iostream> 
using namespace std;

struct elem
{
    int key;
    elem* next;
} *start;


void add_element(int n)
{
    elem* p = new elem;
    p->key = n;
    p->next = start;
    start = p;
}
void print_elements()
{
    elem* p = start;
    while (p != NULL)
    {
        cout << p->key << " ";
        p = p->next;
    }
    cout << endl;
}
void delete_the_most_repeated_element()
{
    int max_count = 0;
    int max_key = 0;
    int count[100] = { 0 };

    elem* p = start;
    while (p != NULL)
    {
        count[p->key]++;
        if (count[p->key] > max_count)
        {
            max_count = count[p->key];
            max_key = p->key;
        }
        p = p->next;
    }

    elem* prev = NULL;
    p = start;
    while (p != NULL)
    {
        if (p->key == max_key)
        {
            if (prev == NULL)
            {
                start = p->next;
            }
            else
            {
                prev->next = p->next;
            }
            elem* temp = p;
            p = p->next;
            delete temp;
        }
        else
        {
            prev = p;
            p = p->next;
        }
    }
}


int main()
{
    int slots;
    int current_element;
    int choice;

    cout << "Console: How many numbers to be added?" << endl;
    cout << "You: ";
    cin >> slots;
    cout << "\n\n";

    cout << "Console: Enter your elements." << endl;
    for (int i = 0; i < slots; i++)
    {
        cout << i + 1 << ": ";
        cin >> current_element;
        add_element(current_element);
    }
    cout << "Console: All elements are added to the list." << "\n\n";

    do
    {
        cout << "Console: Menu";
        cout << "\n1) Print the list";
        cout << "\n2) Delete repeating element in the list";
        cout << "\n3) Say Goodbye" << "\n\n";

        cout << "You: ";
        cin >> choice;
        cout << "\n";

        if (choice == 1)
        {
            cout << "Console: Your list." << endl;
            print_elements();
            cout << "\n\n\n";
        }
        else if (choice == 2)
        {
            cout << "Console: The most repeated element's copies are deleted." << endl;
			delete_the_most_repeated_element();
            cout << "\n\n\n";
        }
		else
			cout << "Console: Error! Your choice is invalid number!" << endl << "\n\n\n";

	} while (choice != 3);

	cout << "You: Goodbye!" << endl;
}