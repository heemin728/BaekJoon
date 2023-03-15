import java.io.*;
import java.util.*;

public class BOJ_2583 {
    static int M,N,K;
    static int[][] map;
    static int[] move1={1,-1,0,0};
    static int[] move2={0,0,1,-1};
    static ArrayList<Integer> list=new ArrayList<>();
    static int cnt=0;

    public static void bfs(){

        Queue<int[]> queue=new LinkedList<>();

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(map[i][j]==0){
                    queue.offer(new int[]{i,j});
                    cnt++;

                    int area=1;
                    while(!queue.isEmpty()){

                        int polla=queue.peek()[0];
                        int pollb=queue.poll()[1];
                        map[polla][pollb]=1;

                        for(int k=0;k<4;k++){
                            int newa=polla+move1[k];
                            int newb=pollb+move2[k];

                            if(newa>=0 && newb>=0 && newa<M && newb<N && map[newa][newb]==0 ){
                                area++;
                                map[newa][newb]=1;
                                queue.offer(new int[]{newa,newb});
                            }
                        }
                    }
                    list.add(area);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");

        M=Integer.parseInt(st.nextToken());
        N=Integer.parseInt(st.nextToken());
        K=Integer.parseInt(st.nextToken());

        map=new int[M+1][N+1];

        for(int i=0;i<K;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            int x1=Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());

            for(int x=x1;x<x2;x++){
                for(int y=y1;y<y2;y++){
                    map[y][x]=1;
                }
            }
        }
        bfs();
        Collections.sort(list);
        System.out.println(cnt);
        for(Integer i:list){
            System.out.printf("%d ",i);
        }
//        for(int i=0;i<M;i++){
//            for(int j=0;j<N;j++){
//                System.out.printf("%d ",map[i][j]);
//            }
//            System.out.println();
//        }
    }
}
