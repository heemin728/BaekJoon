// 실버 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int n=Integer.parseInt(buffer.readLine());
        int[] arr=new int[n+1];
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=Integer.parseInt(buffer.readLine());
        }
        dp[1]=arr[1];
        if(n>=2){
            dp[2]=dp[1]+arr[2];
        }
        for(int i=3;i<=n;i++){
            dp[i]=Math.max(dp[i-3]+arr[i-1]+arr[i],dp[i-2]+arr[i]);
            dp[i]=Math.max(dp[i],dp[i-1]);
        }
//        for(int i=1;i<=n;i++){
//            System.out.print(dp[i]+" ");
//        }
        sb.append(dp[n]);
        System.out.println(sb);
    }

}
