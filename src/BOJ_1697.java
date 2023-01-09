import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_1697 {
    static int visited[] = new int[100001];
    static int N,K;

    public static int BFS (int node)
    {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(node);
        int index = node;
        int n = 0;
        visited[index] = 1;
        while(queue.isEmpty() == false)
        {
            // original
            n=queue.remove();

            if(n == K)
            {
                return visited[n]-1;
            }

            if(n-1>=0 && visited[n-1] == 0)
            { // original
                visited[n-1] = visited[n]+1;
                queue.add(n-1);
            }
            if(n+1 <= 100000 && visited[n+1]== 0)
            { // original
                visited[n+1]=visited[n]+1;
                queue.add(n+1);
            }
            if( 2*n <= 100000 && visited[2*n] == 0)
            { //original
                visited[2*n]=visited[n] + 1;
                queue.add(2*n);
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String input=buffer.readLine();
        String[] tmp=input.split(" ");
//        int N=Integer.parseInt(tmp[0]);
//        int K=Integer.parseInt(tmp[1]);
        N = Integer.valueOf(tmp[0]);
        K = Integer.valueOf(tmp[1]);

        System.out.println(BFS(N));
    }
}
