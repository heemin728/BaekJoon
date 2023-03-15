import java.util.*;
import java.io.*;

public class BOJ_2667 {
    static StringBuilder sb=new StringBuilder();
    static int[][] map;
    static int N;
    static int[] move1={1,-1,0,0,0};
    static int[] move2={0,0,1,-1,0};
    static int ans=0;
    static ArrayList<Integer> list=new ArrayList<>();

    public static void bfs(){
        Queue<int[]> queue=new LinkedList<>();

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(map[i][j]==1){
                    queue.add(new int[]{i,j});
                    ans++;

                    int count=0;
                    while(!queue.isEmpty()){
                        int polla=queue.peek()[0];
                        int pollb=queue.poll()[1];

                        for(int k=0;k<5;k++){
                            int newa=polla+move1[k];
                            int newb=pollb+move2[k];

                            if(newa>0 && newb>0 && newa<=N && newb<=N && map[newa][newb]==1){
                                count++;
                                queue.add(new int[]{newa,newb});
                                map[newa][newb]=0;
                            }

                        }
                    }
                    list.add(count);
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));


        N=Integer.parseInt(buffer.readLine());
        map=new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            String line=buffer.readLine();
            for(int j=1;j<=N;j++){
                map[i][j]=line.charAt(j-1)-'0';
            }
        }

        bfs();
        Collections.sort(list);
        for(Integer i:list){
            System.out.printf("%d\n",i);
        }

    }
}
