import java.util.*;

public class BOJ_11123 {
    static int H,W;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    static int ans=0;

    static boolean isInRange(int a, int b){
        return a>=0 && b>=0 && a<H && b<W;
    }

    static void dfs(int a,int b){
        visited[a][b]=true;

        for(int k=0;k<4;k++){
            int newa=a+dx[k];
            int newb=b+dy[k];

            if(isInRange(newa,newb) && !visited[newa][newb] && map[newa][newb]=='#'){
                dfs(newa,newb);
            }
        }
    }

    static public void bfs(){
        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(map[i][j]=='#'){
                    ans++;
                    queue.offer(new int[]{i,j});

                    while(!queue.isEmpty()){
                        int polla=queue.peek()[0];
                        int pollb=queue.poll()[1];

                        for(int k=0;k<4;k++){
                            int newa=polla+dx[k];
                            int newb=pollb+dy[k];

                            if(isInRange(newa,newb) && map[newa][newb]=='#'){
                                queue.offer(new int[]{newa,newb});
                                map[newa][newb]='.';
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for(int i=0;i<T;i++){
            ans=0;
            H=scanner.nextInt();
            W=scanner.nextInt();

            map=new char[H][W];
            visited=new boolean[H][W];

            for(int j=0;j<H;j++){
                String tmp=scanner.next();
                for(int k=0;k<W;k++){
                    map[j][k]=tmp.charAt(k);
                }
            }


            // dfs 풀이
//            for(int j=0;j<H;j++){
//                for(int k=0;k<W;k++){
//                    if(!visited[j][k] && map[j][k]=='#'){
//                        dfs(j,k);
//                        ans++;
//                    }
//                }
//            }

            // bfs 풀이
            bfs();
            System.out.println(ans);
        }
    }
}
