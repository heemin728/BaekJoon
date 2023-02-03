// 브론즈 5

import java.util.Scanner;

public class BOJ_2475 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int ans=0;
        for(int i=0;i<5;i++){
            int value= scanner.nextInt();
            ans+= (value*value);
        }
        ans%=10;
        System.out.println(ans);
    }
}

