import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_9251 {
    public static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        String s1=buffer.readLine();
        String s2=buffer.readLine();

        dp=new int[s1.length()+1][s2.length()+1];

        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                char a=s1.charAt(i-1);
                char b=s2.charAt(j-1);
                if(a==b){
                    System.out.println("a="+a+" b="+b);
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
//        System.out.println();
//        for(int i=1;i<=s1.length();i++){
//            for(int j=1;j<=s2.length();j++){
//                System.out.printf("%d ",dp[i][j]);
//            }
//            System.out.println();
//        }
        System.out.println(dp[s1.length()][s2.length()]);
    }
}
