import java.io.*;
import java.util.*;

public class BOJ_11724 {
     static int[][] graph;
     static boolean[] visit;
     static int answer=0;
     static int N;
     static int M;

     static void bfs(int start){

         Queue<Integer> queue=new LinkedList<>();

         queue.add(start);

         while(!queue.isEmpty()){
             int poll=queue.poll();

             for(int i=1;i<=N;i++){
                 if(!visit[i] && graph[poll][i]==1){
                     visit[i]=true;
                     queue.add(i);
                 }
             }
         }
     }

    public static void main(String[] args) throws IOException{
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");
        StringBuilder sb=new StringBuilder();

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseUnsignedInt(st.nextToken());

        graph=new int[N+1][N+1];
        visit=new boolean[N+1];
        Arrays.fill(visit,false);

        for(int i=0;i<M;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            int n1=Integer.parseInt(st.nextToken());
            int n2=Integer.parseInt(st.nextToken());
            graph[n1][n2]=1;
            graph[n2][n1]=1;
        }

        int ans=0;

        for(int i=1;i<=N;i++){
            if(visit[i]){
                continue;
            }
            bfs(i);
            ans++;
        }
        System.out.println(ans);

    }
}
