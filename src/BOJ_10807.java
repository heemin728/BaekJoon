// 브론즈5
import java.util.*;

public class BOJ_10807 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();

        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
        }
        int ans=0;
        int value=scanner.nextInt();
        for(int i=0;i<N;i++){
            if(arr[i]==value) ans++;
        }
        System.out.println(ans);
    }
}
