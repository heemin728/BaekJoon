import java.util.*;

public class BOJ_1303 {
    static int N,M;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    static int us=1;
    static int enemy=1;

    public static boolean isInRange(int a,int b){
        return a>=0 && b>=0 && a<M && b<N;
    }
    public static void dfs(int a,int b, char c){
        visited[a][b]=true;

        for(int k=0;k<4;k++){
            int newA=a+dx[k];
            int newB=b+dy[k];

            if(isInRange(newA,newB) && !visited[newA][newB] && map[newA][newB]==c){
                if(c=='W'){us++;}
                else{enemy++;}
                dfs(newA,newB,c);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        M=scanner.nextInt();

        map=new char[M][N];
        visited=new boolean[M][N];

        for(int i=0;i<M;i++){
            String input=scanner.next();
            for(int j=0;j<N;j++){
                map[i][j]=input.charAt(j);
            }
        }
        ArrayList<Integer> white=new ArrayList<>();
        ArrayList<Integer> blue=new ArrayList<>();
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(!visited[i][j]){
                    if(map[i][j]=='W'){
                        us=1;
                    }
                    else{
                        enemy=1;
                    }
                    dfs(i,j,map[i][j]);
                    if(map[i][j]=='W'){
                        white.add(us);
                    }
                    else{
                        blue.add(enemy);
                    }

                }
            }
        }
        int ans_white=0;
        int ans_blue=0;
        for(Integer i:white){
            ans_white+=i*i;
        }
        for(Integer i:blue){
            ans_blue+=i*i;
        }
        System.out.printf("%d %d",ans_white,ans_blue);
    }
}
