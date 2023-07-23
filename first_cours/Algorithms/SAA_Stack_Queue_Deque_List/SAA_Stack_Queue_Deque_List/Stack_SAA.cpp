//=============REQURSION===========================================================
/*
#include <iostream>
using namespace std;

int req(int& a, int& sum)
{
    if (a == 0)
        return 0;
    sum *= a;
    a--;

    return req(a, sum);
}

int main()
{
    int a = 5;
    int sum = 1;
    req(a, sum);

    cout << "Sum = " << sum;
}
*/
//===================================================================================
//=============STACK============================================================
/*
#include <iostream>
using namespace std;
struct elem
{
	int key;
	elem *next;
} *start = NULL, *p = NULL;
 
void push(int i)
{
	p = start; // запазва адреса на последната структура
	start = new elem; // нова структура
	start -> key = i; // стойноста на стр
	start -> next = p; // адреса на стр
}
int pop(int &i)
{
	if(start)
	{
		i = start -> key;
		p = start;
		start = start -> next;
		delete p;
		return 1;
	}
	else
		return 0;
}
 
int main()
{
	int num;
 
	cout << "Input:\n";
	while(cin >> num)
		push(num);
	cout << "== Your stack ==\n";
	while(pop(num))
	{
		cout << num << " ";
	}
}
*/
//=========================================================================
//=====================QUEUE============================================================
/*
#include <iostream>
using namespace std;
int counter = 0;

struct elem
{
	int key;
	elem* next;
} *first = NULL, * last = NULL, * p = NULL;

void push(int n)
{
	p = last;
	last = new elem;
	last->key = n;
	last->next = NULL;
	if (p != NULL)
		p->next = last;
	if (first == NULL)
		first = last;
}
int pop(int& n)
{
	if (first)
	{
		counter++;
		n = first->key;
		p = first;
		first = first->next;
		if (first == NULL)
			last = first;
		delete p;
		return 1;
	}
	else
		return 0;
}

int main()
{
	int num;
	while (cin >> num)
	{
		push(num);
	}
	cout << "=== Queue ===" << endl;
	while (pop(num))
	{
		cout << num << " ";
	}
	cout << endl;

	cout << counter << " elements found!";
}
*/
//===========================================================================
//================Deque==============================================================
/*
#include <iostream>
using namespace std;

struct elem
{
    int key;
    elem* next;
} *left_side = NULL, * right_side = NULL;

void push_l(int n)
{
    elem* p;
    p = left_side;
    left_side = new elem;
    left_side->key = n;
    left_side->next = p;
    if (right_side == NULL)
        right_side = left_side;
}
void push_r(int n)
{
    elem* p;
    p = right_side;
    right_side = new elem;
    right_side->key = n;
    right_side->next = NULL;
    if (left_side == NULL)
        left_side = right_side;
    else
        p->next = right_side;
}

int pop_l(int& n)
{
    elem* p;
    if (left_side)
    {
        n = left_side->key;
        p = left_side;
        left_side = left_side->next;
        if (left_side == NULL)
        {
            right_side = NULL;
        }
        delete p;
        return 1;
    }
    else
        return 0;
}
int pop_r(int& n)
{
    elem* p;
    if (right_side)
    {
        n = right_side->key;
        if (left_side == right_side)
        {
            delete right_side;
            left_side = right_side = NULL;
        }
        else
        {
            p = left_side;
            while (p->next != right_side)
                p = p->next;
            p->next = NULL;
            delete right_side;
            right_side = p;
        }
        return 1;
    }
    else
        return 0;
}

int main()
{
    int n;

    push_l(3);
    push_l(2);
    push_l(1);

    push_r(4);
    push_r(5);
    push_r(6);

    while (pop_l(n))
        cout << n << " ";


    while (pop_r(n))
        cout << n << " ";

    return 0;
}
*/
