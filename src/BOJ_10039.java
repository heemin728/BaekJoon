// 브론즈 4
import java.util.*;

public class BOJ_10039 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[5];
        int ans=0;
        for(int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
            if(arr[i]<40){
                arr[i]=40;
            }
            ans+=arr[i];
        }
        System.out.println(ans/5);
    }
}
