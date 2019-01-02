package basic_bj;

import java.util.Scanner;

public class BruteFore_9095 {
	 public static int go(int sum, int goal) {
		if(sum > goal) {
			return 0;
		}
		if(sum == goal) {
			return 1;
		}
		int now = 0;
		for(int i=1;i<=3;i++) {
			now += go(sum+i,goal);
		}
		return now;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
//		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println(go(0,n));
		}	
	}
}
