import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(buffer.readLine(), " ");
        Scanner scanner=new Scanner(System.in);

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int array[][]=new int[N+1][N+1];
        int dp[][]=new int[N+1][N+1];

        for(int i=1;i<=N;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            for(int j=1;j<=N;j++){
                array[i][j]=Integer.parseInt(st.nextToken());
                dp[i][j]=array[i][j]-dp[i-1][j-1]+dp[i-1][j]+dp[i][j-1];
            }
        }
        for(int i=0;i<M;i++){
            int x1,y1,x2,y2;
            st=new StringTokenizer(buffer.readLine()," ");
            x1=Integer.parseInt(st.nextToken());
            y1=Integer.parseInt(st.nextToken());
            x2=Integer.parseInt(st.nextToken());
            y2=Integer.parseInt(st.nextToken());

            sb.append(dp[x2][y2]-dp[x2][y1-1]-dp[x1-1][y2]+dp[x1-1][y1-1]).append("\n");
        }
        System.out.println(sb);
    }
}
