import java.util.*;
import java.io.*;
public class Question4 {
//2018.09.26
//Finding Path in Fantasia
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input_up = sc.nextInt();
		int input_down = sc.nextInt();
		
		if(input_up < input_down){
			fantasia(input_up, input_down, 0,1,1,1,0);
		}
		else{
			fantasia(input_up, input_down, 1,1,1,0,1);
		}
		System.out.println(rslt);
	}

	static String rslt = "";
	static int flag;
	static int num2_up, num2_down;

	public static void fantasia(int input_up, int input_down, int num1_up, int num1_down
			, int num3_up, int num3_down, int flag){
		
		num2_up = num1_up + num3_up;
		num2_down = num1_down + num3_down;
		
		/*System.out.println("num1_up : "+num1_up+", num1_down :"+num1_down);
		System.out.println("num3_up : "+num3_up+", num3_down :"+num3_down);
		System.out.println("num2_up : "+num2_up+", num2_down :"+num2_down);
		System.out.println("------------------------------------------");*/
		
		if(flag == 0){
			rslt += "L";
		}
		else if(flag == 1){
			rslt += "R";
		}
		else{
			rslt += "";
		}
		
		if((num2_up==input_up) && (num2_down==input_down)){
			return;
		}
		else{
			if(num2_up*input_down < input_up*num2_down){
				//오른쪽
				fantasia(input_up, input_down, num2_up, num2_down, num3_up, num3_down, 1);
			}
			else{
				//왼쪽
				fantasia(input_up, input_down, num1_up, num1_down, num2_up, num2_down, 0);
			}
		}
		
	}


}
