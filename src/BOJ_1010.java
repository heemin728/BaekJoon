// 실버 5
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1010 {

    static int[][] dp;

    public static int combination(int m,int n){

        if(dp[m][n]>0){
            return dp[m][n];
        }

        if(m==n || n==0){
            return dp[m][n]=1;
        }

        return dp[m][n]=combination(m-1,n-1)+combination(m-1,n);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        StringBuilder sb=new StringBuilder();

        int T=Integer.parseInt(st.nextToken());
        for(int i=0;i<T;i++){
            st=new StringTokenizer(buffer.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());

            dp=new int[m+1][n+1];
            int ans=combination(m,n);
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}

