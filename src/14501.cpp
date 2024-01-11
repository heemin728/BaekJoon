#include<iostream>
#include<algorithm>
using namespace std;
#define MAX 17

int* T; // Ti
int* P; // Pi
int* dp; // dp ½Ä

int main(){
    int N;
    cin >> N;
    
    // int T[MAX];
    // int P[MAX];
    // int dp[MAX];
    T = new int[N + 1];
    P = new int[N + 1];
    dp = new int[N + 1];


    for(int i=0;i<N;i++){
        cin >> T[i] >> P[i];
    }
    fill(dp, dp + N + 1, 0);

    int maxValue=0;
    for(int i=0;i<=N;i++){
        dp[i]=max(maxValue,dp[i]);

        if(T[i]+i <= N){
            dp[T[i]+i]=max(dp[T[i]+i],dp[i]+P[i]);
        }

        maxValue=max(maxValue,dp[i]);
    }
    cout << maxValue << "\n";
}