#include <iostream>
#include <string>
#include <climits>
using namespace std;

int ID = 1001;

class Product
{
private:
    int productId;
    string name;
    double price;
    int quantity;

public:
    Product()
    {
        productId = ID++;
    }

    void acceptDetails()
    {
        cout << "Enter Name: ";
        getline(cin, name);

        cout << "Enter Price: ";
        cin >> price;

        cout << "Enter Quantity: ";
        cin >> quantity;

        cin.ignore();
    }

    double totalValue() const
    {
        return price * quantity;
    }

    void displayDetails() const
    {
        cout << productId << " " << name << " " << price << " " << quantity << " " << totalValue() << endl;
    }

    bool isLowStock(int threshold) const
    {
        return quantity < threshold;
    }

    string getName() const
    {
        return name;
    }
};

void displayLowStock(Product arr[], int size, int threshold)
{
    for(int i = 0; i < size; i++)
    {
        if(arr[i].isLowStock(threshold))
        {
            cout << arr[i].getName() << " ";
        }
    }
    cout << endl;
}

double reorderCost(int qty, double unitPrice)
{
    return qty * unitPrice;
}

double reorderCost(double qty, double unitPrice)
{
    return qty * unitPrice;
}

double reorderCost(int qty, double unitPrice, double taxRate)
{
    return qty * unitPrice * (1 + taxRate);
}

double applyDiscount(double price, double discountPercent = 10.0)
{
    return price - (price * discountPercent / 100);
}

int main()
{
    Product p_arr[5];

    for(int i = 0; i < 5; i++)
    {
        p_arr[i].acceptDetails();
    }

    cout << "===== INVENTORY REPORT =====" << endl;
    cout << "ID Name Price Qty Total Value" << endl;

    for(int i = 0; i < 5; i++)
    {
        p_arr[i].displayDetails();
    }

    double max_val = 0;
    string highest_v_product;

    for(int i = 0; i < 5; i++)
    {
        if(p_arr[i].totalValue() > max_val)
        {
            max_val = p_arr[i].totalValue();
            highest_v_product = p_arr[i].getName();
        }
    }

    int threshold;

    cout << "Enter Low Stock Threshold: ";
    cin >> threshold;

    cout << "Highest Value Product: " << highest_v_product << " " << max_val << " Rs" << endl;
    cout << "Low Stock Threshold: " << threshold << ": ";
    displayLowStock(p_arr, 5, threshold);

    cout << reorderCost(10, 120) << endl;
    cout << reorderCost(20.5, 200) << endl;
    cout << reorderCost(45, 250, 0.10) << endl;
    cout << applyDiscount(2000, 20) << endl;

    return 0;
}
