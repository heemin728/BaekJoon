// 브론즈 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");

        int[] user=new int[6];
        int[] ans={1,1,2,2,2,8};
        for(int i=0;i<6;i++){
            user[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<6;i++){
            System.out.printf("%d ",ans[i]-user[i]);
        }
    }
}
