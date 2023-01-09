import java.util.*;

public class BOJ_9012 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int T=scanner.nextInt();
        for(int i=0;i<T;i++){

            Stack<Character> stack=new Stack<>();
            int isdone=0;
            String input=scanner.next();
            char c;

            for(int j=0;j<input.length();j++){
                c=input.charAt(j);
                if(c=='('){
                    stack.push(c);
                }
                else if(c==')'){
                    if(stack.isEmpty()){
                        isdone=1;
                        break;
                    }
                    stack.pop();
                }
//                System.out.print("stack : ");
//                System.out.println(stack);

            }
            if(stack.isEmpty() && isdone==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
