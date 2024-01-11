#include<iostream>
#include<algorithm>

using namespace std;

int main() {
	
	int n;
	cin >> n;

	int* num = new int[n];

	for (int i = 0; i < n; i++) {
		cin >> num[i];
	}
	// n=10
	// 10, -4, 3, 1, 5, 6, -35, 12, 21, -1
	int *dp=new int[n];

	dp[0] = num[0];

	for (int i = 1; i < n; i++) {
		dp[i] = max(dp[i - 1] + num[i],num[i]);
	}

	cout << *max_element(dp, dp + n)<<endl;
}