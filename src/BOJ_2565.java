// 골드 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2565 {
    public static void main(String[] args) throws IOException  {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        StringBuilder sb=new StringBuilder();

        int n=Integer.parseInt(st.nextToken());

        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
    }
}
