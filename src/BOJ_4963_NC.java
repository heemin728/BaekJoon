// 실버 1
import java.util.*;
import java.io.*;

public class BOJ_4963_NC {
    static int[][] arr;

    static int bfs(){
        int ans=0;



        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");
        StringBuilder sb=new StringBuilder();

        while(true){
            int w=Integer.parseInt(st.nextToken());
            int h=Integer.parseInt(st.nextToken());

            if(w==0 && h==0){
                System.out.println(sb);
                break;
            }

            arr=new int[h+1][w+1];
            for(int i=1;i<=h;i++){
                st=new StringTokenizer(buffer.readLine()," ");
                for(int j=1;j<=w;j++){
                    arr[i][j]=Integer.parseInt(st.nextToken());
                }
            }

        }
    }
}
