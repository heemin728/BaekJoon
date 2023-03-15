import java.util.*;

public class BOJ_1620 {

    public static boolean isInteger(String strValue) {
        try {
            Integer.parseInt(strValue);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();

        HashMap<String,Integer> map=new HashMap<>();
        ArrayList<String> list=new ArrayList<>();
        list.add("dummy");

        for(int i=0;i<N;i++){
            String pocketmon= scanner.next();
            map.put(pocketmon,i+1);
            list.add(pocketmon);
        }

        for(int i=0;i<M;i++){
            String input=scanner.next();

            // 숫자인 경우
            if(isInteger(input)){

                int intKey=Integer.parseInt(input);
                sb.append(list.get(intKey)).append("\n");
            }
            else{ // 포켓몬 이름인 경우
//                System.out.println(map.get(input));
                sb.append(map.get(input)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
