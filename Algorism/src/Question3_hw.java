import java.util.*;
import java.io.*;
public class Question3_hw {
//2018.09.19
//Q3. How many ones?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String numA = sc.nextLine();
		String numB = "1";
		String t = numA;
		
		while(!hasAllOnes(t)){
			t = multipleString(numA, numB);
			numB = String.valueOf((Integer.parseInt(numB) + 2)); //홀수만, 짝수 곱하면 1 안나옴
		}
		System.out.println(countOnes(t));
	}
	
	//모두 1인지 아닌지 검사 - 모두 1이면 true
	public static boolean hasAllOnes(String t){
		int i = 0;
		while(i<t.length()){
			if(t.charAt(i) != '1'){
				return false;
			}
			i++;
		}
		return true;
	}
	
	//1의 개수 세는 함수
	public static int countOnes(String t){
		int count = 0;
		int i = 0;
		while(i<t.length()){
			if(t.charAt(i)=='1'){
				count++;
			}
			i++;
		}
		return count;
	}
	
	//문자열 A X 문자열B 계산하여 결과를 문자열 C로 나타내기
	//일반적인 곱셈 방식으로 짠 코드
	public static String multipleString(String numA, String numB){
		
		//numA는 입력받은 값 고정, numB만 +1씩 증가하며 곱하기
		String tmp = "";
		String zero = "";
	
		String sum = "";
		String s ="";
		int bIndex = numB.length() - 1;
		
		//문자열끼리 곱하기, 23x12일 때 tmp에는 64, 032로 저장되므로 46,230으로 reverse하여 더해야 함.
		while(bIndex >= 0){
	
			tmp += zero;
			String b = String.valueOf(numB.charAt(bIndex)); //numB의 마지막 숫자부터 곱하기 시작
			int a = 0;
			int c = 0;
			int i = numA.length()-1;
			int flag = 0;
			while(true){
				if( i < 0){
					//입력받은 문자열의 자릿수를 초과하여 carry되는 경우를 위함
					a = 0;
					flag = 1;
				}
				else{
					a = (Integer.parseInt(b) * Integer.parseInt(String.valueOf(numA.charAt(i))));
				}
				
				if(c == 0 && flag == 1){ //문자열의 범위를 넘어서고, 더이상의 자리올림도 없는 상태
					break;
				}
					
				tmp += ((a + c) % 10);
				c = ((a + c) / 10);
				i--;
			}
	
			sum = sumString(sum, tmp);
			
			if((bIndex == numB.length() - 1) && sum.charAt(0)!='1'){
				break;
			}
		
			tmp = "";
			zero += "0"; //덧셈할 시 자릿수를 맞추기 위함
			bIndex--;
		}
		return sum;
	}
	
	//24x45일 때 각 자리수끼리 곱한 120과 960을 더함
	public static String sumString(String sum, String tmp){

		if(sum==""){
			sum += tmp;
			//System.out.println("sum 초기 : " + sum);
		}
		else{
			int i = 0;
			int carry = 0;
			String p = null; //tmp 자리 값 하나씩
			String q = null; //sum 자리 값 하나씩
			int flag1 = 0;
			int flag2 = 0;
			String s = "";

			while(true){			
				if(i>=tmp.length()){
					p = "0";
					flag1 = 1;
				}
				else{
					p = String.valueOf(tmp.charAt(i));
				}
				
				if(i>=sum.length()){
					q = "0";
					flag2 = 1;
				}
				else{
					q = String.valueOf(sum.charAt(i));
				}
				
				if((flag1 == 1 && flag2 == 1 && carry==0)){
					break;
				}

				int a = (Integer.parseInt(p) + Integer.parseInt(q) + carry) % 10;
				carry = (Integer.parseInt(p) + Integer.parseInt(q) + carry ) / 10;
				s += a;
				//System.out.println("a : "+ a);
				i++;
			}
			sum = s;
			//System.out.println("중간 sum : "+sum);
		}
		return sum;

	}

}
