import java.util.*;

public class BOJ_3184 {
    static int R,C;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    static int sheep=0;
    static int wolves=0;
    static int tmp_sheep=0;
    static int tmp_wolves=0;

    public static boolean isInRange(int a, int b){
        return a>=0 && b>=0 && a<R && b<C;
    }

    public static void getAnimal(int a,int b){
        if(map[a][b]=='o'){
            tmp_sheep++;
        }
        else if(map[a][b]=='v'){
            tmp_wolves++;
        }
    }

    public static void dfs(int a,int b){
        visited[a][b]=true;
        getAnimal(a,b);

        for(int k=0;k<4;k++){
            int newA=a+dx[k];
            int newB=b+dy[k];

            if(isInRange(newA,newB) && !visited[newA][newB] && map[newA][newB]!='#'){
                dfs(newA,newB);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        R=scanner.nextInt();
        C=scanner.nextInt();

        map=new char[R][C];
        visited=new boolean[R][C];

        for(int i=0;i<R;i++){
            String input=scanner.next();
            for(int j=0;j<C;j++){
                map[i][j]=input.charAt(j);
            }
        }

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(!visited[i][j] && map[i][j]!='#'){
                    tmp_sheep=0;
                    tmp_wolves=0;
                    dfs(i,j);
                    if(tmp_sheep>tmp_wolves){
                        sheep+=tmp_sheep;
                    }
                    else{
                        wolves+=tmp_wolves;
                    }
                }
            }
        }
        System.out.printf("%d %d",sheep,wolves);
    }
}
