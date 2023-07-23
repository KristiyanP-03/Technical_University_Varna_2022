/*
Задача 63. Да се състави програма, която създава динамичен стек S от цели
положителни числа и след това динамичен стек P, който съдържа елементите на S,
подредени в намаляващ ред. Съдържанието на двата стека да се изведе на екрана.
*/

#include <iostream>
using namespace std;



struct elemnts_from_stack_s
{
	int s_key;
	elemnts_from_stack_s* s_next;
} *s_start = NULL, * s_p = NULL;
struct elemnts_from_stack_p
{
	int p_key;
	elemnts_from_stack_p* p_next;
} *p_start = NULL, * p_p = NULL;



void generate_numbers_in_stack_s(int n);
void pop_numbers_from_stack_s_to_stack_p_to_make_desc_order(int& n);
int pop_stack_s(int& n);
int pop_stack_p(int& n);



int main()
{
	int n_numbers_to_generate;

	cout << "Input the max length of stack S: ";
	cin >> n_numbers_to_generate;
	generate_numbers_in_stack_s(n_numbers_to_generate);
	cout << "\n\n";

	cout << "=== Stacks S and P ===\n";
	cout << "Stack S: ";
	while (pop_stack_s(n_numbers_to_generate))
	{
		cout << n_numbers_to_generate << " ";
	}
	cout << endl;
	cout << "Stack P: ";
	while (pop_stack_p(n_numbers_to_generate))
	{
		cout << n_numbers_to_generate << " ";
	}
}



void generate_numbers_in_stack_s(int n)
{
	for (int i = 1; i <= n; i++)
	{
		s_p = s_start;
		s_start = new elemnts_from_stack_s;
		s_start->s_key = i;
		s_start->s_next = s_p;
	}
	pop_numbers_from_stack_s_to_stack_p_to_make_desc_order(n);
}




void pop_numbers_from_stack_s_to_stack_p_to_make_desc_order(int& n)
{
	elemnts_from_stack_s* save_s_start = s_start;
	while (s_start)
	{
		n = s_start->s_key;
		s_start = s_start->s_next;

		p_p = p_start;
		p_start = new elemnts_from_stack_p;
		p_start->p_key = n;
		p_start->p_next = p_p;
	}
	s_start = save_s_start;
}



int pop_stack_s(int& n)
{
	if (s_start)
	{
		n = s_start->s_key;
		s_start = s_start->s_next;
		return 1;
	}
	else
		return 0;
}
int pop_stack_p(int& n)
{
	if (p_start)
	{
		n = p_start->p_key;
		p_start = p_start->p_next;
		return 1;
	}
	else
		return 0;
}