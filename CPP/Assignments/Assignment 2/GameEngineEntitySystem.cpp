//============================================================================
// Name        : Game.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================



#include <iostream>
#include <string>
using namespace std;

class Entity
{
private:
    string name;
    int health;
    int level;
    string type;

public:
    Entity& setName(const string& n)
    {
        name = n;
        return *this;
    }

    Entity& setHealth(int h)
    {
        health = h;
        return *this;
    }

    Entity& setLevel(int l)
    {
        level = l;
        return *this;
    }

    Entity& setType(const string& t)
    {
        type = t;
        return *this;
    }

    string getName() const
    {
        return name;
    }

    int getHealth() const
    {
        return health;
    }

    int getLevel() const
    {
        return level;
    }

    string getType() const
    {
        return type;
    }

    void displayInfo() const
    {
        cout << "Name : " << name << endl;
        cout << "Health : " << health << endl;
        cout << "Level : " << level << endl;
        cout << "Type : " << type << endl;
        cout << endl;
    }
};

namespace Physics
{
    int clamp(int value, int min, int max)
    {
        if(value < min)
            return min;

        if(value > max)
            return max;

        return value;
    }

    double lerp(double a, double b, double t)
    {
        return a + (b - a) * t;
    }
}

namespace GameMath
{
    int clamp(int value, int min, int max)
    {
        if(value < min)
            return min;

        if(value > max)
            return max;

        return value;
    }

    double lerp(double a, double b, double t)
    {
        return a + (b - a) * t;
    }
}

int main()
{
    Entity player;
    Entity enemy;
    Entity item;

    string name, type;
    int health, level;

    cout << "Enter Player Name: " << endl;
    cin >> name;
    cout << "Enter Player Health: " << endl;
    cin >> health;
    cout << "Enter Player Level: " << endl;
    cin >> level;
    cout << "Enter Player Type: " << endl;
    cin >> type;

    player.setName(name).setHealth(health).setLevel(level).setType(type);

    cout << endl;

    cout << "Enter Enemy Name: " << endl;
    cin >> name;
    cout << "Enter Enemy Health: " << endl;
    cin >> health;
    cout << "Enter Enemy Level: " << endl;
    cin >> level;
    cout << "Enter Enemy Type: " << endl;
    cin >> type;

    enemy.setName(name).setHealth(health).setLevel(level).setType(type);

    cout << endl;

    cout << "Enter Item Name: " << endl;
    cin >> name;
    cout << "Enter Item Health: " << endl;
    cin >> health;
    cout << "Enter Item Level: " << endl;
    cin >> level;
    cout << "Enter Item Type: " << endl;
    cin >> type;

    item.setName(name).setHealth(health).setLevel(level).setType(type);

    cout << endl;

    player.displayInfo();
    enemy.displayInfo();
    item.displayInfo();

    cout << "Physics Clamp: " << Physics::clamp(120, 0, 100) << endl;
    cout << "GameMath Clamp: " << GameMath::clamp(120, 0, 100) << endl;

    cout << "Physics Lerp: " << Physics::lerp(10, 20, 0.5) << endl;
    cout << "GameMath Lerp: " << GameMath::lerp(10, 20, 0.5) << endl;

    int rows, columns;

    cout << "Enter Rows: " << endl;
    cin >> rows;

    cout << "Enter Columns: " << endl;
    cin >> columns;

    int **map = new int*[rows];

    for(int i = 0; i < rows; i++)
    {
        map[i] = new int[columns];
    }

    cout << "Enter Map Values (0=Empty, 1=Wall, 2=Player, 3=Enemy):" << endl;

    for(int i = 0; i < rows; i++)
    {
        for(int j = 0; j < columns; j++)
        {
            cin >> map[i][j];
        }
    }

    cout << "Game Map:" << endl;

    for(int i = 0; i < rows; i++)
    {
        for(int j = 0; j < columns; j++)
        {
            cout << map[i][j] << " ";
        }
        cout << endl;
    }

    int empty = 0;
    int wall = 0;
    int playerCount = 0;
    int enemyCount = 0;

    for(int i = 0; i < rows; i++)
    {
        for(int j = 0; j < columns; j++)
        {
            if(map[i][j] == 0)
                empty++;
            else if(map[i][j] == 1)
                wall++;
            else if(map[i][j] == 2)
                playerCount++;
            else if(map[i][j] == 3)
                enemyCount++;
        }
    }

    cout << "Empty: " << empty << endl;
    cout << "Walls: " << wall << endl;
    cout << "Players: " << playerCount << endl;
    cout << "Enemies: " << enemyCount << endl;

    for(int i = 0; i < rows; i++)
    {
        delete[] map[i];
    }

    delete[] map;

    return 0;
}
