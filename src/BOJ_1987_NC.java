import java.util.*;

public class BOJ_1987_NC {
    static int R,C;
    static char[][] map;
    // 쓴 알파벳은 true
    static boolean[] visited;

    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    static ArrayList<Integer> ans=new ArrayList<>();

    public static boolean isInRange(int a,int b){
        return a>=0 && b>=0 && a<R && b<C;
    }
    public static void dfs(int a,int b,int cnt){


        for(int k=0;k<4;k++){
            int newA=a+dx[k];
            int newB=b+dy[k];

            if(isInRange(newA,newB)){
                char c=map[newA][newB];

                // 이미 나온 알파벳이면
                if(visited[c-'A']){
                    continue;
                }
                visited[c-'A']=false;
                System.out.println(newA+" "+newB);
                dfs(newA,newB,cnt+1);
                visited[c-'A']=true;
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        R=scanner.nextInt();
        C=scanner.nextInt();

        map=new char[R][C];
        visited=new boolean[26];

        for(int i=0;i<R;i++){
            String tmp=scanner.next();
            for(int j=0;j<C;j++){
                map[i][j]=tmp.charAt(j);
            }
        }
        dfs(0,0,0);
        for(Integer i: ans){
            System.out.println(i);
        }
    }
}
