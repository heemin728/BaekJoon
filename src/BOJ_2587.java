// 브론즈 2
import java.io.*;
import java.util.Arrays;

public class BOJ_2587 {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int[] arr=new int[5];
        int ave=0;
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(buffer.readLine());
            ave+=arr[i];
        }
        Arrays.sort(arr);

        sb.append(ave/5).append("\n");
        sb.append(arr[2]);
        System.out.println(sb);

    }
}
