import java.util.*;

public class BOJ_1744 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        int N=scanner.nextInt();
        for(int i=0;i<N;i++){
            list.add(scanner.nextInt());
        }
        Collections.sort(list,Comparator.reverseOrder());
        int count=0;
        for(int i=0;i<N;i++){
            int tmp;
            if(i<N-1 && ((list.get(i)>0 && list.get(i+1)>0) || (list.get(i)==0 && list.get(i+1)<0)) && list.get(i)*list.get(i+1) > list.get(i)+list.get(i+1)){
                System.out.println("i="+i);
                System.out.println("dfdf"+list.get(i));
                tmp=list.get(i)*list.get(i+1);
                i++;
            }
            else{
                tmp=list.get(i);
            }
            System.out.println("tmp="+tmp);
            count+=tmp;
        }
        System.out.println(count);
    }
}
