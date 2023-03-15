import java.util.*;
import java.io.*;

public class BOJ_10026 {

    static int[] move1={1,-1,0,0};
    static int[] move2={0,0,1,-1};

    public static int bfs(int[][] map){

        int len=map.length;
        int ans=0;

        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(map[i][j]>=0){

                    ans++;

                    int color=map[i][j];
                    queue.offer(new int[]{i,j});

                    while(!queue.isEmpty()){
                        int polla=queue.peek()[0];
                        int pollb=queue.poll()[1];

                        map[polla][pollb]=-1;
                        for(int k=0;k<4;k++){
                            int newa=polla+move1[k];
                            int newb=pollb+move2[k];

                            if(newa>=0 && newb>=0 && newa<len && newb<len && map[newa][newb]==color){
                                map[newa][newb]=-1;
                                queue.offer(new int[]{newa,newb});
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException{
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[][] general=new int[N][N];
        int[][] color_weakness=new int[N][N];


        // 일반인의 경우 R=0, G=1, B=2 로 저장
        // 적록색약의 경우 R,G=1, B=2 로 저장

        for(int i=0;i<N;i++){
            String tmp=scanner.next();
            for(int j=0;j<N;j++){
                char c=tmp.charAt(j);
                if(c=='R'){
                    general[i][j]=0;
                    color_weakness[i][j]=1;
                }
                else if(c=='G'){
                    general[i][j]=1;
                    color_weakness[i][j]=1;
                }
                else if(c=='B') {
                    general[i][j] = 2;
                    color_weakness[i][j]=2;
                }
            }
        }
        System.out.printf("%d %d\n",bfs(general), bfs(color_weakness));
    }
}
