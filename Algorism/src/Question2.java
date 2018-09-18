import java.util.*;
import java.io.*;
public class Question2 {
//2018.09.12 알고리즘
//finding palindrome
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = reverse(n);
		
		while(n != n1){
			n = n + n1;
			n1 = reverse(n);
		}
		
		System.out.println(n);

	}
	
	public static int reverse(int n){
	
		int n1 = 0;
		while (n != 0){
			 n1 = n1*10 + n%10;
			 n /= 10;
		 }
		 return n1;
	}

}
