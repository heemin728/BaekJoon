import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1946 {
    static class Applicant implements Comparable<Applicant>{
        int first;
        int second;
        boolean isAns;

        public Applicant(int first,int second){
            this.first=first;
            this.second=second;
            this.isAns=true;
        }

        @Override
        public int compareTo(Applicant o){
            return Integer.compare(this.first,o.first);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Applicant> list;

        int T=Integer.parseInt(buffer.readLine());
        for(int i=0;i<T;i++){
            int N=Integer.parseInt(buffer.readLine());
            list=new ArrayList<>();

            for(int j=0;j<N;j++) {
                String tmp=buffer.readLine();
                String[] t=tmp.split(" ");
                list.add(new Applicant(Integer.parseInt(t[0]),Integer.parseInt(t[1])));
            }
            int ans=0;
            Collections.sort(list);

            int cutline=list.get(0).second;
            for(Applicant a:list){
                if(a.second <= cutline){
                    cutline=a.second;
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
