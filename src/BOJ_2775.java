// 브론즈 5

import java.io.BufferedReader;
import java.util.Scanner;

public class BOJ_2775 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int T=scanner.nextInt();

        for(int i=0;i<T;i++){
            int k= scanner.nextInt(); // 층 0층부터
            int n= scanner.nextInt(); // 호 1호부터

            int[][] dp=new int[k+1][15];

            for(int t=1;t<=14;t++){ // 0층 1호~n호까지 i로 초기화
                dp[0][t]=t;
            }
            for(int t=1;t<=k;t++){ // 모든 층 1호는 1로 ..
                dp[t][1]=1;
            }
            for(int j=1;j<=k;j++){
                for(int m=1;m<=14;m++){
                    // j-1층의 m까지의 모든 수
                    //System.out.printf("dp[%d-1][%d] + dp[%d][%d-1] = %d + %d = %d\n",j-1,m,j,m-1,dp[j-1][m],dp[j][m-1],dp[j-1][m]+dp[j][m-1]);
                    dp[j][m]=dp[j-1][m]+dp[j][m-1];
                }
            }
            sb.append(dp[k][n]).append("\n");
        }
        System.out.println(sb);
    }
}
