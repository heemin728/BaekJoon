import java.util.*;
import java.io.*;

public class BOJ_1189 {
    static int R,C,K;
    static int[][] map;
    static int[][] visited;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    static ArrayList<Integer> list=new ArrayList<>();

    static boolean isInRange(int a,int b){
        return a>=0 && b>=0 && a<R && b<C;
    }

    static void dfs(int a, int b){
        //visited[a][b]++;

        if(a==0 && b==C-1){
            list.add(visited[a][b]);
//            for(int i=0;i<R;i++){
//                for(int j=0;j<C;j++){
//                    System.out.printf("%d ",visited[i][j]);
//                }
//                System.out.println();
//            }
//            System.out.println();
        }


        for(int k=0;k<4;k++){

            int newa=a+dx[k];
            int newb=b+dy[k];

            if(isInRange(newa,newb) && visited[newa][newb]==0 && map[newa][newb]==1) {
                visited[newa][newb]=visited[a][b]+1;
                dfs(newa,newb);
                visited[newa][newb]=0;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner=new Scanner(System.in);
        R=scanner.nextInt();
        C= scanner.nextInt();
        K= scanner.nextInt();

        map=new int[R][C];
        visited=new int[R][C];

        for(int i=0;i<R;i++){
            String tmp=scanner.next();
            for(int j=0;j<C;j++){
                if(tmp.charAt(j)=='.'){
                    map[i][j]=1;
                }
                else{
                    map[i][j]=0;
                }
            }
        }
        visited[R-1][0]=1;
        dfs(R-1,0);

        int ans=0;
        for(Integer i:list){
//            System.out.printf("%d ",i);
            if(K==i) ans++;
        }
        System.out.println(ans);

    }
}