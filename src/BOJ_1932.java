// 실버 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        StringBuilder sb=new StringBuilder();

        int n=Integer.parseInt(st.nextToken());
        int[][] arr=new int[n][n];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(buffer.readLine(), " ");
            for(int j=0;j<i+1;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            if(i==0){
                dp[0][0]=arr[0][0];
                continue;
            }
            for(int j=0;j<=i;j++){
                if(j==0){
                    dp[i][j]=dp[i-1][j]+arr[i][j];
                }
                else if(j==n){
                    System.out.printf("i=%d j=%d\n",i,j);
                    dp[i][j]=dp[i-1][j-1]+arr[i][j];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j-1],dp[i-1][j])+arr[i][j];
                }
            }
        }
        int ans= Arrays.stream(dp[n-1]).max().getAsInt();
        System.out.println(ans);
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
