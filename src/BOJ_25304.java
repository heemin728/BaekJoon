// 브론즈 5;

import java.util.Scanner;

public class BOJ_25304 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int X= scanner.nextInt();
        int N=scanner. nextInt();
        int ans=0;
        for(int i=0;i<N;i++){
            int val= scanner.nextInt();
            int price=scanner.nextInt();
            ans+=(val*price);
        }
        if(ans==X){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
