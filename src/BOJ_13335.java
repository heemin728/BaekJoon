import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_13335 implements Cloneable{

    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");
        Queue<Integer> bridge=new LinkedList<>();
        Queue<Integer> truck=new LinkedList<>();

        int n=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        int L=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(buffer.readLine()," ");

        for(int i=0;i<n;i++){
            truck.add(Integer.parseInt(st.nextToken()));
        }
        int time=0;
        int weight=0;

        for(int i=0;i<w;i++){
            bridge.add(0);
        }
        int c=0;
        while(!bridge.isEmpty()){
            time++;
           weight-=bridge.poll();

            if(!truck.isEmpty()){
                if(weight+ truck.peek() <= L){
                    weight+=truck.peek();
                    bridge.offer(truck.poll());
                }
                else{
                    bridge.offer(0);
                }
            }

        }
        System.out.println(time);
    }
}
