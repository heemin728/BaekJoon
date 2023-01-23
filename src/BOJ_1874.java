// 실버2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BOJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(buffer.readLine());
        int[] arr=new int[n];
        int max=n;
        int max_i=0;
        boolean isPossible=true;

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(buffer.readLine());
            if(arr[i]==max) max_i=i;
        }

        // 최고 수 이전을 기점으로 오름차순 혹은 순차적 내림차순이 아니면 불가
        for(int i=0;i<max_i-1;i++){
            if(arr[i]-arr[i+1]>1){
                isPossible=false;
                break;
            }
        }
        // 최고 수 이후를 기점으로 내림차순이 아니면 불가
        for(int i=max_i;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                isPossible=false;
                break;
            }
        }
        if(!isPossible) System.out.println("No");
        else{
            for(int i=1;i<=arr[0];i++){
                //System.out.printf("push %d\n",i);
                stack.push(i);
                sb.append("+\n");
            }
            int index=1;
            int former_target=arr[0];
            int target;
            int num=arr[0]+1;
            boolean isBiggest=false;

            while(true){
                if(isBiggest){
                    break;
                }
                target=arr[index++];
                if (target==arr[max_i]){
                    isBiggest=true;
                }

                if(former_target-target==1){
                    int pop_value=stack.pop();
                    //System.out.printf("pop %d\n",pop_value);
                    sb.append("-\n");
                    while(pop_value!=target){
                        pop_value=stack.pop();
                       // System.out.printf("pop %d\n",pop_value);
                        sb.append("-\n");
                    }
                }
                else{
                    while(num<=target){
                        stack.push(num);
                        //System.out.printf("push %d\n",num);
                        sb.append("+\n");
                        num++;
                    }
                    //System.out.printf("pop %d\n",stack.pop());
                    stack.pop();
                    sb.append("-\n");
                }

            }
            if(isBiggest){
                while(!stack.isEmpty()){
                   // System.out.printf("pop %d\n",stack.pop());
                    stack.pop();
                    sb.append("-\n");
                }
            }
        }
        System.out.println(sb);
    }
}
