import java.util.*;

public class BOJ_16948 {

    static int N, r1,c1,r2,c2;
    static int[][] map;
    static int[][] visited;
    static int[] dx={-2,-2,0,0,2,2};
    static int[] dy={-1,1,-2,2,-1,1};
    static int ans=-1;

    static boolean isInRange(int a,int b){
        return (a>=0 && b>=0 && a<N && b<N);
    }

    static void bfs(){
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{r1,c1});

        while(!queue.isEmpty()){
            int a=queue.peek()[0];
            int b=queue.poll()[1];

            for(int k=0;k<6;k++){
                int newa=a+dx[k];
                int newb=b+dy[k];


                if(isInRange(newa,newb) && visited[newa][newb]==-1){

                    visited[newa][newb]=visited[a][b]+1;
                    if(newa==r2 && newb==c2){
                        ans=visited[newa][newb];
                        return;
                    }
                    queue.offer(new int[]{newa,newb});
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        r1=scanner.nextInt();
        c1=scanner.nextInt();
        r2=scanner.nextInt();
        c2=scanner.nextInt();

        map=new int[N][N];
        visited=new int[N][N];
        for(int i=0;i<N;i++){
            Arrays.fill(visited[i],-1);
        }
        visited[r1][c1]++;
        bfs();
        System.out.println(ans);

    }
}
