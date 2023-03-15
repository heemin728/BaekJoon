import java.util.*;

public class BOJ_1351 {
    static long N;
    static int P,Q;
    static Map<Long,Long> map=new HashMap<>();

    static long solution(long n){

        if(n==0) return 1;
        if(map.containsKey(n)) return map.get(n);

        long a=(long)Math.floor(n/P);
        long b=(long)Math.floor(n/Q);

        map.put(n,solution(a)+solution(b));
        return map.get(n);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        N=scanner.nextLong();
        P=scanner.nextInt();
        Q=scanner.nextInt();

        System.out.println(solution(N));

    }
}
