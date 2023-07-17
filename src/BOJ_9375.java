import java.util.*;
import java.io.*;

public class BOJ_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int T=Integer.parseInt(st.nextToken());
        for(int i=0;i<T;i++){
            st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());

            Map<String,Integer> map=new HashMap<>();

            int answer=1;
            for(int j=0;j<n;j++){
                st=new StringTokenizer(br.readLine());
                st.nextToken();
                String category=st.nextToken();
                map.put(category,map.getOrDefault(category,0)+1);
            }

            Collection<Integer> value=map.values();
            for(Integer k:value){
                answer*=(k+1);
            }

            System.out.println(answer-1);
        }
    }
}
