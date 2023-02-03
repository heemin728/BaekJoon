// 브론즈 5
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr=new boolean[31];
        Arrays.fill(arr,false);
        int number;
        for(int i=0;i<28;i++){
            number=Integer.parseInt(buffer.readLine());
            arr[number]=true;
        }
        for(int i=1;i<=30;i++){
            if(!arr[i]){
                System.out.println(i);
            }
        }

    }
}
