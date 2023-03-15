import java.util.*;
import java.io.*;

public class BOJ_20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N=Integer.parseInt(br.readLine());

        Map<String, Integer> map=new TreeMap<>();

        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine(),".");
            st.nextToken();
            String extension=st.nextToken();
            if(map.containsKey(extension)){
                map.put(extension,map.get(extension)+1);
            }
            else{
                map.put(extension,1);
            }
        }
       for(String key:map.keySet()){
           System.out.println(key+" "+map.get(key));
       }
    }
}
