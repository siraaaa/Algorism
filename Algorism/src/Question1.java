import java.util.*;
import java.io.*;
public class Question1 {
//2018.09.12 알고리즘
//how many carry operations?
//두 개의 자연수를 입력 받아 더할 때 몇번의 carry가 생기는지 출력
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int i = 0;
		int carry = 0; //발생한 carry 개수 count
		ArrayList<Integer> list = new ArrayList<Integer>();
		i
		while(st.hasMoreTokens()){
			list.add(Integer.parseInt(st.nextToken()));
			i++;
		}*/
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int carry = 0;
		int cnt = 0;
		
		while ( a != 0 || b != 0){
			int s = a % 10;
			int t = b % 10;
			
			carry = ( s + t + carry ) / 10;
			
			if(carry == 1){
				cnt++;
			}
			
			a = a/10;
			b = b/10;
		}
		
		System.out.println(cnt);
		
	
		
		

	}

}
