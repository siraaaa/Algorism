package sds_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
 
public class Page {
   public static void main(String[] args) throws Exception {
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 
      int T = Integer.parseInt(br.readLine());
      for (int ts = 0; ts < T; ts++) {
         StringTokenizer st= new StringTokenizer(br.readLine());
         int N = Integer.parseInt(st.nextToken());
         int S=Integer.parseInt(st.nextToken());
         int J=Integer.parseInt(st.nextToken());
         int K=Integer.parseInt(st.nextToken());
          
         int[] funnyPageList= new int[K];
         st= new StringTokenizer(br.readLine());
         for (int i = 0; i < K; i++) {
            funnyPageList[i]=Integer.parseInt(st.nextToken());
         }
          
          
         List<Integer> readList= new ArrayList<Integer>();
          
         while(true) {
            readList.add(S);
            if(S+J>=N) {
               break;
            }
            S=S+J+1;
         }
          
         int answer=0;
          
       
         for (int i = 0; i < funnyPageList.length; i++) {
            for (int j = 0; j < readList.size(); j++) {
               if(funnyPageList[i]==readList.get(j)) {
                  answer++;
               }
            }
         }
         System.out.println("#"+(ts+1)+" "+answer);
      }
   }
}
