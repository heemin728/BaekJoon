import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class BOJ_11729 {
    private static final StringBuilder output = new StringBuilder();
    public static void Hanoi_count(int N,int start,int middle,int end){
        if(N==1){
            //System.out.printf("%d %d\n",start,end);
            output.append(start).append(" ").append(end).append("\n");
            return;
        }
        else{
            Hanoi_count(N-1,start,end,middle);
            //System.out.printf("%d %d\n",start,end);
            output.append(start).append(" ").append(end).append("\n");
            Hanoi_count(N-1,middle,start,end);
        }
    }

    public static void main(String[] args) throws IOException {
        //Scanner scanner=new Scanner(System.in);

//        int N=scanner.nextInt();
//        System.out.println((int)Math.pow(2,N)-1);
//        Hanoi_count(N,1,2,3);

        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(buffer.readLine());
        buffer.close();
        output.append((int) (Math.pow(2, N) - 1)).append("\n");
        Hanoi_count(N,1,2,3);
        System.out.println(output);

    }
}
