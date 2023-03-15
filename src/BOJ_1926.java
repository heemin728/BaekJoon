import java.io.*;
import java.util.*;

public class BOJ_1926 {

    static int[] move={1,-1,0,0};
    static int[] move2={0,0,1,-1};
    static int[][] arr;
    static int m,n;
    static ArrayList<Integer> list=new ArrayList<>();

    static void bfs(){
        Queue<int[]> queue=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    queue.offer(new int[]{i,j});
                    int area=1;

                    while(!queue.isEmpty()){
                        int polla=queue.peek()[0];
                        int pollb=queue.poll()[1];
                        arr[polla][pollb]=0;

                        for(int k=0;k<4;k++){
                            int newa=polla+move[k];
                            int newb=pollb+move2[k];
                            if(newa>=0 && newb>=0 && newa<n && newb<m && arr[newa][newb]==1){
                                area++;
                                queue.offer(new int[]{newa,newb});
                                arr[newa][newb]=0;
                            }
                        }
                    }
                    list.add(area);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine()," ");
        StringBuilder sb=new StringBuilder();

        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        arr=new int[n][m];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            for(int j=0;j<m;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        bfs();
//        for(Integer i:list){
//            System.out.printf("%d ",i);
//        }
        if(list.isEmpty()){
            System.out.println(0);
            System.out.println(0);
            return;
        }
        System.out.println(list.size());
        System.out.println(Collections.max(list));
    }
}
