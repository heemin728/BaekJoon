// 브론즈 5
import java.util.*;

public class BOJ_2744 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.next();
        String output="";
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isUpperCase(c)){
                output=output.concat(String.valueOf(c).toLowerCase());
            }
            else{
                output=output.concat(String.valueOf(c).toUpperCase());
            }
        }
        System.out.println(output);
    }
}
