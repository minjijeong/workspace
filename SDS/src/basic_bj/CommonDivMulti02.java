package basic_bj;

import java.util.Scanner;

public class CommonDivMulti02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0 ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int g = GCD(a,b);
			int l = a*b/g;
			System.out.println(l);
		}
		sc.close();
	}
	
	public static int GCD(int a, int b) {
		if(b==0) {
			return a;
		}
		else return GCD(b, a%b);
	}

}
