import java.util.*;
import java.io.*;

public class BOJ_1197 {
    static int E,V;
    static int[] parent;
    static int ans=0;

    static class edge implements Comparable<edge>{
        int start;
        int end;
        int cost;

        public edge(int start,int end,int cost){
            this.start=start;
            this.end=end;
            this.cost=cost;
        }

        @Override
        public int compareTo(edge o) {
            return this.cost-o.cost;
        }
    }

    static int find(int a){
        if(a==parent[a]) return a;
        else return parent[a]=find(parent[a]);
    }

    static void union(int a,int b){
        int ua=find(a);
        int ub=find(b);

        parent[ub]=ua;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");

        E=Integer.parseInt(st.nextToken());
        V=Integer.parseInt(st.nextToken());

        parent=new int[E+1];
        for(int i=1;i<=E;i++){
            parent[i]=i;
        }

        PriorityQueue<edge> queue=new PriorityQueue<>();
        for(int i=1;i<=V;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());

            queue.offer(new edge(a,b,c));
        }

        while(!queue.isEmpty()){
            edge poll=queue.poll();

            if(find(poll.start) != find(poll.end) ){
                ans+=poll.cost;
                union(poll.start,poll.end);
            }
        }
        System.out.println(ans);
    }
}
