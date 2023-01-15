import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//실버 4

public class BOJ_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());

        int n=Integer.parseInt(st.nextToken());

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++){

            st=new StringTokenizer(buffer.readLine());
            String command=st.nextToken();
//            System.out.println("i="+i);
//            System.out.println(command);
            if(st.hasMoreTokens()){
                int push_value=Integer.parseInt(st.nextToken());
                stack.push(push_value);
            }
            else{

                switch (command){

                    case "pop":
                        if(stack.isEmpty()){
                            System.out.println("-1");
                        }
                        else {
                            int t=stack.pop();
                            System.out.println(t);
                        }
                        break;

                    case "size":
                        System.out.println(stack.size());
                        break;

                    case "empty":
                        if(stack.isEmpty()){
                            System.out.println(1);
                        }
                        else{
                            System.out.println(0);
                        }
                        break;

                    case "top":
                        if(stack.isEmpty()){
                            System.out.println(-1);
                        }
                        else{
                            System.out.println(stack.peek());
                        }
                        break;
                }
            }
        }
    }
}
