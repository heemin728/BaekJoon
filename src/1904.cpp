#include<iostream>
using namespace std;
#define MAX 1000001

int main(){
    int N;
    cin >> N;

    int dp[MAX];
    dp[0]=0;
    dp[1]=1;
    dp[2]=2;
    dp[3]=3;

    for(int i=4;i<=N;i++){
        dp[i]=(2*dp[i-2]+dp[i-3])%15746;
    }
    cout << dp[N];
}