#include<iostream>
#include<algorithm>

using namespace std;

int main() {

    int n;
    cin >> n;

    int size=n*(n+1)/2;
    int *arr=new int[size];

    for(int i=0;i<size;i++){
        cin >> arr[i];
    }

    int sum=arr[0];
    


/*

7 10 15 16 15 23 20 28 25
5
            7(0)
         3(1)  8(2)
      8(3)  1(4)  0(5)
    2(6) 7(7) 4(8) 4(9)
4(10) 5(11) 2(12) 6(13) 5(14)

7/ 3 8/ 8 1 0/ 2 7 4 4/ 4 5 2 6 5

0-> 1, 2

1-> 3,4
2-> 4,5

3-> 6,7
4-> 7,8
5-> 8,9

6-> 10,11
7-> 11,12
8-> 12,13
9-> 13,14

*/
}