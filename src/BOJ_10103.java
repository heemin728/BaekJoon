import java.util.*;

public class BOJ_10103 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int A=100;
        int B=100;
        for(int i=0;i<n;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if(a==b){
                continue;
            }
            else if(a>b){
                B-=a;
            }
            else{
                A-=b;
            }
        }
        System.out.println(A);
        System.out.println(B);
    }
}
