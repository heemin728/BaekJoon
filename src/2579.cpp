#include<iostream>
#include<algorithm>
using namespace std;
#define MAX 10000

int main(){
    int N;
    cin >> N;
    
    int p[MAX];
    int dp[MAX];

    for(int i=0;i<N;i++){
        cin >> p[i];
    }

    dp[0]=p[0];
    dp[1]=max(dp[0]+p[1],p[1]);
    dp[2]=max(dp[0]+p[2],p[1]+p[2]);

    for(int i=3;i<N;i++){
        dp[i]=max(dp[i-3]+p[i-1]+p[i],dp[i-2]+p[i]);
    }
    cout << dp[N-1] << "\n";
}