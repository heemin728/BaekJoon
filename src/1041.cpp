#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
    long long N;
    cin >> N;

    long long a,b,c,d,e,f;
    long long two_min=101;
    long long three_min=151;

    cin >> a >> b >> c >> d >> e >> f;

    vector<int> v;
    v.push_back(a);
    v.push_back(b);
    v.push_back(c);
    v.push_back(d);
    v.push_back(e);
    v.push_back(f);

    int m=*min_element(v.begin(),v.end());

    if(N==1){
        int ax=*max_element(v.begin(),v.end());
        int sum=a+b+c+d+e+f;
        sum-=ax;
        cout << sum << "\n";
        return 0;
    }

    two_min=min(two_min,a+b);
    two_min=min(two_min,a+c);
    two_min=min(two_min,a+d);
    two_min=min(two_min,a+e);
    two_min=min(two_min,b+f);
    two_min=min(two_min,b+d);
    two_min=min(two_min,b+c);
    two_min=min(two_min,c+e);
    two_min=min(two_min,c+f);
    two_min=min(two_min,d+e);
    two_min=min(two_min,d+f);
    two_min=min(two_min,e+f);

    three_min=min(three_min,a+b+d);
    three_min=min(three_min,a+e+d);
    three_min=min(three_min,a+b+c);
    three_min=min(three_min,a+e+c);
    three_min=min(three_min,f+b+d);
    three_min=min(three_min,f+b+c);
    three_min=min(three_min,f+e+c);
    three_min=min(three_min,f+e+d);

    long long first=4*three_min;
    long long second= two_min*(4+8*(N-2));
    long long thrid= m*((5*N-6)*(N-2)); 

    long long answer=4*three_min + two_min*(4+8*(N-2)) + m*(5*(N-2)*(N-2)+4*(N-2));

    cout << answer << "\n";

}