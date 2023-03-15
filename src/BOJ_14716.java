import java.util.*;
import java.io.*;

public class BOJ_14716 {
    static int m,n;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx={1,-1,0,0,1,-1,1,-1};
    static int[] dy={0,0,1,-1,-1,1,1,-1};
    static int ans=0;

    public static boolean isInRange(int a,int b){
        return a>=0 && b>=0 && a<m && b<n;
    }
    public static void dfs(int a,int b){
        visited[a][b]=true;

        for(int k=0;k<8;k++){
            int newA=a+dx[k];
            int newB=b+dy[k];

            if(isInRange(newA,newB) && !visited[newA][newB] && map[newA][newB]==1){
                dfs(newA,newB);
            }

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");

        m=Integer.parseInt(st.nextToken());
        n=Integer.parseInt(st.nextToken());
        map=new int[m][n];
        visited=new boolean[m][n];

        for(int i=0;i<m;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            for(int j=0;j<n;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]==1 && !visited[i][j]){
                    dfs(i,j);
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }
}
