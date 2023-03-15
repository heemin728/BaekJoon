import java.util.*;

public class BOJ_3986 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int ans=0;

        for(int i=0;i<N;i++){
            String input= scanner.next();
            Stack<Character> stack=new Stack<>();
            for(int j=0;j<input.length();j++){
                if(j==0 || stack.isEmpty()){
                    stack.push(input.charAt(j));
                    continue;
                }
                char peek=stack.peek();
                if(peek==input.charAt(j)){
                    stack.pop();
                }
                else{
                    stack.push(input.charAt(j));
                }
            }
            if(stack.isEmpty()) ans++;
        }
        System.out.println(ans);
    }
}
