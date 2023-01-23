// 실버1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BOJ_1629 {

    static public long answer(long a, long b, long c)
    {
        long tmp;
        if(b==1)
            return a%c;

        if(b%2==0) {
            tmp= answer(a,b/2,c);
            return (tmp*tmp)%c;
        }
        else if (b%2==1) {
            tmp= answer(a,b-1,c);
            return (a*tmp)%c;
        }

        return 0;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");
        long a= Long.parseLong(st.nextToken());
        long b=Long.parseLong(st.nextToken());
        long c=Long.parseLong(st.nextToken());

        sb.append(answer(a,b,c)%c);
        System.out.println(sb);

    }
}
