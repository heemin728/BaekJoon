// 브론즈 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");

        int hour=Integer.parseInt(st.nextToken());
        int min=Integer.parseInt(st.nextToken());

        int time=Integer.parseInt(buffer.readLine());

        min+=time;
        while(min>=60){
            hour++;
            min-=60;
        }
        if(hour>=24){
            hour=hour-24;
        }
        System.out.printf("%d %d\n",hour,min);
    }
}
