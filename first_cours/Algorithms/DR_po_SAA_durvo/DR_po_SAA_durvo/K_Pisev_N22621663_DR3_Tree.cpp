/*Задача 63. Да се състави програма на С / С++, която използва функция за преброяване на възлите с 
по два наследника в дадено двоично дърво.
*/
#include <iostream>
using namespace std;

struct elem {
    char key;
    elem* left, * right;
};

int count(elem* node) {
    if (node == NULL) {
        return 0;
    }

    int counter = 0;

    if (node->left != NULL && node->right != NULL) {
        counter = 1;
    }

    counter += count(node->left);
    counter += count(node->right);

    return counter;
}

int main() {

    elem* root = new elem{ 'A', NULL, NULL };
    root->left = new elem{ 'B', NULL, NULL };
    root->right = new elem{ 'C', NULL, NULL };
    root->left->left = new elem{ 'D', NULL, NULL };
    root->left->right = new elem{ 'E', NULL, NULL };
    root->right->left = new elem{ 'F', NULL, NULL };
    root->right->right = new elem{ 'G', NULL, NULL };

    cout << "Броя на възлите с по два наследника е: " << count(root) << endl;

    return 0;
}


