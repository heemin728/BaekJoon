import java.util.*;
import java.io.*;

public class BOJ_1922 {
    static int N,M;
    static int[] parent;
    static int answer=0;

    static class edge implements Comparable<edge>{
        int start;
        int end;
        int weight;

        public edge(int start,int end,int weight){
            this.start=start;
            this.end=end;
            this.weight=weight;
        }

        @Override
        public int compareTo(edge o) {
            return this.weight-o.weight;
        }
    }

    // 최상위 부모 노드 반환(아마?)
    static int find(int p){
        if(parent[p]==p) return p;
        else return parent[p]=find(parent[p]);
    }

    // 서로 연결된 간선의 부모노드를 동일화(노드번호가 작은 쪽으로)
    static void union(int a,int b){

        // 이어진 간선에서, 한쪽의 최종부모=ua
        int ua=find(a);
        // 이어진 간선에서, 다른쪽의 최종부모=ub
        int ub=find(b);

        // 부모 통일화
        parent[ua]=ub;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N=Integer.parseInt(buffer.readLine());
        M=Integer.parseInt(buffer.readLine());

        PriorityQueue<edge> queue=new PriorityQueue<>();
        parent=new int[N+1];
        for(int i=1;i<=N;i++){
            parent[i]=i;
        }
        for(int i=0;i<M;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());

            // 우선순위 큐이므로 비용을 기준으로 오름차순 정렬
            queue.offer(new edge(a,b,c));
        }

        while(!queue.isEmpty()){
            // 가장 비용이 낮은 간선
            edge poll=queue.poll();

            // 간선 시작의 부모노드와 간선 끝의 부모도드가 같으면 순환되는 구조가 되어버림
            if(find(poll.start)!=find(poll.end)){
                // 최소 비용 정답에 더해주고
                answer+=poll.weight;
                // 부모노드 변경 (집합에 포함시킴)
                union(poll.start,poll.end);
            }
        }
        System.out.println(answer);
    }
}