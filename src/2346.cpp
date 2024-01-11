#include<iostream>
#include<vector>
using namespace std;
#define MAX 1001

int N;
vector<int> v(N+1);
vector<bool> isVisited(N+1);

void printVisit(){
    cout << "======visit=====\n";
    for(int i=1;i<=N;i++){
        cout << isVisited[i] << " ";
    }
    cout << "\n================\n";
}
int getIndexNumber(int currentIndex, int move){

    bool isEnd=false;
    cout << "index = " << currentIndex << ", move = " << move << "\n";
    printVisit();
    if(move<0){
        int value=-1*move;
        int nextTarget;
        while(value!=0){
            if(currentIndex-1<1){
                nextTarget=N;
            }
            else{
                nextTarget=currentIndex-1;
            }
            // cout << "next Target = " << nextTarget << "\n";

            // cout << "isVisitd[" << nextTarget << "]=" << isVisited[nextTarget] << "\n";
            if(!isVisited[nextTarget]){ // 방문 안한 경우
                value--;
            }
            currentIndex=nextTarget;
        }
    }
    else{
        int value=move;
        int nextTarget;
        while(value!=0){
            if(currentIndex+1>N){
                nextTarget=1;
            }
            else{
                nextTarget=currentIndex+1;
            }

            if(!isVisited[nextTarget]){ // 방문 안한 경우
                value--;
            }
            currentIndex=nextTarget;
        }

    }
    // cout << "next target = " << currentIndex << "\n";
    cout << "< " << currentIndex << " >\n\n ";
    isVisited[currentIndex]=true;
    return currentIndex;
}

int main(){
    cin >> N;
    for(int i=1;i<=N;i++){
        cin >> v[i];
        isVisited[i]=false;
    }

    cout << "v[5]=" << v[5] << "\n";

    int move=v[1];
    int currentIndex=1;
    isVisited[1]=true;
    cout << "move = " << move << "\n";
    for(int i=1;i<N;i++){
        currentIndex=getIndexNumber(currentIndex,move);
         cout << "v[5]=" << v[5] << "\n";

        if(currentIndex==5){
            cout << "shoud be -1, and " << v[currentIndex] << "\n";
        }
        move=v[currentIndex];
    }


}