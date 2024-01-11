#include<iostream>
using namespace std;

string answer="";
int point=0;
int cnt=0;

int main(){
    string s;
    cin >> s;

    while(true){
        if(point>=s.length()){
            break;
        }

        if(s[point]=='X'){
            cnt++;
        }
        else{

            int four=cnt/4;
            cnt-=4*four;
            int two=cnt/2;

            if(cnt%2!=0){
                cout << "-1\n";
                return 0; 
            }
            for(int i=0;i<four;i++){
                answer+="AAAA";
            }
            for(int i=0;i<two;i++){
                answer+="BB";
            }

            cnt=0;
            answer+=".";
        }
        point++;
    }

    int four=cnt/4;
    cnt-=4*four;
    int two=cnt/2;

    if(cnt%2!=0){
        cout << "-1\n";
        return 0; 
    }
    for(int i=0;i<four;i++){
        answer+="AAAA";
    }
    for(int i=0;i<two;i++){
        answer+="BB";
    }

    cout << answer << "\n";
}