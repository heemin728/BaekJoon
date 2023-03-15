import java.util.*;
import java.io.*;
public class Bronze {

    public static void main(String[] args) throws IOException {
        // Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st=new StringTokenizer(buffer.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(a==0 && b==0){
                break;
            }
            // 1. 첫 번째 숫자가 두 번째 숫자의 약수이다. -> 테스트
            if(a<b){
                if(b%a==0){
                    sb.append("factor").append("\n");
                }
                else{
                    sb.append("neither").append("\n");
                }
            }
            else if(a>b){
                if(a%b==0){
                    sb.append("multiple").append("\n");
                }
                else{
                    sb.append("neither").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
