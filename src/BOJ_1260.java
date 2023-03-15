import java.util.*;
import java.io.*;

public class BOJ_1260 {

    public static int[][] map;
    public static boolean[] visited;
    static StringBuilder sb=new StringBuilder();
    static int M,N,V;

    public static void dfs(int index){
        sb.append(index).append(" ");
        visited[index]=true;

        for(int i=1;i<=N;i++){
            if(!visited[i] && map[index][i]==1){
                dfs(i);
            }
        }
    }

    public static void bfs(){
        Arrays.fill(visited,false);
        Queue<Integer> queue=new LinkedList<>();

        queue.add(V);
        visited[V]=true;

        while(!queue.isEmpty()){
            int poll=queue.poll();
            sb.append(poll).append(" ");
            for(int i=1;i<map.length;i++){
                if(!visited[i] && map[poll][i]==1){
                    visited[i]=true;
                    queue.offer(i);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");


        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        V=Integer.parseInt(st.nextToken());

        map=new int[N+1][N+1];
        visited=new boolean[N+1];
        Arrays.fill(visited,false);

        for(int i=0;i<M;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            map[a][b]=1;
            map[b][a]=1;
        }
        dfs(V);
        sb.append("\n");
        bfs();

        System.out.println(sb);
    }
}
