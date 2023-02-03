// 브론즈 4
import java.util.*;
public class BOJ_2440 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();

        for(int i=N;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
