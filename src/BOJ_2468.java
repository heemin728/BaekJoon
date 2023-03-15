import java.util.*;
import java.io.*;

public class BOJ_2468 {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};

    static boolean isInRange(int a,int b){
        return a>=0 && b>=0 && a<N && b<N;
    }
    static int bfs(int rainy){

        Queue<int[]> queue=new LinkedList<>();
        int ret=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                // 물에 잠기지 않는 부분
                if(!visited[i][j] && map[i][j]>rainy){
                    queue.offer(new int[]{i,j});
                    //System.out.printf("%d %d\n",i,j);
                    ret++;
                    while(!queue.isEmpty()){
                        int a=queue.peek()[0];
                        int b=queue.poll()[1];
                        visited[a][b]=true;

                        for(int k=0;k<4;k++){
                            int newa=a+dx[k];
                            int newb=b+dy[k];

                            if(isInRange(newa,newb) && !visited[newa][newb] && map[newa][newb]>rainy){
                                visited[newa][newb]=true;
                                queue.add(new int[]{newa,newb});
                            }
                        }
                    }
                }
            }
        }
        return ret;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N=Integer.parseInt(buffer.readLine());
        map=new int[N][N];

        for(int i=0;i<N;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            for(int j=0;j<N;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }


        int max=1;
        for(int i=1;i<=100;i++){
            visited=new boolean[N][N];
            int val=bfs(i);
            if(val>max){
                max=val;
            }
            //System.out.printf("%d -> %d\n",i,val);
        }
        System.out.println(max);
    }
}
