import java.util.*;


public class BOJ_7562 {

    static class Points{
        int x;
        int y;

        public Points(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    private static int T,N;
    private static int[] startPoint;
    private static int[] endPoint;
    private static Queue<Points> queue;

    private static int[][] counter;
    private static boolean[][] visit;

    private static int[] newX={-2,-1,1,2,2,1,-1,-2};
    private static int[] newY={-1,-2,-2,-1,1,2,2,1};
    private static StringBuilder sb=new StringBuilder();

    public static int BFS(int x, int y){

        queue.add(new Points(x,y));
        visit[y][x]=true;

        while(!queue.isEmpty()){
            Points tmp=queue.poll();

            if(tmp.x==endPoint[0] && tmp.y==endPoint[1]){
                return counter[endPoint[1]][endPoint[0]];
            }
            for(int i=0;i<8;i++){
                int new_X=tmp.x+newX[i];
                int new_Y=tmp.y=newY[i];
                if(new_X>=0 && new_X<N && new_Y>=0 && new_Y<N){
                    if(!visit[new_Y][new_X]){
                        queue.add(new Points(new_X,new_Y));
                        visit[new_Y][new_X]=true;
                        counter[new_Y][new_X]=counter[tmp.y][tmp.x]+1;
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        T=scanner.nextInt();
        for(int i=0;i<T;i++){
            queue=new LinkedList<>();
            counter=new int[301][301];
            visit=new boolean[301][301];
            startPoint=new int[2];
            endPoint=new int[2];

            N=scanner.nextInt(); // 한 변의 크기

            for(int j=0;j<2;j++){
                startPoint[j]=scanner.nextInt();
            }
            for(int j=0;j<2;j++){
                endPoint[j]=scanner.nextInt();
            }
            sb.append(BFS(startPoint[0],startPoint[1])).append("\n");
        }
        System.out.println(sb);
    }
}