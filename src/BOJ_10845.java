import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// 실버4

public class BOJ_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());

        int n=Integer.parseInt(st.nextToken());
        Queue<Integer> queue=new LinkedList<>();
        int recent=-1;

        for(int i=0;i<n;i++){

            st=new StringTokenizer(buffer.readLine());
            String command=st.nextToken();
            if(st.hasMoreTokens()){
                int tmp=Integer.parseInt(st.nextToken());
                queue.offer(tmp);
                recent=tmp;
            }
            else{
                switch (command){
                    case "pop":
                        if(!queue.isEmpty()) {
                            int value = queue.poll();
                            System.out.println(value);
                        }
                        else{
                            System.out.println(-1);
                        }
                        break;

                    case "size":
                        System.out.println(queue.size());
                        break;

                    case "empty":
                        if(queue.isEmpty()){
                            System.out.println(1);
                        }
                        else{
                            System.out.println(0);
                        }
                        break;

                    case "front":
                        if(queue.isEmpty()){
                            System.out.println(-1);
                        }
                        else{
                            System.out.println(queue.peek());
                        }
                        break;

                    case "back":
                        if(queue.isEmpty()){
                            System.out.println(-1);
                        }
                        else{
                            System.out.println(recent);
                        }
                        break;
                }
            }
        }
    }
}
