#include<iostream>
using namespace std;
#define MAX 1001
#define DEVIDER 10007
int main(){
    int n;
    cin >> n;

    int dp[1001];
    dp[1]=1;
    dp[2]=3;
    dp[3]=5;

    for(int i=4;i<=n;i++){
        if(i%2==1){
            dp[i]=(dp[i-1]+2*dp[i-2])%DEVIDER;
        }
        else{
            dp[i]=(3*dp[i-2]+2*dp[i-3])%DEVIDER;
        }
    }
    cout << dp[n] << "\n";
}