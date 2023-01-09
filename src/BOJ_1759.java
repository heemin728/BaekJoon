import java.util.*;

public class BOJ_1759 {
    static int L,C;
    static boolean[] visited;
    public static void found_pw(int start, int count,LinkedList<Character> list){

        ArrayList<Character> vowels=new ArrayList<>(Arrays.asList('a','e','i','o','u') );

        if(count==L){ // 암호의 길이만큼 재귀 후 string concat 시작
            String s="";
            int consonant=0;
            int vowel=0;
            //System.out.println("init");
            for(int i=0;i<C;i++){
                if(visited[i]==true){
                    s=s.concat(Character.toString(list.get(i)));

                    // 모음, 자음 개수 세어주기
                    if(vowels.contains(list.get(i))) vowel++;
                    else consonant++;
                }
            }
            if(vowel >= 1 && consonant >= 2){
                System.out.println(s);
            }

        }
        for(int i=start;i<C;i++){
            visited[i]=true;
            found_pw(i+1,count+1,list);
            visited[i]=false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedList<Character> list=new LinkedList<>();
        L=scanner.nextInt();
        C=scanner.nextInt();
        visited=new boolean[C];
        for(int i=0;i<C;i++){
            char c=scanner.next().charAt(0);
            list.add(c);
        }
        Collections.sort(list);
        //System.out.println(list);
        found_pw(0,0,list);
    }
}


