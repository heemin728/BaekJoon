import java.util.*;
import java.io.*;

public class BOJ_7576_NC {
    static int M;
    static int N;
    static int[][] tomato;
    static int[][] date;
    static int[] move1={1,-1,0,0,0};
    static int[] move2={0,0,1,-1,0};
    static Queue<int[]> queue=new LinkedList<>();

    static void bfs(){

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(tomato[i][j]==1){
                    queue.offer(new int[]{i,j});

                    while(!queue.isEmpty()){
                        int polla=queue.peek()[0];
                        int pollb=queue.poll()[1];


                        boolean check=true;

                        for(int k=0;k<5;k++){
                            int newa=polla+move1[k];
                            int newb=pollb+move2[k];

                            if(newa>=0 && newb>=0 && newa<N && newb<M && tomato[newa][newb]==0 && date[newa][newb]==-1 ){
                                tomato[newa][newb]++;
                                queue.offer(new int[]{newa,newb});
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");

        M=Integer.parseInt(st.nextToken());
        N=Integer.parseInt(st.nextToken());
        tomato=new int[N][M];
        date=new int[N][M];

        for(int i=0;i<N;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            for(int j=0;j<M;j++){
                tomato[i][j]=Integer.parseInt(st.nextToken());
                if(tomato[i][j]==1){
                    date[i][j]=0;
                    queue.offer(new int[]{i,j});
                }
                else{
                    date[i][j]=-1;
                }
            }
        }
        bfs();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.printf("%d ",tomato[i][j]);
            }
            System.out.println();
        }
        int result=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(result<date[i][j]){
                    result=date[i][j];
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(date[i][j]==-1 && tomato[i][j]!=-1){
                    result=-1;
                }
            }
        }
        System.out.println(result);
    }
}
