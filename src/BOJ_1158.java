// 실버 4
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class BOJ_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        Queue<Integer> queue=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<=N;i++){
            queue.offer(i);
        }

        boolean isEnd=false;

        while(!queue.isEmpty()){

            for(int i=0;i<K;i++){
                if(queue.isEmpty()){
                    isEnd=true;
                    break;
                }

                int tmp=queue.poll();
                if(i==K-1) ans.add(tmp);
                else{
                    queue.offer(tmp);
                }
            }
            if(isEnd){
                break;
            }

        }
        for(int i=0;i<ans.size();i++){
            if(i==0) System.out.print("<");
            System.out.print(ans.get(i));
            if(i==ans.size()-1) System.out.print(">");
            else System.out.print(", ");
        }
    }
}
