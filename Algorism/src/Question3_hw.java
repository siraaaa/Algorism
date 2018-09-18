import java.util.*;
import java.io.*;
public class Question3_hw {
//2018.09.19
//Q3. How many ones?
//AxB = 111, 11111.. 가장 작은 C : 찾고자 하는 수 C는 111, 이 때 1의 개수는?
//C의 값이 integer, long으로 표현이 안되는 경우(10^50 정도의 숫자를 처리할 수 있는 프로그램)
//string 으로 계산(유틸리티 쓰지말고 순수하게 문자열로만)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String numA = sc.nextLine();
		String t = numA;
		String numB = sc.nextLine();
		//문자열 곱셈하기
		//String numB = "1"; // 2부터 시작
		String tmp = "";
		String zero ="";
		ArrayList<String> list = new ArrayList<String>();
		
		int j = numB.length() - 1;
		
		//문자열끼리 곱하기, 23x12일 때 tmp에는 64, 032로 저장되므로 46,230으로 reverse하여 더해야 함.
		while(j >= 0){
			tmp += zero;
			String b = String.valueOf(numB.charAt(j));
			
			for(int i = numA.length() - 1; i >= 0; i--){
				tmp += (Integer.parseInt(b) * Integer.parseInt(String.valueOf(numA.charAt(i))));
			}
			//배열에 저장
			list.add(reverse(tmp));
			tmp = "";
			zero += "0";
			j--;
		}
		
		System.out.println(list);
	}
	
	public static String reverse(String s){
		String reverseStr = "";
		for(int i=s.length()-1; i >= 0; i--){
			reverseStr += s.charAt(i);
		}
		return reverseStr;
	}

}
