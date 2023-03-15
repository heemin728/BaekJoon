import java.io.*;
import java.util.*;

public class BOJ_2606 {

    public static int[][] network;
    public static boolean[] check;

    public static int bfs(){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        int ans=0;
        while(!queue.isEmpty()){
            int poll=queue.poll();

            for(int i=1;i< network.length;i++){
                // 서로 이어져있는 노드 && 방문한 적 없는 노드
                if(network[poll][i]==1 && !check[i]){
                    ans++;
                    queue.add(i);
                    check[i]=true;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());

        int node=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(buffer.readLine());
        int edge=Integer.parseInt(st.nextToken());

        network=new int[node+1][node+1];
        check=new boolean[node+1];
        Arrays.fill(check,false);

        for(int i=0;i<edge;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            // 서로 연결되었다는 뜻이니까 1로 설정
            network[a][b]=1;
            network[b][a]=1;
        }
        System.out.println(bfs()-1);

    }
}
