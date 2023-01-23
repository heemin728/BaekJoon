// 골드 5
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_11000 {
    static class Lecture implements Comparable<Lecture>{
        int start;
        int end;

        public Lecture(int start,int end){
            this.start=start;
            this.end=end;
        }
        @Override
        public int compareTo(Lecture o) {
            if(this.start > o.start ) return 1;
            else if( this.start < o.start) return -1;
            else return this.end-o.end;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        StringBuilder sb=new StringBuilder();

        ArrayList<Lecture> list=new ArrayList<>();
        int N=Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            list.add(new Lecture(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }
        Collections.sort(list);
//        int ans=0;
//        int endTime=0;
//        for(Lecture l:list){
//            System.out.printf("%d %d\n",l.start,l.end);
//        }
//        System.out.println(ans);
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int i=0;i<list.size();i++){
            int endTime=list.get(i).end;
            int startTime=list.get(i).start;
            if(!queue.isEmpty() && queue.peek()<=startTime){
                queue.poll();
            }
            queue.offer(endTime);
        }

        sb.append(queue.size());
        System.out.println(sb);
        //        for(Integer i:queue){
//            System.out.print(i+" ");
//        }
    }
}
