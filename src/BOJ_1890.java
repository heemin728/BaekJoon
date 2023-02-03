// 실버1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1890 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        StringBuilder sb=new StringBuilder();

        int N=Integer.parseInt(st.nextToken());
        long[][] arr=new long[N+1][N+1];
        long[][] dp= new long[N+1][N+1];

        for(int i=1;i<=N;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            for(int j=1;j<=N;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        dp[1][1]=1;
        for(long i=1;i<=N;i++){
            for(long j=1;j<=N;j++){
                long value=arr[(int) i][(int) j];

                if(i==N && j==N) break;

                // 아래로 이동
                if( i + value <= N){
                    dp[(int) (i+value)][(int)j]+=dp[(int)i][(int)j];
                }
                if( j + value <= N){
                    dp[(int)i][(int)(j+value)]+=dp[(int)i][(int)j];
                }
            }
        }
//        for(int i=1;i<=N;i++){
//            for(int j=1;j<=N;j++){
//                System.out.printf("%d ",dp[i][j]);
//            }
//            System.out.println();
//        }
        //System.out.println(dp[N][N]);
        sb.append(dp[N][N]);
        System.out.println(sb);
        //

    }
}
