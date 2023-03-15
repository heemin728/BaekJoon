import java.util.*;
import java.io.*;

public class BOJ_1373 {

    static String getNum(String token){
        int ret=0;

        StringBuffer sb=new StringBuffer(token);
        token=sb.reverse().toString();
        for(int i=0;i<token.length();i++){
            int num=Integer.parseInt(token.substring(i,i+1));
            ret+=Math.pow(2,i)*num;
        }
        return Integer.toString(ret);
    }

    public static void main(String[] args) {


        for (int j = 0; j < 5; j++) {
            Random random = new Random();
            String input = "";
            for (int i = 0; i < 5; i++) {
                input = input.concat(Integer.toString(random.nextInt(2)));
            }
            System.out.printf(input + " ");

            StringBuilder sb = new StringBuilder();
            //String input=scanner.next();

            int remain = input.length() % 3;
            int div = input.length() / 3;

            if (remain != 0) {
                String tmp = input.substring(0, remain);
                sb.append(getNum(tmp));
            }

            int ind = remain;
            for (int i = 0; i < div; i++) {
                String tmp = input.substring(ind, ind + 3);
                sb.append(getNum(tmp));
                ind += 3;
            }
            System.out.println(sb);
        }
    }
}


