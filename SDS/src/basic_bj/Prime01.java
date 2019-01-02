package basic_bj;

import java.util.Scanner;

public class Prime01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int cnt = 0;
		while(A-- > 0) {
			int x = sc.nextInt();
			if(Prime(x)) {
				cnt++;
			}

		}
		System.out.println(cnt);
	}
	
	public static boolean Prime(int n) {
		if(n < 2) {
			return false;
		}
		// 2�� �Ҽ�
		else if( n == 2 ) {
			return true;
		}
		// root n ���� �۰ų� ������������ ����ó���ϸ�ȴ�.
		else {
			for(int i=2;i*i<=n;i++) {
				if(n % i == 0) return false;
			}
		}
		return true;
	}
}
