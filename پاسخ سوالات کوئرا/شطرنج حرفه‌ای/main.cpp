#include <iostream>
#include <string>

using namespace std;

int main(){
    int shah[2] = {1, 0};
    int vazir[2] = {1 , 0};
    int rokh[2] = {2, 0};
    int fil[2] = {2 , 0};
    int asb[2] = {2, 0};
    int sarbaz[2] = {8 , 0};

    cin >> shah[1] >> vazir[1] >> rokh[1] >> fil[1] >> asb[1] >> sarbaz[1];

    cout << shah[0]-shah[1] << " " << vazir[0]-vazir[1] << " " << rokh[0]-rokh[1] << " " << fil[0]-fil[1] << " " << asb[0]-asb[1] << " " << sarbaz[0]-sarbaz[1];


    return 0;
}
