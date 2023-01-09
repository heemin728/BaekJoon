import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1931 {

    static class Meeting implements Comparable<Meeting>{
        int start;
        int end;

        public Meeting(int start,int end){
            this.start=start;
            this.end=end;
        }

        @Override
        public int compareTo(Meeting o) {
            if(this.end > o.end ) return 1;
            else if( this.end < o.end) return -1;
            else return this.start-o.start;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb=new StringBuilder();
        ArrayList<Meeting> list=new ArrayList<>();
        int N=Integer.parseInt(buffer.readLine());

        String tmp;
        String[] a=new String[2];
        for(int i=0;i<N;i++){
            tmp=buffer.readLine();
            a=tmp.split(" ");
            list.add(new Meeting(Integer.parseInt(a[0]),Integer.parseInt(a[1])));
        }
        Collections.sort(list);

        int ans=0;
        int endTime=0;
        for(Meeting m:list){
            if(endTime <= m.start){
                endTime=m.end;
                ans++;
            }
        }
        System.out.println(ans);
    }

}
