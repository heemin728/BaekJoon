// 실버 1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BOJ_2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        String input= buffer.readLine();
        Stack<Character> stack=new Stack<>();
        char[] arr=new char[input.length()];

        for(int i=0;i<input.length();i++){
            arr[i]=input.charAt(i);
        }

        for(int i=0;i<input.length();i++){
            char now=arr[i];
            if(stack.isEmpty()) {
                stack.push(now);
            }
            char before=stack.peek();
            if(before=='(' && now==')'){
                stack.pop();
                stack.push('2');
            }
            else if(before == '[' && now==']'){
                stack.pop();
                stack.push('3');
            }
        }
    }
}
