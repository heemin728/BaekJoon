import java.util.*;

public class BOJ_2822 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        PriorityQueue<int[]> queue=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        });
        for(int i=0;i<8;i++){
            int tmp=scanner.nextInt();
            queue.add(new int[]{i+1,tmp});
        }
        int sum=0;
        int[] ans=new int[5];
        for(int i=0;i<5;i++){
            if(!queue.isEmpty()) {
                sum += queue.peek()[1];
                ans[i] = queue.poll()[0];
            }
        }
        System.out.println(sum);
        Arrays.sort(ans);
        for(int i=0;i<5;i++){
            System.out.printf("%d ",ans[i]);
        }
    }
}
