package basic_bj;

import java.util.Scanner;

public class CommonDivMulti03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0 ) {
			int m = sc.nextInt();
			int[] num = new int[m];
			for(int i=0; i< m; i++) {
				num[i] = sc.nextInt();
			}
			long gSum = 0; 

			for(int s=0; s < m-1;s++) {
				for(int l=s+1; l <m;l++) {
					gSum += GCD(num[s],num[l]);
				}
			}

			System.out.println(gSum);
		}
	}
	
	public static int GCD(int a, int b) {
		if(b==0) {
			return a;
		}
		else return GCD(b, a%b);
	}

}
