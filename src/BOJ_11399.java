import java.util.*;
public class BOJ_11399 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int N=scanner.nextInt();

        Integer[] p=new Integer[N];
        for(int i=0;i<N;i++) {
            p[i]=scanner.nextInt();
        }
        List<Integer> P=Arrays.asList(p);
        Collections.sort(P);

        int sum=0;
        for(int i=0;i<N;i++){
            sum+=P.get(i)*(N-i);
        }
        System.out.println(sum);
//        for(Integer i : P){
//            System.out.print(i+" ");
//        }
//        System.out.println();

    }
}
// 정답
