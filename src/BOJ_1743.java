import java.util.*;
import java.io.*;

public class BOJ_1743 {
    static int[][] map;
    static int n,m,k;
    static int[] move={1,-1,0,0};
    static int[] move2={0,0,1,-1};
    static ArrayList<Integer> ans=new ArrayList<>();
    static void bfs(){
        Queue<int[]> queue=new LinkedList<>();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(map[i][j]==1){
                    queue.offer(new int[]{i,j});
                    int cnt=1;

                    while(!queue.isEmpty()){
                        int polla=queue.peek()[0];
                        int pollb=queue.poll()[1];
                        map[polla][pollb]=0;

                        for(int k=0;k<4;k++){
                            int newa=polla+move[k];
                            int newb=pollb+move2[k];

                            if(newa>0 && newb>0 && newa<=n && newb<=m && map[newa][newb]==1){
                                queue.offer(new int[]{newa,newb});
                                cnt++;
                                map[newa][newb]=0;
                            }
                        }
                    }
                    ans.add(cnt);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");

        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());

        map=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            Arrays.fill(map[i],0);
        }

        for(int i=0;i<k;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            int r=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());

            map[r][c]=1;
        }
        bfs();
        System.out.println(Collections.max(ans));

    }
}
