// 실버 4
import java.util.*;
public class BOJ_10610 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        int sum=0;

        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<input.length();i++){
            list.add(input.charAt(i));
            sum+=(input.charAt(i)-'0');
        }
        Collections.sort(list,Collections.reverseOrder());

        if( sum % 3 == 0 && list.get(list.size()-1)=='0'){
            for(Character c:list){
                System.out.print(c);
            }
        }
        else{
            System.out.println(-1);
        }
    }
}
