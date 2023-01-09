import java.util.*;
public class BOJ_11047 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int K=scanner.nextInt();

        List<Integer> coins=new ArrayList<>();

        for(int i=0;i<N;i++){
            coins.add(scanner.nextInt());
        }
        Collections.sort(coins,Comparator.reverseOrder());

        int i=0;
        int count=0;
        while(K>0){
            if(K>=coins.get(i)) {
                K -= coins.get(i);
                count++;
            }
            else{
                i++;
            }

        }
        System.out.println(count);
//        for(Integer i : coins){
//            System.out.println(i+" ");
//        }
//        System.out.println();
//
    }
}
