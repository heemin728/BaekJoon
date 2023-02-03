// 브론즈 2

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2750 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
