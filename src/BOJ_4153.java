// 브론즈 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();

        int a,b,c;
        int big,small,other;


        while(true){
            st=new StringTokenizer(buffer.readLine()," ");
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            c=Integer.parseInt(st.nextToken());

            if(a==0 && b==0 && c==0){
                break;
            }

            big= (a>b) && (a>c) ? a : Math.max(b,c);
            small= (a<b) && (a<c) ? a : Math.min(b,c);
            other= (a<b) && (a>c) ? a : ( ((b>c) && (b<a)) || ((b>a) && (b<c)) ? b : c);

            if(Math.pow(big,2)==Math.pow(small,2)+Math.pow(other,2)){
                sb.append("right\n");
            }
            else{
                sb.append("wrong\n");
            }

        }
        System.out.println(sb);
    }
}
