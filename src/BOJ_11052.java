// 실버 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        StringBuilder sb=new StringBuilder();

        int N=Integer.parseInt(st.nextToken());
        int[] P=new int[N+1];
        int[] dp=new int[N+1];

        st=new StringTokenizer(buffer.readLine()," ");
        for(int i=1;i<=N;i++){
            P[i]=Integer.parseInt(st.nextToken());
        }
        dp[1]=P[1];

        for(int i=2;i<=N;i++){
            dp[i]=P[i];
            for(int j=0;j<i;j++){
                dp[i]=Math.max(dp[i],P[i-j]+dp[j]);
            }
        }

        System.out.println(dp[N]);
//        for(int i=1;i<=N;i++){
//            System.out.printf("%d ",dp[i]);
//        }
    }
}
