// 실버 3 , dp

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int T=Integer.parseInt(buffer.readLine());
        long[] dp=new long[101];
        dp[1]=1;
        dp[2]=1;
        dp[3]=1;
        for(int j=4;j<=100;j++){
            dp[j]=dp[j-3]+dp[j-2];
        }
        for(int i=0;i<T;i++){
            int N=Integer.parseInt(buffer.readLine());
            sb.append(dp[N]).append("\n");
        }
        System.out.println(sb);
    }
}
