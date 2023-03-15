import java.util.*;
import java.io.*;

public class BOJ_1389_NC {
    static int N,M;
    static ArrayList<ArrayList<Integer>> map=new ArrayList<>();
    static boolean[] visited;
    static int[] count;

    public static int bfs(int start){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(start);

        visited[start]=true;

        while(!queue.isEmpty()){
            int poll=queue.poll();
            for(int value:map.get(poll)){
                visited[value]=true;

            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        for(int i=0;i<N;i++){
            map.add(new ArrayList<>());
        }

        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            map.get(a).add(b);
            map.get(b).add(a);
        }

        int min=Integer.MAX_VALUE;
        int index=0;

        for(int i=1;i<=N;i++){
            visited=new boolean[N+1];
            count=new int[N+1];

            int kevinBacon=bfs(i);
            if(kevinBacon<min){
                min=kevinBacon;
                index=i;
            }
        }
        System.out.println(index);


    }
}
