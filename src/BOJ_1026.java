import java.util.*;

public class BOJ_1026 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N=scanner.nextInt();
        ArrayList<Integer> A=new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();

        for(int i=0;i<N;i++){
            A.add(scanner.nextInt());
        }
        for(int i=0;i<N;i++){
            B.add(scanner.nextInt());
        }
        Collections.sort(A);
        Collections.sort(B,Comparator.reverseOrder());

        int ans=0;
        for(int i=0;i<N;i++){
            ans+=(A.get(i)*B.get(i));
        }
        System.out.println(ans);
    }
}
