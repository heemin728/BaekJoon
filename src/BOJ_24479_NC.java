import java.util.*;
import java.io.*;

public class BOJ_24479_NC {
    static ArrayList<Integer>[] map;

    static int M,N,R;
    static boolean[] check;
    static int[] order;
    static int num=1;

    static void dfs(int start){
        order[start]=num++;
        for(int i:map[start]){
            if(order[i]==0){
                dfs(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");
        StringBuilder sb=new StringBuilder();

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        R=Integer.parseInt(st.nextToken());

        map=new ArrayList[N+1];
        check=new boolean[N+1];
        Arrays.fill(check,false);
        order=new int[N+1];

        for(int i=1;i<=N;i++){
            map[i]=new ArrayList<>();
        }

        for(int i=0;i<M;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            int n1=Integer.parseInt(st.nextToken());
            int n2=Integer.parseInt(st.nextToken());

            map[n1].add(n2);
            map[n2].add(n1);
        }
        for(int i=1;i<=N;i++){
            Collections.sort(map[i]);
        }

        dfs(R);
//        for(int i=1;i<=N;i++){
//            for(Integer j:map[i]){
//                System.out.printf("%d ",j);
//            }
//            System.out.println();
//        }

        for(int i=1;i<=N;i++){
            System.out.printf("%d ",order[i]);
        }
    }
}
