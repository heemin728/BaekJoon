// 골드 5
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2493 {
    static class Tower{
        int index;
        int height;

        public Tower(int index,int height){
            this.index=index;
            this.height=height;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        StringBuilder sb=new StringBuilder();

        Stack<Tower> stack=new Stack<>();

        int N=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(buffer.readLine()," ");
        for(int i=0;i<N;i++){

            int value=Integer.parseInt(st.nextToken());

            while (!stack.isEmpty()) {
                if(stack.peek().height > value){
                    sb.append(stack.peek().index).append(" ");
                    break;
                }
                stack.pop();
            }

            if(stack.isEmpty()){
                sb.append(0).append(" ");
            }
            stack.push(new Tower(i+1,value));
        }
        System.out.println(sb);
    }
}
