import java.util.*;

public class BOJ_11866 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N=scanner.nextInt();
        int K=scanner.nextInt();

        Queue<Integer> queue=new LinkedList<>();
        for(int i=1;i<=N;i++){
            queue.add(i);
        }

        System.out.printf("<");
        while (!queue.isEmpty()) {
            for(int i=0;i<K-1;i++){
                queue.add(queue.poll());
            }
            System.out.printf("%d",queue.poll());
            if(queue.size()!=0){
                System.out.printf(", ");
            }
        }
        System.out.println(">");
    }
}
