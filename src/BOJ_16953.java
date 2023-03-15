import java.util.*;

public class BOJ_16953 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int A= scanner.nextInt();
        int B= scanner.nextInt();

        int value=B;
        int ans=0;
        while(value > A){

            ans++;
            if( value % 10 == 1 ){
                String tmp=Integer.toString(value);
                tmp=tmp.substring(0,tmp.length()-1);
                value=Integer.parseInt(tmp);
            }
            else if( value % 2==0 ){
                value=value/2;
            }
            else{
                break;
            }
            //System.out.printf("value=%d\n",value);
        }
        if(value==A) System.out.println(ans+1);
        else System.out.println(-1);
    }
}
