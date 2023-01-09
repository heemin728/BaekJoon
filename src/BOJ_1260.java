import java.util.*;

public class BOJ_1260 {

    Stack<Integer> S=new Stack<>();
    Queue<Integer> Q=new LinkedList<>();
    static int num;
    boolean[] visited=new boolean[num];


    public void DFS(int s){
        visited[s]=false;

    }

    public void BFS(){

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int M=scanner.nextInt();
        int N=scanner.nextInt();
        num=N;
        int V=scanner.nextInt();

        for(int i=0;i<N;i++){

            int V1=scanner.nextInt();
            int V2=scanner.nextInt();

        }

    }
}
