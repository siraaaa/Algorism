package sds_academy;

import java.io.*;
import java.util.*;
 
public class Survivor {
 
    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int testNum = Integer.parseInt(br.readLine());
        int start = 1;
         
        while(start <= testNum){
            int count = 0;
     
                int size = Integer.parseInt(br.readLine());
                int[][] arr = new int[size + 2][size + 2];
                //int[] result = new int[size];
                 
                /* 값 입력  */
                for(int i = 0; i < size+2; i++){
                    arr[0][i] = 7;
                    arr[size+1][i] = 7;
                }
                 
                int i = 1;
                while(i <= size){
                    arr[i][0] = 7;
                    arr[i][size+1] = 7;
                    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                    int j = 1;
                    while(st.hasMoreTokens()){
                        //nextToken()을 통해 띄어쓰기(" ")를 제거하고 남은 숫자를 스트링 형태에서 int로 형변환하여 arr에 저장.
                        arr[i][j] = Integer.parseInt(st.nextToken());
                        j++;
                    }   
                    i++;
                }
                 
                /*for(int k = 1; k <= size; k++){
                    for(int j = 1; j <= size; j++){
                        System.out.print(arr[k][j]);
                    }
                    System.out.println();
                }*/
                 
                /*도시를 세우기 적합한 장소 카운트 */
                 
                for(int m = 1; m <= size; m++){
                    for(int n = 1; n <= size; n++){
                         
                        int wasteland = 0; //볼모지
                        int river = 0; //물
                        int mountain = 0; //산
                        int grassland = 0; //초원             
                         
                        for(int r = m-1; r <= m+1; r++){
                            for(int c = n-1; c <= n+1; c++){
                                 
                                if(arr[r][c] == 0){
                                    wasteland = 1;
                                    break;
                                }
                                 
                                if(arr[r][c] == 1){
                                    river = 1;
                                }
                                 
                                if(arr[r][c] == 2){
                                    mountain = 1;
                                }
                                 
                                if(arr[r][c] == 3){
                                    grassland = 1;
                                }
                                 
                            }
                        }
                         
                        if(wasteland == 1){
                            continue;
                        }
                         
                        if((river == 1) && (mountain == 1) && (grassland == 1) && (wasteland == 0)){
                            count++;
                        }
                         
                    }
                }
                System.out.println("#"+(start++)+" "+count);
             
            }
 
    }
}
