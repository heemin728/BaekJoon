// 브론즈 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1083 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");
        StringBuilder sb=new StringBuilder();

        int x=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());

        int cord=Math.min(Math.abs(w-x),Math.abs(h-y));
        int zero=Math.min(x,y);
        int ans=Math.min(cord,zero);
        sb.append(ans);
        System.out.println(sb);
    }
}
