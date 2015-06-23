#include <iostream>
using namespace std;

double getPricePerDozen(int numEggs) {
    if (numEggs < 48) return 0.5;
    else if (numEggs >= 48 && numEggs < 72) return 0.45;
    else if (numEggs >= 72 && numEggs < 132) return 0.4;
    else return 0.35;
}

int main() {
    cout << "Enter number of eggs: ";
    int numEggs;
    cin >> numEggs;
    double pricePerDozen = getPricePerDozen(numEggs);
    double pricePerEgg = pricePerDozen / 12;
    double finalPrice = numEggs * pricePerEgg;
    cout << "Your cost is $" << pricePerDozen << " per dozen or $" << pricePerEgg << " per egg." << endl;
    cout << "Your bill comes to $" << finalPrice;
    return 0;
}
