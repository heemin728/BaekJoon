import java.util.*;
import java.io.*;

public class BOJ_11723 {
    static boolean findSet(int target,Set<Integer> set){
        Iterator<Integer> it=set.iterator();

        boolean isFind=false;
        while(it.hasNext()){
            int value=it.next();
            if(value==target){
                isFind= true;
                break;
            }
        }
        return isFind;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine());
        StringBuilder sb=new StringBuilder();

        Set<Integer> set=new HashSet<>();

        int N=Integer.parseInt(st.nextToken());

        for(int i=0;i<N;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            String command=st.nextToken();
            //System.out.println("command="+command);
            if(command.equals("add")){
                set.add(Integer.parseInt(st.nextToken()));
            }
            else if(command.equals("check")){
                int target=Integer.parseInt(st.nextToken());
                boolean exist=findSet(target,set);
                if(exist) System.out.println(1);
                else System.out.println(0);
            }

            else if(command.equals("toggle")){
                int target=Integer.parseInt(st.nextToken());
                boolean exist=findSet(target,set);
                if(exist) set.remove(target);
                else set.add(target);
            }

            else if(command.equals("remove")){
                int target=Integer.parseInt(st.nextToken());
                if(findSet(target,set)) set.remove(target);
            }

            else if(command.equals("all")){
                set.clear();
                for(int j=1;j<=20;j++){
                    set.add(j);
                }
            }

            else if(command.equals("empty")){
                set.clear();
            }
        }
    }
}
