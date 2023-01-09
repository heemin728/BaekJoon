import java.util.*;

public class BOJ_10250 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int T;
        T=scanner.nextInt();

        for(int i=0;i<T;i++){

            int H,W,N;
            H=scanner.nextInt();
            W=scanner.nextInt();
            N=scanner.nextInt();

            // 처리 코드

            int height=N % H; // 10이면 10 % 6 = 4
            int weight=N / H + 1;

            if(height==0){
                height=H;
                weight--;
            }
            String answer="";
            String w="";
            //System.out.println(height+"층, "+weight+" 호");
            answer=answer.concat(Integer.toString(height));
            if(weight<10){
                w=w.concat("0");
            }
            w=w.concat(Integer.toString(weight));
            answer=answer.concat(w);
            System.out.println(answer);

            //
        }

    }
}
