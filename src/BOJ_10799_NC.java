import java.util.*;

public class BOJ_10799_NC {

    static Stack<Character> changeBar(String input){

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<input.length();i++){
            if(!stack.isEmpty()){
                char peek=stack.peek();
                if(peek=='(' && input.charAt(i)==')'){
                    stack.pop();
                    stack.push('*');
                    continue;
                }
            }
            stack.push(input.charAt(i));
        }
        return stack;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();

        Stack<Character> stack=changeBar(input);
        for(int i=0;i<input.length();i++){

        }
    }
}
