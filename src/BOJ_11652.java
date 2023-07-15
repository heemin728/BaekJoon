import java.util.*;

public class BOJ_11652{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        HashMap<Long, Integer> map=new HashMap<>();

        int max=0;
        long x=0;
        for(int i=0;i<n;i++){
            Long key=scanner.nextLong();

            map.put(key,map.getOrDefault(key,0)+1);

            if(map.get(key)>max){
                max=map.get(key);
                x=key;
            }
            else if(map.get(key)==max){
                x=Math.min(x,key);
            }
        }

        System.out.println(x);


    }
}