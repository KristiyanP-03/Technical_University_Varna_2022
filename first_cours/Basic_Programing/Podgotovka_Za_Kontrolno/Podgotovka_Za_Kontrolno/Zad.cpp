#include<iostream>
#include<fstream>

using namespace std;

fstream fp;

//void file_in(int a[], int count);
//void file_out(int b[], int count);
//void print(int a[], int b[], int count);
//int input(int a[]);
//
//int main()
//{
//  int a[100], b[100] = { 0 }, n;
//  n = input(a);
//  print(a, b, n);
//  cout << "\n Write a[] in text file \n";
//  file_out(a, n);
//  cout << "\n Read b[] from text file \n";
//  file_in(b, n);
//  cout << "\n After reading from file \n";
//  print(a, b, n);
//  system("pause");
//}
//
//int input(int a[])
//{
//  int n;
//  do {
//      cout << "\n Size of array(max 100):";
//      cin >> n;
//  } while (n < 0 || n > 100);
//  for (int i = 0; i < n; i++)
//  {
//      cout << "\n a[" << i + 1 << "]=";
//      cin >> a[i];
//  }
//  return n;
//}
//
//void print(int a[], int b[], int count)
//{
//  cout << "\n a[" << count << "]={";
//  for (int i = 0; i < count; i++)
//      cout << a[i] << ",";
//  cout << "}";
//  cout << "\n b[" << count << "]={";
//  for (int i = 0; i < count; i++)
//      cout << b[i] << ",";
//  cout << "}";
//}
//
//void file_in(int a[], int count)
//{
//  fp.open("masiv.bin", ios::binary | ios::in);
//  if (!fp) exit(1);
//  /*fp.read((char*)a, count * sizeof(int));*/
//  for (int i = 0; i < count; i++)
//      fp >> a[i];
//  fp.close();
//}
//
//void file_out(int b[], int count)
//{
//  fp.open("masiv.bin", ios::out);
//  if (!fp) exit(1);
//  /*fp.write((char*)b, count * sizeof(int));*/
//  for (int i = 0; i < count; i++)
//      fp << b[i] << "\t";
//  fp.close();
//}



struct person
{
    char name[30];
    float rate;
    int hour;
    float salary;
};

void create(person per[])
{
    int n;
    do {
        cout << "\n how many employees:";
        cin >> n;
    } while (n < 0 || n > 50);
    fp.open("employ", ios::binary | ios::out);
    if (!fp) exit(1);
    for (int i = 0; i < n; i++)
    {
        cout << "\n employees" << i + 1 << ":";
        cin.ignore();
        cout << "\n names:";
        cin.getline(per[i].name, 30);
        cout << "\n rate:";
        cin >> per[i].rate;
        cout << "\n hours";
        cin >> per[i].hour;
        per[i].salary = per[i].rate * per[i].hour;
        cout << "\n salary:" << per[i].salary;
    }
    fp.write((char*)per, n * sizeof(person));
    fp.close();

}

