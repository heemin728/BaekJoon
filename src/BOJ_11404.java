import java.util.*;
public class BOJ_11404 {

    public static int N,M;
    public static int[][] input;
    public static final int inf=80000000;
    public static void FloydMarshall(){
        for(int k=1;k<N+1;k++){
            for(int i=1;i<N+1;i++){
                for(int j=1;j<N+1;j++){
                    input[i][j]=Math.min(input[i][k]+input[k][j],input[i][j]);
                }
            }
        }
        for(int i=1;i<N+1;i++){
            for(int j=1;j<N+1;j++){
                if(input[i][j]==inf){
                    System.out.print("0 ");
                }
                else System.out.printf("%d ",input[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        N=scanner.nextInt();
        M=scanner.nextInt();
        input=new int[N+1][N+1];

        for(int i=1;i<N+1;i++){
            for(int j=1;j<N+1;j++){
                if(i==j) input[i][j]=0;
                else input[i][j]=inf;
            }
        }

        int a,b,c;
        for(int i=0;i<M;i++){
            a=scanner.nextInt();
            b=scanner.nextInt();
            c=scanner.nextInt();
            if(input[a][b]==0){
                input[a][b]=c;
            }
            else{
                input[a][b]= Math.min(input[a][b],c);
            }
        }
        FloydMarshall();

    }
}
