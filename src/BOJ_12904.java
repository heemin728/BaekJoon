import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_12904 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        String S= buffer.readLine();
        String T=buffer.readLine();
        boolean isAns=false;
        String tmp=T;

        while(tmp.length()>0){
        //for(int i=0;i<10;i++){
            //System.out.println("tmp="+tmp);
            if(tmp.equals(S)) {
                isAns=true;
                break;
            }
            if(tmp.charAt(tmp.length()-1)=='A'){
                tmp=tmp.substring(0,tmp.length()-1);
            }
            else if (tmp.charAt(tmp.length()-1)=='B'){
                tmp=tmp.substring(0,tmp.length()-1);
                StringBuffer sb=new StringBuffer(tmp);
                tmp=sb.reverse().toString();
            }

        }
        if(isAns) System.out.println(1);
        else System.out.println(0);

    }
}
