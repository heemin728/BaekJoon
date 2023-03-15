import java.util.*;

public class BOJ_1302 {
    public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();

       Map<String,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++) {
           String book = scanner.next();
           if (map.containsKey(book)) {
               map.put(book, map.get(book) + 1);
           } else {
               map.put(book, 1);
           }
       }
       Integer maxValue=Collections.max(map.values());
       ArrayList<String> ans=new ArrayList<>();
       for(Map.Entry<String,Integer> entry:map.entrySet()){
           String Book=entry.getKey();
           int num=entry.getValue();

           if(num==maxValue){
               ans.add(Book);
           }
       }
       Collections.sort(ans);
        System.out.println(ans.get(0));
    }
}
