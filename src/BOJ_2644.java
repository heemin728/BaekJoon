// 실버 2
import java.util.*;
import java.io.*;

public class BOJ_2644 {
    static int[][] family;
    static boolean[] check;
    public static int bfs(int p1,int p2){

        int[] count=new int[family.length];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(p1);
        int ans=0;

        while(!queue.isEmpty()){
            int poll=queue.poll();
            if(poll==p2){
                return count[p2];
            }
            for(int i=1;i<family.length;i++){
                if(family[poll][i]==1 && !check[i]){
                    queue.add(i);
                    check[i]=true;
                    count[i]=count[poll]+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        StringBuilder sb=new StringBuilder();

        int n=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(buffer.readLine()," ");
        int person_a=Integer.parseInt(st.nextToken());
        int person_b=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(buffer.readLine());

        family=new int[n+1][n+1];
        check=new boolean[n+1];
        Arrays.fill(check,false);
        for(int i=0;i<m;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            family[a][b]=1;
            family[b][a]=1;
        }
        System.out.println(bfs(person_a,person_b));
    }
}
