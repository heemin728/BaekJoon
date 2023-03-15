import java.util.*;

public class BOJ_13565 {
    static int n,m;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};

    static boolean isPossible=false;

    static boolean isInRange(int a,int b){
        return a >= 0 && b >= 0 && a < m && b < n;
    }

    static void dfs(int a,int b){
        visited[a][b]=true;
        for(int k=0;k<4;k++){
            int newA=a+dx[k];
            int newB=b+dy[k];
           // System.out.printf("Out: newA=%d, newB=%d\n",newA,newB);
            if(isInRange(newA,newB) && !visited[newA][newB]&& map[newA][newB]==0){
                if(newA==m-1){
                    isPossible=true;
                    return;
                }
                dfs(newA,newB);
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        m=scanner.nextInt();
        n=scanner.nextInt();

        map=new int[m][n];
        visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(visited[i],false);
        }

        for(int i=0;i<m;i++){
            String input=scanner.next();
            for(int j=0;j<n;j++){
                map[i][j]=input.charAt(j)-'0';
            }
        }

        for(int i=0;i<n;i++){

            if(map[0][i]==0 && !isPossible){
                dfs(0,i);
            }
        }
        if(isPossible){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
