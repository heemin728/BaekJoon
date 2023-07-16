import java.util.*;
public class BOJ_10566 {

    public static int distance(int[] from, int[] to){
        return Math.abs(from[0]-to[0])+Math.abs(from[1]-to[1]);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();

        int[][] arr=new int[N][2];

        for(int i=0;i<N;i++){
            arr[i][0]=scanner.nextInt();
            arr[i][1]=scanner.nextInt();
        }

        int total=0;
        int[] dist=new int[N-1];
        for(int i=0;i<N-1;i++){
            dist[i]=distance(arr[i],arr[i+1]);
            total+=dist[i];
        }

       int minDistance=Integer.MAX_VALUE;

        for(int i=0;i<N-2;i++){
            int skip=distance(arr[i],arr[i+2]);
            int tmp=total-dist[i]-dist[i+1]+skip;
            minDistance=Math.min(minDistance,tmp);
        }
        System.out.println(minDistance);
    }
}
