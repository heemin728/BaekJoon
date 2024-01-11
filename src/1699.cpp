#include<iostream>
#include<math.h>
using namespace std;
#define MAX 100001
int main(){
    int n;
    cin >> n;

    int arr[MAX];
    int dp[MAX];

    int count=1;
    for(int i=1;i<=n;i++){
    if(count*count == i){
        arr[i]=i;
        count++;
    }
    else{
        arr[i]=arr[i-1];
    }
}


    dp[1]=1;
    dp[2]=2;
    dp[3]=3;

    for(int i=4;i<=n;i++){

        // dp[i]=500;

        int least=arr[i];
        int leastSqure=sqrt(least);
        for(int j=1;j<=leastSqure;j++){
            int minusValue=i-j*j;
            if(j==1){dp[i]=dp[minusValue]+1;}
            else{
                dp[i]=min(dp[i],dp[minusValue]+1);
            }
        }
    }
    cout << dp[n] << "\n";

}