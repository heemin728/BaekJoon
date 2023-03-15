import java.util.*;
import java.io.*;

public class BOJ_7785 {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        TreeSet<String> set=new TreeSet<>();
        ArrayList<String> list=new ArrayList<>();

        int N=Integer.parseInt(buffer.readLine());
        for(int i=0;i<N;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            String name=st.nextToken();
            String log=st.nextToken();
            if(log.equals("enter")){
                set.add(name);
            }
            else if(log.equals("leave")){
                set.remove(name);
            }
        }
        Iterator it=set.iterator();
        while(it.hasNext()){
            list.add((String)it.next());
        }
        Collections.sort(list,Comparator.reverseOrder());
        for(String s:list){
            System.out.println(s);
        }
    }
}
