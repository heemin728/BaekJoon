import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 실버4
public class BOJ_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        StringBuilder sb=new StringBuilder();

        Deque<Integer> deque=new LinkedList<>();

        int n=Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            st=new StringTokenizer(buffer.readLine());
            String command=st.nextToken();
            if(st.hasMoreTokens()){
                int target=Integer.parseInt(st.nextToken());
                switch(command){
                    case "push_front":
                        deque.offerFirst(target);
                        break;
                    case "push_back":
                        deque.offerLast(target);
                        break;
                }
            }
            else{
                switch (command){
                    case "pop_front":
                        if(deque.isEmpty()){
                            System.out.println(-1);
                        }
                        else{
                            System.out.println(deque.pollFirst());
                        }
                        break;
                    case "pop_back":
                        if(deque.isEmpty()){
                            System.out.println(-1);
                        }
                        else{
                            System.out.println(deque.pollLast());
                        }
                        break;

                    case "size":
                        System.out.println(deque.size());
                        break;

                    case "empty":
                        if(deque.isEmpty()){
                            System.out.println(1);
                        }
                        else{
                            System.out.println(0);
                        }
                        break;

                    case "front":
                        if(deque.isEmpty()){
                            System.out.println(-1);
                        }
                        else{
                            System.out.println(deque.peekFirst());
                        }
                        break;

                    case "back":
                        if(deque.isEmpty()){
                            System.out.println(-1);
                        }
                        else{
                            System.out.println(deque.peekLast());
                        }
                        break;
                }
            }
        }
    }
}
