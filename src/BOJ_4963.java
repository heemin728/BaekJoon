import java.io.*;
import java.util.*;

public class BOJ_4963 {
    static int[][] arr;
    static int h,w;
    static int[] move1={0,0,1,-1,-1,1,1,-1};
    static int[] move2={1,-1,0,0,1,-1,1,-1};
    static StringBuilder sb=new StringBuilder();

    public static void bfs(){

        Queue<int[]> queue=new LinkedList<>();

        int cnt=0;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(arr[i][j]==1){
                    queue.offer(new int[]{i,j});

                    cnt++;

                    while(!queue.isEmpty()){
                        int polla=queue.peek()[0];
                        int pollb=queue.poll()[1];

                        arr[polla][pollb]=0;

                        for(int k=0;k<8;k++){
                            int newa=polla+move1[k];
                            int newb=pollb+move2[k];

                            if(newa>=0 && newb>=0 && newa<h && newb<w && arr[newa][newb]==1){
                                queue.offer(new int[]{newa,newb});
                                arr[newa][newb]=0;
                            }
                        }
                    }
                }
            }
        }
        sb.append(cnt).append("\n");

    }
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st=new StringTokenizer(buffer.readLine()," ");
            w=Integer.parseInt(st.nextToken());
            h=Integer.parseInt(st.nextToken());
            if(w==0 && h==0) break;

            // 배열 저장
            arr=new int[h][w];
            for(int i=0;i<h;i++){
                st=new StringTokenizer(buffer.readLine()," ");
                for(int j=0;j<w;j++){
                    arr[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            bfs();
        }

        System.out.println(sb);
    }
}
