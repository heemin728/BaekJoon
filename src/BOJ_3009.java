// 브론즈 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] x=new int[3];
        int[] y=new int[3];

        for(int i=0;i<3;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            x[i]=Integer.parseInt(st.nextToken());
            y[i]=Integer.parseInt(st.nextToken());
        }
        int ans_x,ans_y;

        if(x[0]==x[1]){
            ans_x=x[2];
        }
        else if(x[0]==x[2]){
            ans_x=x[1];
        }
        else{
            ans_x=x[0];
        }

        if(y[0]==y[1]){
            ans_y=y[2];
        }
        else if(y[0]==y[2]){
            ans_y=y[1];
        }
        else{
            ans_y=y[0];
        }
        System.out.println(ans_x+" "+ans_y);
    }
}
