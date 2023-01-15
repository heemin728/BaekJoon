// 실버 5
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BOJ_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int n=Integer.parseInt(buffer.readLine());
        Queue<Integer> queue=new LinkedList<>();

        for(int i=1;i<=n;i++){
            queue.offer(i);
        }
        while(queue.size()>1){
            sb.append(queue.poll()).append(" ");
            queue.offer(queue.poll());
        }
        int ans=queue.peek();
        sb.append(ans).append("\n");
        System.out.println(sb);
    }
}

