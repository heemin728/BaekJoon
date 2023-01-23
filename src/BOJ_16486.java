// 브론즈 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_16486 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int d1=Integer.parseInt(buffer.readLine());
        int d2=Integer.parseInt(buffer.readLine());

        final double pi=3.141592;
        double ans=(d1*2) + (pi * 2 * d2);
        sb.append(ans);
        System.out.println(ans);
    }
}
