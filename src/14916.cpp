#include<iostream>
using namespace std;

int main(){
    int n;
    cin >> n;

    int count=0;

    while(n%5!=0 && n>0){
        n-=2;
        count++;
    }

    if(n%5 == 0 ){
        count+=(n/5);
    }
    else{
        count=-1;
    }
    cout << count << "\n";  
}