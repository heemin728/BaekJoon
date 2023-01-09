import java.util.*;

public class BOJ_11403 {

    public static int[][] input;
    public static int N;
    public static void FloydWarshall(){
        int[][] ans=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                ans[i][j]=input[i][j];
            }
        }
        // k=거쳐가는 노드
        // i=출발 노드
        // j=도착 노드

        for(int k=0;k<N;k++){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
//                    if(input[i][k]+input[k][j]<input[i][j]){
//                        input[i][k]=input[i][k]+input[k][j];
//                    }
                    if(ans[i][j]==0){
                        if(ans[i][k]+ans[k][j]==2){
                            ans[i][j]=1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.printf("%d ",ans[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        input=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                input[i][j]=scanner.nextInt();
            }
        }
        FloydWarshall();

    }
}
