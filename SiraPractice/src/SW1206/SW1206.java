package SW1206;

import java.util.*;
import java.io.*;

public class SW1206 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String path = "./input.txt";

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader(path));
	
		int num = 1;
		String line;
		while((line=br.readLine())!=null){//파일 끝까지 읽기
		
			int width = Integer.parseInt(line);
			int[] arr = new int[width];
			int i = 0;
			
			while(i < width){
				//스트링 토크나이저를 이용해 readLine()을 통해 한 줄을 한번에 입력받은것을 띄어쓰기(" ")를 기준으로 쪼갬
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				while(st.hasMoreTokens()){
					//nextToken()을 통해 띄어쓰기(" ")를 제거하고 남은 숫자를 스트링 형태에서 int로 형변환하여 arr에 저장.
					arr[i] = Integer.parseInt(st.nextToken());
					i++;
				}
			}
			
			int count = 0;
				
			for(int j = 2; j < width-2; j++){
				int k = j;
				int tmp[] = {arr[k-2], arr[k-1], arr[k+1], arr[k+2]};
				Arrays.sort(tmp);
				//System.out.println(temp);

				if((arr[k] > arr[k+1]) && (arr[k] > arr[k-1]) && (arr[k] > arr[k+2]) && (arr[k] > arr[k-2])){				
					count += arr[k] - tmp[3];	
				}
				else{
					continue;
				}

			}
			
			System.out.println("#"+ (num++) +" "+count);

		}
		
		

	}

}
