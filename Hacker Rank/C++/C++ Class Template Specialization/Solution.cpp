#include <iostream>
using namespace std;
enum class Fruit { apple, orange, pear };
enum class Color { red, green, orange };

template <typename T> struct Traits;

template <> struct Traits<Fruit> {
    static string name(int indx) {
        string en="unknown";
        switch(static_cast<Fruit>(indx)) {
            case Fruit::apple: {
                en="apple";
                break;
            }
            case Fruit::orange: {
                en="orange";
                break;
            }
            case Fruit::pear: {
                en="pear";
                break;
            }
        }
        return en;
    }
};

template <> struct Traits<Color> {
    static string name(int indx) {
        string en="unknown";
        switch(static_cast<Color>(indx)) {
            case Color::red: {
                en="red";
                break;
            }
            case Color::green: {
                en="green";
                break;
            }
            case Color::orange: {
                en="orange";
                break;
            }
        }
        return en;
    }
};


int main()
{
	int t = 0; std::cin >> t;

    for (int i=0; i!=t; ++i) {
        int index1; std::cin >> index1;
        int index2; std::cin >> index2;
        cout << Traits<Color>::name(index1) << " ";
        cout << Traits<Fruit>::name(index2) << "\n";
    }
}
