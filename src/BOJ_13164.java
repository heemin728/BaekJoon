import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_13164 {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        int[] student=new int[N];
        ArrayList<Integer> diff=new ArrayList<>();
        st=new StringTokenizer(buffer.readLine()," ");
        for(int i=0;i<N;i++){
            student[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<N-1;i++){
            diff.add(student[i+1]-student[i]);
        }
        Collections.sort(diff);
        int ans=0;
        for(int i=0;i<N-K;i++){
            ans+=diff.get(i);
        }
        System.out.println(ans);
    }
}
