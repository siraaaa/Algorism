import java.util.*;
import java.io.*;
public class Question3 {
//2018.09.12
//Q3. How many ones?
//AxB = 111, 11111.. 가장 작은 C : 찾고자 하는 수 C는 111, 이 때 1의 개수는?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int t = num;
		int i = 1; // 2부터 시작
		
		while(!hasAllOnes(t)){ //true일 때 무한루프, !true(=false)가 되면 루프 종료
			i++;
			t = num * i; //2부터 곱하면서 모두 1인지 아닌지 검사
		}
		System.out.println(countOnes(t)); //t의 1의 개수를 세어서 출력
	}
	
	//모두 1인지 아닌지 검사
	public static boolean hasAllOnes(int n){
		while(n!=0){
			int a = n % 10;
			if(a != 1){
				return false;
			}
			n = n / 10;
		}
		return true;
	}
	
	public static int countOnes(int n){
		int count = 0;
		while(n != 0){
			count++;
			n = n/10;
		}
		return count;
	}
}
