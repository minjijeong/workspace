package basic_bj;

import java.util.Scanner;

public class CommonDivMulti01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt(); 
		sc.close();

		int g = GCD(A,B);
		int s = A*B/g ;
		System.out.println(g);
		System.out.println(s);
		
	}
	// static으로 선언시, 별도의 객체 선언 없이 사용가능
	public static int GCD(int a, int b) {
		if(b==0) {
			return a;
		}
		else {
			return GCD(b, a%b);		
		}
	}
}
