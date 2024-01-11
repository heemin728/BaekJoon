#include<iostream>
#include<queue>
using namespace std;

int main(){
    int N;
    cin >> N;

    int input=0;

    queue<int> q;

    while(true){
        cin >> input;

        if(input==-1){
            break;
        }
        if(input==0){
            q.pop();
        }
        else{
            if(q.size()<N){
                q.push(input);
            }
        }
    }
    if(q.empty()){
        cout << "empty\n";
    }
    else{
        while(!q.empty()){
            cout << q.front() << " ";
            q.pop();
        }
    }
}