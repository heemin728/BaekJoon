import java.util.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

public class BOJ_1715 {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue=new PriorityQueue<>();
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int ans=0;

        for(int i=0;i<N;i++){
            queue.add(scanner.nextInt());
        }
        while(queue.size()>1){
            int a=queue.poll();
            int b=queue.poll();
            queue.add(a+b);
            ans+=(a+b);
        }
//        if(queue.size()==1) {
//            ans += queue.poll();
//        }
        System.out.println(ans);
        }
}

