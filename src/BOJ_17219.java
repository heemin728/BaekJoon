import java.io.*;
import java.util.*;

public class BOJ_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");
        BufferedWriter br=new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String,String> map=new HashMap<>();
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        for(int i=0;i<N;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            map.put(st.nextToken(),st.nextToken());
        }
        for(int i=0;i<M;i++){
            String find=buffer.readLine();
            br.write(map.get(find)+"\n");
        }
        br.close();
    }
}
