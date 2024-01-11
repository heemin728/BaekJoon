#include<iostream>
#include<queue>
using namespace std;
#define MAX 20

int N;
int map[MAX][MAX];
int sharkSize=2;
int time=0;
int tmpTime=0;
bool hasMoreFish=false;
int dx[4]={-1,0,0,1};
int dy[4]={0,-1,1,0};
int nowFish=0;
pair<int,int> sharkLocation;

bool isInRange(int i,int j){
    return i>=0 && i<N && j>=0 && j<N;
}

pair<int,int> bfs(){
    queue<pair<int,int>> q;
    queue<int> level;

    bool isVisited[MAX][MAX];
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            isVisited[i][j]=false;
        }
    }
    tmpTime=1;
    hasMoreFish=false;

    q.push(make_pair(sharkLocation.first,sharkLocation.second));
    level.push(tmpTime);
    
    while(!q.empty()){
        int a=q.front().first;
        int b=q.front().second;
        q.pop();

        int currentLevel=level.front();
        level.pop();

        for(int k=0;k<4;k++){
            int newa=a+dx[k];
            int newb=b+dy[k];

            // cout << "new " << newa << ", " << newb << "\n";
            // cout << "shrarkSize " << sharkSize << "\n";

            if(isInRange(newa,newb) && !isVisited[newa][newb]){
                isVisited[newa][newb]=true;
                if(sharkSize>=map[newa][newb]){
                    if(map[newa][newb]!=0 && sharkSize > map[newa][newb]){
                        hasMoreFish=true;
                        // sharkSize+=map[newa][newb];
                        if(sharkSize==nowFish){
                            nowFish=0;
                            sharkSize++;
                        }
                        map[newa][newb]=0;
                        tmpTime=currentLevel;
                        nowFish++;
                        return make_pair(newa,newb);
                    }
                    q.push(make_pair(newa,newb));
                    level.push(currentLevel+1);
                }
            }
        }
        // tmpTime++;
    }
    if(!hasMoreFish){
        tmpTime=0;
    }
    return make_pair(-1,-1);
}

void moveShark(int i, int j){

    map[sharkLocation.first][sharkLocation.second]=0;
    sharkLocation.first=i;
    sharkLocation.second=j;
}

void printMap(){
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            cout << map[i][j] << " ";
        }
        cout << "\n";
    }
    cout << "\n";
}

void findLeastDistance(){

    // while(true){
    //     pair<int,int> destination=bfs();
    //     moveShark(destination.first,destination.second);
    //     time+=tmpTime;
    //     cout << destination.first << ", " << destination.second << "\n";
    //     cout << "current Time " << time << "\n";
    //     if(tmpTime==0){
    //         break;
    //     }
    // }

    for(int i=0;i<10;i++){
            pair<int,int> destination=bfs();
            moveShark(destination.first,destination.second);
            time+=tmpTime;
            cout << "\n" << destination.first << ", " << destination.second << "\n";
            cout << "current Time " << time << "\n";
            cout << "sharkSize " << sharkSize << "\n";
            printMap();
            if(!hasMoreFish){
                break;
            }
    }

    cout << time << "\n";
}

int main(){
    cin >> N;
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            cin >> map[i][j];
            if(map[i][j]==9){
                sharkLocation.first=i;
                sharkLocation.second=j;
            }
        }
    } 
    findLeastDistance();
}