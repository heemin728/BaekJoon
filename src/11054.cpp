#include<iostream>
#include<vector>
using namespace std;
#define MAX 1001

int main(){
    int N;
    cin >> N;

    vector<int> v(N);
    vector<int> dp(MAX);
    vector<int> least_dp(MAX);

    for(int i=0;i<N;i++){
        cin >> v[i];
    }

    dp[0]=0;
    for(int i=1;i<N;i++){
        for(int j=i-1;j>=0;j--){
            if(v[i] > v[j]){
                dp[i]=max(dp[j]+1,dp[i]);
            }
        }
    }
    
    // for(int i=0;i<N;i++){
    //     cout << dp[i] << " ";
    // }

    least_dp[N-1]=0;
    for(int i=N-2;i>=0;i--){
        for(int j=i+1;j<N;j++){
            if(v[i] > v[j]){
                least_dp[i]=max(least_dp[j]+1,least_dp[i]);
            }
        }
    }
    //     for(int i=0;i<N;i++){
    //     cout << least_dp[i] << " ";
    // }
    
    int answer=0;
    for(int i=0;i<N;i++){
        answer=max(answer,dp[i]+least_dp[i]);
    }
    cout << answer+1 << "\n";
}