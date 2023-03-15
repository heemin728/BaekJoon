import java.util.*;
import java.io.*;

public class BOJ_15900 {
    static ArrayList<Integer>[] list;
    static int N;
    static int depth=0;

    static void dfs(int start,int parent, int cnt){

        if(start!=1 && list[start].size()==1){
            depth+=cnt;
        }
        for(int i:list[start]){
            if(i==parent) continue;
            dfs(i,start,cnt+1);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());

        N=Integer.parseInt(st.nextToken());
        list=new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            list[i]=new ArrayList<>();
        }

        for(int i=0;i<N-1;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        dfs(1,1,0);
        if(depth%2==0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

    }
}
