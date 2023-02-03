import java.io.*;
import java.util.*;
public class BOJ_1850 {
    public static void main(String[] args) throws IOException {
//        Scanner scanner=new Scanner(System.in);
//        long A=scanner.nextLong();
//        long B= scanner.nextLong();
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");
        long a=Long.parseLong(st.nextToken());
        long b=Long.parseLong(st.nextToken());
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        // 유클리드 호제법ㅎ
        if(a < b) {
            long temp = a;
            a = b;
            b = temp;
        }

        while(b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        while(a-- > 0) {
            bw.write("1");
        }
        bw.flush();
        bw.close();

        }
    }

