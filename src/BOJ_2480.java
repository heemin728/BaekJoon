// 브론즈 4
import java.util.*;

public class BOJ_2480 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int ans=0;

        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();

        if(a==b && b==c){
            ans=10000+a*1000;
        }
        else if( a==b && b!=c){
            ans=1000+a*100;
        }
        else if(b==c && c!=a){
            ans=1000+b*100;
        }
        else if(c==a && c!=b){
            ans=1000+c*100;
        }
        else{
            PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
            queue.offer(a);
            queue.offer(b);
            queue.offer(c);

            ans=100*queue.poll();
        }
        System.out.println(ans);
    }
}
