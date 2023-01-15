//골드 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2293 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(buffer.readLine(), " ");
        StringBuilder sb=new StringBuilder();

        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[] arr=new int[n];

        for(int i=0;i<n;i++){

            String tmp=buffer.readLine();
            st=new StringTokenizer(tmp);
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int[] dp=new int[k+1];
        dp[0]=1;
        for(int i=0;i<n;i++){
            //System.out.println();
            for(int j=arr[i];j<=k;j++){
                //System.out.printf("j=%d, arr[%d]=%d ",j,i,arr[i]);
                int tmp=dp[j];
                int tmp2=dp[j-arr[i]];
                dp[j]=dp[j]+dp[j-arr[i]];
                //System.out.printf("dp[%d] = dp[%d] + dp[j-arr[%d]](dp[%d]) = %d + %d = %d\n",j,j,i,j-arr[i],tmp,tmp2,dp[j]);
            }
        }
        System.out.println(dp[k]);
//        for(int i=0;i<k;i++){
//            System.out.print(dp[i]+" ");
//        }
//        System.out.println();

    }
}
