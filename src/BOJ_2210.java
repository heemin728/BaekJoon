import java.util.*;
import java.io.*;

public class BOJ_2210 {
    static String[][] map=new String[5][5];
    static Set<String> set=new HashSet<>();
    static int[] move1={1,-1,0,0};
    static int[] move2={0,0,1,-1};

    static void dfs(int i,int j, int count,String num){
        if(count==5){
            set.add(num);
            return;
        }
        for(int k=0;k<4;k++){
            int newI=i+move1[k];
            int newJ=j+move2[k];

            if(newI>=0 && newJ>=0 && newI<5 && newJ<5){
                dfs(newI,newJ,count+1,num+map[newI][newJ]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=0;i<5;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            for(int j=0;j<5;j++){
                map[i][j]=st.nextToken();
            }
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                dfs(i,j,0,map[i][j]);
            }
        }
        System.out.println(set.size());

//        Iterator<String> it=set.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

    }
}
