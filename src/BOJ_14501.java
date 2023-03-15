// 실버 3 dp
import java.io.*;
import java.util.StringTokenizer;

public class BOJ_14501 {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        StringBuilder sb=new StringBuilder();

        int N=Integer.parseInt(st.nextToken());
        int[] t=new int[N+1];
        int[] p=new int[N+1];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            t[i]=Integer.parseInt(st.nextToken());
            p[i]=Integer.parseInt(st.nextToken());

        }
        int[] dp=new int[N+1];
        for(int i=1;i<=N;i++){
            if(i+t[i]<N){
                //dp[i+t[i]-1]=Math.max(dp[i+t[i]-1],)
            }
        }
    }
}
