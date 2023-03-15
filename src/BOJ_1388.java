import java.util.*;
import java.io.*;

public class BOJ_1388 {

    static int n,m;
    static int[][] map;
    static boolean[][] visited;
    static int answer=0;

    public static boolean isInRange(int a,int b){
        return a >= 0 && b >= 0 && a < n && b < m;
    }
    public static void dfs(int a,int b,int target){
        visited[a][b]=true;
        int[] move={1,-1};
        if(target==1){
            for(int i=0;i<2;i++){
                int newa=a+move[i];
                if(isInRange(newa,b) && !visited[newa][b] && map[newa][b]==target){
                    dfs(newa,b,target);
                }
            }
        }
        else if(target==0){
            for(int i=0;i<2;i++){
                int newb=b+move[i];
                if(isInRange(a,newb) && !visited[a][newb] && map[a][newb]==target){
                    dfs(a,newb,target);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();
        map=new int[n][m];
        visited=new boolean[n][m];

        for(int i=0;i<n;i++){
            String input=scanner.next();
            for(int j=0;j<m;j++){
                char c=input.charAt(j);
                if(c=='-'){
                    map[i][j]=0;
                }
                else{
                    map[i][j]=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && map[i][j]==0){
                    dfs(i,j,0);
                    answer++;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && map[i][j]==1){
                    dfs(i,j,1);
                    answer++;
                }
            }
        }
        System.out.println(answer);

    }
}
