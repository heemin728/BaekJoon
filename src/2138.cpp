#include<iostream>
#include<string>
#include<vector>
using namespace std;

int main(){
    int N;
    cin >> N;
    string a,b;
    cin >> a >> b;

    int answer=0;

    vector<bool> before(N);
    vector<bool> after(N);
    for(int i=0;i<N;i++){
        if(a[i]=='0'){
            before[i]=false;
        }
        else{
            before[i]=true;
        }

        if(b[i]=='0'){
            after[i]=false;
        }
        else{
            after[i]=true;
        }
    }

    // 0번째 전구는 안 누른다고 가정
    for(int i=1;i<N;i++){
        if(before[i-1] != after[i-1]){ // 이전거 비교해봐서 다르면, i 번째 전구 누름
            answer++;
            before[i-1]=!before[i-1];
            before[i]=!before[i];
            if(i!=N-1){
                before[i+1]=!before[i+1]; // 뒤집기
            }
        }
    }

    bool keepGoing=false;
    for(int i=0;i<i<N;i++){
        if(before[i]!=after[i]){
            keepGoing=true; // 뒤에 더 
            break;
        }
    }
    if(!keepGoing){
        cout << answer << "\n";
        return 0;
    }
    
    // 0번째 전구 누른다고 가정
    for(int i=0;i<N;i++){
        if(a[i]=='0'){
            before[i]=false;
        }
        else{
            before[i]=true;
        }
        // cout << "before[" << i << "]=" << before[i] << "\n";
    }
    
    answer=1;
    before[0]=!before[0];
    before[1]=!before[1];
    // cout << "init --> " << before[0] << before[1] << before[2] << "\n";
    for(int i=1;i<N;i++){
        if(before[i-1] != after[i-1]){ // 이전거 비교해봐서 다르면, i 번째 전구 누름
            answer++;
            before[i-1]=!before[i-1];
            before[i]=!before[i];

            if(i!=N-1){
                before[i+1]=!before[i+1]; // 뒤집기
            }
            // cout << "\n";
        }
        // if(i!=N-1){
        //         cout << before[i-1] << before[i] << before[i+1] << "\n";
        // }
        // else{
        //         cout << before[i-2] << before[i-1] << before[i] << "\n";
        // }
    }

    cout << answer << "\n";
    // for(int i=0;i<N;i++){
    //     if(before[i]==true){
    //         cout << "1";
    //     }
    //     else{
    //         cout << "0";
    //     }
    // }
    // cout << "\n";
}