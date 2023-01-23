// 골드 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");
        StringBuilder sb=new StringBuilder();

        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        int[][] dp=new int[N+1][K+1];
        int[] w=new int[N+1];
        int[] v=new int[N+1];

        for(int i=1;i<=N;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            w[i]=Integer.parseInt(st.nextToken());
            v[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=K;j++){
                dp[i][j]=dp[i-1][j];
                if(j-w[i]>= 0){
                    // 이전 아이템의 최대 가치 vs 남은 무게의 가치 + 자신의 가치
                    dp[i][j]=Math.max(dp[i-1][j],v[i]+dp[i-1][j-w[i]]);
                }
            }
        }
//        for(int i=1;i<=N;i++){
//            for(int j=1;j<=K;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
        sb.append(dp[N][K]);
        System.out.println(sb);
    }
}
