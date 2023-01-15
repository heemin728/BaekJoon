import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_15903 {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        PriorityQueue<Long> queue=new PriorityQueue<>();

        st=new StringTokenizer(buffer.readLine()," ");
        for(int i=0;i<n;i++){
            queue.add((Long.parseLong(st.nextToken())));
        }

        for(int i=0;i<m;i++){
            Long a=queue.poll();
            Long b=queue.poll();
            Long New=a+b;
            queue.add(New);
            queue.add(New);
        }
        long ans=0;
        while(!queue.isEmpty()){
            ans+=queue.poll();
        }
        System.out.println(ans);

    }
}
