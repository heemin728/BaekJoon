import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();

        int N=scanner.nextInt();
        int M=scanner.nextInt();

        HashMap<String,Integer> map=new HashMap<>();

        int ans=0;
        for(int i=0;i<N;i++){
            String tmp=scanner.next();
            map.put(tmp,map.getOrDefault(tmp,0));
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<M;i++){
            String tmp=scanner.next();
            if(map.containsKey(tmp)){
                ans++;
                list.add(tmp);
            }
        }
        Collections.sort(list);
        System.out.println(ans);
        for(String s:list){
            System.out.println(s);
        }

    }
}
