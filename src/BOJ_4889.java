// 실버 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_4889 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        Stack<Character> stack;
        String input;
        int ans=0;
        int num=1;
        while(true){
            stack=new Stack<>();
            ans=0;
            input=buffer.readLine();
            if(input.charAt(0)=='-') break;

            for(int i=0;i<input.length();i++){
                char c=input.charAt(i);
                if(c=='{')  stack.push(c);
                else {
                    if(!stack.isEmpty()) stack.pop();
                    else {stack.push('{'); ans++;
                    }
                }
            }
            sb.append(num).append(". ");
            sb.append(ans+stack.size()/2).append("\n");
            num++;
        }
        System.out.println(sb);
    }
}
