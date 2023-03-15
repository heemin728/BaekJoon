import java.util.*;
import java.io.*;

public class BOJ_1012 {
    static int[][] cabbage;
    static int[] dr={1,-1,0,0};
    static int[] dc={0,0,-1,1};

    static int bfs(){
        Queue<int[]> queue=new LinkedList<>();

        int height=cabbage.length;
        int width=cabbage[0].length;
        int ans=0;

        for(int i=0;i< height ;i++){
            for(int j=0;j< width ;j++){

                if(cabbage[i][j]==1){

                    ans++;
                    queue.offer(new int[]{i,j});

                    while(!queue.isEmpty()){
                        int a=queue.peek()[0];
                        int b=queue.poll()[1];

                        for(int k=0;k<4;k++){
                            int newa=a+dr[k];
                            int newb=b+dc[k];

                            if(newa>=0 && newa<height && newb>=0 && newb<width && cabbage[newa][newb]==1 ){
                                cabbage[newa][newb]=0;
                                queue.offer(new int[]{newa,newb});
                            }
                        }
                    }
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();

        int T=Integer.parseInt(buffer.readLine());
        for(int i=0;i<T;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            int M=Integer.parseInt(st.nextToken());
            int N=Integer.parseInt(st.nextToken());
            int K=Integer.parseInt(st.nextToken());

            cabbage=new int[N][M];

            for(int j=0;j<K;j++) {
                st = new StringTokenizer(buffer.readLine(), " ");
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());

                cabbage[m][n] = 1;
            }

            sb.append(bfs()).append("\n");

        }
        System.out.println(sb);
    }
}
