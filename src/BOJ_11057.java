// 실버 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11057 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int n=Integer.parseInt(buffer.readLine());
        int divide=10007;
        int[][] dp=new int[n+1][10];
        for(int i=0;i<10;i++){
            dp[1][i]=1;
        }
        for(int i=2;i<=n;i++){
            dp[i][0]=1;
            for(int j=1;j<10;j++){
                dp[i][j]=dp[i-1][j]%divide + dp[i][j-1] % divide;
            }
        }
        int ans=0;
        for(int i=0;i<10;i++){
            ans+=dp[n][i];
        }
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<10;j++){
//                System.out.printf("%d ",dp[i][j]);
//            }
//            System.out.println();
//        }
        sb.append(ans%divide);
        System.out.println(sb);
    }
}
