import java.util.*;

public class BOJ_2212 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N=scanner.nextInt();
        int K=scanner.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> diff=new ArrayList<>();

        for(int i=0;i<N;i++){
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        for(int i=0;i<N-1;i++){
            diff.add(list.get(i+1)-list.get(i));
        }
        Collections.sort(diff);

        int sum=0;
        for(int i=0;i<N-K;i++){
            sum+=diff.get(i);
        }
        System.out.println(sum);

    }
}
