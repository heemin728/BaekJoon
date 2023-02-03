import java.util.*;
// 브론즈 3
public class BOJ_10817 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
