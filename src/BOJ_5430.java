import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_5430 {
    private static final StringBuilder output = new StringBuilder();
    public static int[] makeArr(String arr,int n){

        arr=arr.substring(1,arr.length()-1);

        String[] str=arr.split(",");
        int[] ret=new int[n];
        for(int i=0;i<n;i++){
            ret[i]=Integer.parseInt(str[i]);
        }
        return ret;
    }

    public static int[] R(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.reverse(list);
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
            //System.out.print(arr[i]+" ");
        }
        //System.out.println();
        return arr;
    }

    public static int[] D(int[] arr){

        if(arr.length==0) {return new int[0];}
        int[] ret=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            ret[i]=arr[i+1];
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {

        //Scanner scanner=new Scanner(System.in);
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(buffer.readLine());

        for(int i=0;i<T;i++){
            //String func=scanner.next();
            String func=buffer.readLine();
            int n=Integer.parseInt(buffer.readLine());
            String str_arr=buffer.readLine();
            int[] arr=makeArr(str_arr,n);

            int errorFlag=0;
            for(int j=0;j<func.length();j++) {

                if(errorFlag==1)break;

                switch(func.charAt(j)){
                    case 'R':
                        arr=R(arr);
                        break;
                    case 'D':
                        arr=D(arr);
                        if(arr.length==0) errorFlag=1;
                        break;
                }
            }
            if(errorFlag==1){
                output.append("error").append("\n");
                //System.out.println("error");
            }
            else{
                //System.out.print("[");
                output.append("[");
                for(int k=0;k<arr.length;k++){
                    //System.out.print(arr[k]);
                    output.append(arr[k]);
                    if(k!=arr.length-1) output.append(",");
                        //System.out.print(",");
                }
                //System.out.println("]");
                output.append("]").append("\n");
            }


        }
        System.out.println(output);
    }
}
