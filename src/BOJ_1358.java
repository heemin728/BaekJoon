import java.sql.SQLOutput;
import java.util.*;
import java.io.*;
public class BOJ_1358 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        String[] input2=input.split(" ");
        int W=Integer.parseInt(input2[0]);
        int H=Integer.parseInt(input2[1]);
        int X=Integer.parseInt(input2[2]);
        int Y=Integer.parseInt(input2[3]);
        int P=Integer.parseInt(input2[4]);
        int centerX1=X;
        int centerY1=Y+H/2;
        int centerX2=X+W;
        int centerY2=Y+H/2;
        int radius=H/2;

        int answer=0;

        for(int i=0;i<P;i++){
            String tmp=br.readLine();
            String[] tmp2=tmp.split(" ");
            int x=Integer.parseInt(tmp2[0]);
            int y=Integer.parseInt(tmp2[1]);

            // 원 1 체크
            if(Math.pow(centerX1-x,2)+Math.pow(centerY1-y,2)<=Math.pow(radius,2)){
                answer++;
                continue;
            }

            // 원 2 체크
            if(Math.pow(centerX2-x,2)+Math.pow(centerY2-y,2)<=Math.pow(radius,2)){
                answer++;
                continue;
            }


            // 사각형 체크
            if(x>=X && x<=X+W && y>=Y && y<=Y+H){
                answer++;
                continue;
            }


        }
        System.out.println(answer);
    }
}
