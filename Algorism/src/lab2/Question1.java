package lab2;
import java.util.*;
import java.io.*;

public class Question1 {
//2018.09.19
//Q1. Simple Encoding, n개의 숫자를 입력 받아 n개의 숫자 중 하나를 선택하여 1 증가 시킨 후에 모든 숫자를 곱함. 그 중 최대값

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String numbers = sc.nextLine();
		String[] token = numbers.split(" "); 
		
		/*for(int i = 0; i < token.length; i++){
			System.out.println(token[i]);
		}*/
		System.out.println(getEncoding(token));
	}
	
	public static int getEncoding(String[] token){
		int max = 0;
		
		for(int i = 0; i < token.length; i++){
			int total = 1;
			token[i] = String.valueOf(Integer.parseInt(token[i]) + 1);
			//System.out.println(token.length);
			for(int j = 0; j <= token.length-1; j++){
				total = total * Integer.parseInt(token[j]);
				//System.out.println("total:" + total);
			}
			if(total > max){
				max = total;
			}
			token[i] = String.valueOf(Integer.parseInt(token[i]) - 1);
			//System.out.println("max:" + max);
		}
		
		return max;
	}

}
