// dp
import java.util.*;
import java.io.*;

public class BOJ_11055 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] arr=new int[N];
        int[] dp=new int[N];

        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
        }

        dp[0]=arr[0];
        int ans=0;

        for(int i=0;i<N;i++){
            dp[i]=arr[i];
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    dp[i]=Math.max(dp[i],dp[j]+arr[i]);
                }
            }
        }
//        for(int i:dp){
//            System.out.printf("%d ",i);
//        }
//        System.out.println();
        ans=Arrays.stream(dp).max().getAsInt();
        System.out.println(ans);
    }
}
