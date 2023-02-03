// 실버 3

import java.util.Scanner;

public class BOJ_2193 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();

        if( N==1 || N==2 ){
            System.out.println(1);
            return;
        }
        long[] zero=new long[N+1];
        long[] one=new long[N+1];

        zero[1]=0;
        one[1]=1;
        zero[2]=1;
        one[2]=0;

        for(int i=3;i<=N;i++){
            zero[i]=zero[i-1]+one[i-1];
            one[i]=zero[i-1];
        }
        System.out.println(zero[N]+one[N]);
    }
}
