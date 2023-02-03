// 실버 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BOJ_10815 {
    public static boolean binarySearch(int []arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start <= end) {
            mid =  (start + end) / 2;

            if(arr[mid] == target) return true;
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else if(arr[mid] > target) {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bufferedReader.readLine());
        StringBuilder sb=new StringBuilder();

        int N=Integer.parseInt(st.nextToken());
        int[] arr=new int[N];
        st=new StringTokenizer(bufferedReader.readLine()," ");
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M=Integer.parseInt(bufferedReader.readLine());
        int value;
        st=new StringTokenizer(bufferedReader.readLine()," ");
        for(int i=0;i<M;i++){
            value=Integer.parseInt(st.nextToken());
            if(binarySearch(arr,value)){
                sb.append(1).append(" ");
            }
            else{
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
