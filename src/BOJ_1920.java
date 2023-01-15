import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
// 실버 4

public class BOJ_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());

        int n=Integer.parseInt(st.nextToken());

        long[] n_list=new long[n];

        st=new StringTokenizer(buffer.readLine());
        for(int i=0;i<n;i++){
            n_list[i]=Long.parseLong(st.nextToken());
        }
        Arrays.sort(n_list);

        int m=Integer.parseInt(buffer.readLine());
        long[] m_list=new long[m];

        st=new StringTokenizer(buffer.readLine());
        for(int i=0;i<m;i++){
            m_list[i]=Long.parseLong(st.nextToken());
        }

        for(int i=0;i<m;i++){
            long target=m_list[i];

            boolean isFound=false;
            if(Arrays.binarySearch(n_list,target) >= 0 ){
                isFound=true;
                System.out.println(1);
            }
            if(!isFound){
                System.out.println(0);
            }
        }
    }
}
