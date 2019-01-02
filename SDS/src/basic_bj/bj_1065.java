package basic_bj;

import java.util.Scanner;

public class bj_1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int N = sc.nextInt();
		
		System.out.println(N+"==>"+count(N));
		
	}
	
	public static int count(int x) {
		int n1 = 0, n2 = 0, n3 = 0;
		int cnt = 0;
		// 범위 초과
		if(x > 1000) {
			cnt = -1;
		}
		// 정상 처리
		else {
			for(int i=1;i<=x;i++) {
				if(i/100 > 0) {
					n1 = i/100;
				}
				if(i/10 > 0) {
					n2 = (i-n1*100)/10;
				}
				if(i > 1) {
					n3 = (i-n1*100-n2*10);
				}
				System.out.println(i+"==>>"+n1+"=>>>>"+n2+"=>>>>"+n3);
				
				if(n1==0) {
					cnt++;
				}
				else {
					if((n3-n2)==(n2-n1)) {
						cnt++;
					}
				}
			}
		}
		return cnt;			
		
	}

}
