package backjoon;

import java.util.*;

public class stage01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 최대공약수와 최소공배수
		Scanner sc = new Scanner(System.in);

		int r = 1;
		int num1=0,num2=0;
		for(int i=0;i<2;i++) {
			if(i==0) num1 = sc.nextInt();
			else num2 = sc.nextInt();
		}
		int tmp1 = num1, tmp2 = num2;
		if(num1 < num2) {
			num1 = tmp2;
			num2 = tmp1;
		}
		
		while(r > 0) {
			r = num1 % num2;
			num1 = num2;
			num2 = r;
		}
		int LCM = tmp1 * tmp2 / num1;
		System.out.println(num1);
		System.out.println(LCM);
		
	}
	
}
