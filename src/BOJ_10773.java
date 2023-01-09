import java.util.*;

public class BOJ_10773 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int former=0;
        int sum=0;
        int K=scanner.nextInt();
        Stack<Integer> S=new Stack<>();

        for(int i=0;i<K;i++){
            int tmp=scanner.nextInt();
            if(tmp==0 && !S.isEmpty()){
                S.pop();
            }
            else{
                S.push(tmp);
            }
        }
        for(Integer i:S){
            sum+=i;
        }
        System.out.println(sum);
    }
}
