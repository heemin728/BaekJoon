// 골드 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11758 {
    static class Point{
        int x;
        int y;

        public Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        Point[] points=new Point[3];
        for(int i=0;i<3;i++){
            st=new StringTokenizer(buffer.readLine()," ");
            points[i]=new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        // 신발끈 공식 !
        int ccw=(points[0].x*points[1].y + points[1].x*points[2].y + points[2].x*points[0].y)-
                (points[0].y*points[1].x + points[1].y*points[2].x + points[2].y*points[0].x);

        if(ccw>0){
            System.out.println(1); // 반시계방향
        }
        else if(ccw < 0){
            System.out.println(-1); // 시계 방향
        }
        else System.out.println(0); // 일직선
    }
}
