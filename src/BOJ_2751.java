// 실버 5
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        ArrayList<Integer> list=new ArrayList<>();
        int n=Integer.parseInt(buffer.readLine());
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(buffer.readLine()));
        }
        Collections.sort(list);
        for(Integer i:list) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
