// 실버1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        StringBuilder sb=new StringBuilder();

        int N=Integer.parseInt(st.nextToken());

        int[][] arr=new int[N][3];
        int[][] dp=new int[N][3];

        // 인풋으로 받은 값 설정 + dp 첫번째 열은 arr 첫번째와 같게
        for(int i=0;i<N;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            for(int j=0;j<3;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
                if(i==0) {
                    dp[i][j]=arr[i][j];
                }
            }
        }
        for(int i=1;i<N;i++){
            dp[i][0]=arr[i][0]+Math.min(dp[i-1][1],dp[i-1][2]);
            dp[i][1]=arr[i][1]+Math.min(dp[i-1][0],dp[i-1][2]);
            dp[i][2]=arr[i][2]+Math.min(dp[i-1][0],dp[i-1][1]);
        }

        sb.append(Arrays.stream(dp[N-1]).min().getAsInt()).append("\n");
        System.out.println(sb);

    }
}
