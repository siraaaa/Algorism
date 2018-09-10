package sds_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
 
public class Space {
    
     public static void main(String[] args) throws Exception {
          
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         // 테스트케이스의 개수 T
         int T= Integer.parseInt(br.readLine());
        for (int ts = 0; ts < T; ts++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            //행의 개수
            int N= Integer.parseInt(st.nextToken());
            //열의 개수
            int M=Integer.parseInt(st.nextToken());
             
            //출발 행
            int r1=Integer.parseInt(st.nextToken());
            //출발 열
            int c1=Integer.parseInt(st.nextToken());
             
            //도착 행
            int r2=Integer.parseInt(st.nextToken());
            //도착 열
            int c2=Integer.parseInt(st.nextToken());
 
            int r=0;
            int c=0;
             
            r=Math.min(Math.abs(r2-r1), Math.abs(N-Math.max(r1, r2)+Math.min(r1, r2)));
            c=Math.min(Math.abs(c2-c1), Math.abs(M-Math.max(c1, c2)+Math.min(c1, c2)));
             
             
            //최적 상담시간.
            System.out.println("#"+(ts+1)+" "+(r+c));
         }
     }
}