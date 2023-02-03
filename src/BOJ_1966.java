// 실버 3

import java.awt.image.TileObserver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1966 {

    static class Print implements Comparable<Print>{
        int index;
        int priority;

        public Print(int index, int priority){
            this.priority=priority;
            this.index=index;
        }

        @Override
        public int compareTo(Print o) {
            if(o.priority > this.priority) return -1;
            else return 1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        StringBuilder sb=new StringBuilder();

        int T=Integer.parseInt(st.nextToken());
        int N, M;
        Queue<Print> queue;
        for(int i=0;i<T;i++){
            queue=new LinkedList<>();
            st=new StringTokenizer(buffer.readLine()," ");
            N=Integer.parseInt(st.nextToken());
            M=Integer.parseInt(st.nextToken());

            int count=0;
            st=new StringTokenizer(buffer.readLine()," ");
            for(int j=0;j<N;j++){
                queue.offer(new Print(j,Integer.parseInt(st.nextToken())));
            }
            int max=Collections.max(queue).priority;

            //System.out.println("max value="+max);
            while(!queue.isEmpty()){
                Print print=queue.poll();
                int value=print.priority;
                int index=print.index;
                //System.out.printf("polled - %d\n",value);
                if(value==max){
                    count++;
                    if(!queue.isEmpty())   max=Collections.max(queue).priority;

                    if(M==index){
                        System.out.printf("%d\n",count);
                        break;
                    }

                }
                else{
                    queue.offer(new Print(index,value));
                }
            }
        }
    }
}
