import java.util.Scanner;
/*
4
26 40 83
49 60 57
13 89 99
55 31 72 */
public class RGB {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();

        int cost[][]=new int[N][3];
        for(int i=0;i<N;i++){ //  입력
            for(int j=0;j<2;j++){
                cost[i][j]=scanner.nextInt();
            }
        }


    }
}
