import java.util.*;
import java.io.*;

public class BOJ_5397 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(buffer.readLine());

        for(int i=0;i<N;i++){
            String input=buffer.readLine();
            LinkedList<Character> list=new LinkedList<>();
            int cursor=0;
            for(int j=0;j<input.length();j++){
                switch(input.charAt(j)){
                    case '-':
                        if(cursor>0) {
                            cursor--;
                            list.remove(cursor);
                        }
                        break;
                    case '<':
                        if(cursor>0) {
                            cursor--;
                        }
                        break;
                    case '>':
                        if(cursor<list.size()) {
                            cursor++;
                        }
                        break;
                    default:
                        //System.out.printf("%c, %d \n",input.charAt(j),cursor);
                        list.add(cursor,input.charAt(j));
                        cursor++;
                        break;

                }
            }
            for(Character c:list){
                sb.append(c);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
