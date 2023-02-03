// 브론즈 5
import java.util.Scanner;

public class BOJ_2754 {
    public static void main(String[] args) {
//        A+: 4.3, A0: 4.0, A-: 3.7
//        B+: 3.3, B0: 3.0, B-: 2.7
//        C+: 2.3, C0: 2.0, C-: 1.7
//        D+: 1.3, D0: 1.0, D-: 0.7
//        F: 0.0
        Scanner scanner=new Scanner(System.in);
        float ans=0;
        String input=scanner.next();
        switch(input.charAt(0)){
            case 'A': ans+=4.0; break;
            case 'B': ans+=3.0; break;
            case 'C': ans+=2.0; break;
            case 'D': ans+=1.0; break;
            case 'F':
                System.out.println(0.0);
                return;
        }
        switch(input.charAt(1)){
            case '+': ans+=0.3; break;
            case '-': ans-=0.3; break;
        }
        System.out.println(ans);
    }
}
