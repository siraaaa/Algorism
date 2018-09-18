import java.util.*;
import java.io.*;
public class Question1_hw {
//2018.09.19
//How many carry operations?
//십진수를 이진수로 변환하여 carry 계산
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int carry = 0; //carry 여부 확인 (like flag)
		int count = 0; //carry 숫자 count
		
		String string1 = "";
		String string2 = "";
		
		/* 이진수(거꾸로)로 변환하기 */
		while(num1 != 0){
			string1 += num1 % 2;
			num1 = num1 / 2;
		}
		while(num2 != 0){
			string2 += num2 % 2;
			num2 = num2 / 2;
		}
		
		//자바 문자열 뒤집는 함수 reverse()
		//String reversedString = new StringBuilder(originalString).reverse().toString();
		String newStr1 = "";
		String newStr2 = "";
		for(int i = string1.length()-1; i >= 0; i--){
			newStr1 += string1.charAt(i);
		}
		
		for(int i = string2.length() - 1; i >= 0; i--){
			newStr2 += string2.charAt(i);
		}
		
		int a = Integer.parseInt(newStr1);
		int b = Integer.parseInt(newStr2);
		
		while(a!=0 || b!=0){

			int s = a % 10;
			int t = b % 10;
			
			carry = (s + t + carry) / 2;
			
			if(carry == 1){
				count++;
			}
			
			a = a/10;
			b = b/10;
		}
		System.out.println(count);
	}
}
