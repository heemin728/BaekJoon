import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_11479 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int T,N;
        T=Integer.parseInt(buffer.readLine());

        for(int i=0;i<T;i++){
            N=Integer.parseInt(buffer.readLine());
            ArrayList<Integer> list=new ArrayList<>();
            String tmp=buffer.readLine();
            String[] tmp2=tmp.split(" ");
            for(int j=0;j<N;j++){
                list.add(Integer.parseInt(tmp2[j]));
            }
            Collections.sort(list);

            // 0 1 2 3 4 5 size=6; j=0; j<4; j+=  // 0 - 2 // 1 - 3 // 2 - 4 // 3 - 5 //
            int diff=0;
            int tmp3;
            for(int j=0;j<list.size()-2;j++){
                tmp3=list.get(j+2)-list.get(j);
                if(tmp3 > diff) diff=tmp3;
            }
            sb.append(diff).append("\n");

        }
        System.out.println(sb);
    }
}
