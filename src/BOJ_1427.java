import java.util.*;

public class BOJ_1427 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();

        Integer[] arr=new Integer[input.length()];

        for(int i=0;i<input.length();i++){
            arr[i]=input.charAt(i)-'0';
        }

        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<input.length();i++){
            System.out.printf("%d",arr[i]);
        }
    }
}
