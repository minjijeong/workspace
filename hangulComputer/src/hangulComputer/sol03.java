package hangulComputer;

import java.util.*;

public class sol03 {
	ArrayList<Integer>[] ord;
	
	public static int cal(int x, int y, int sum, int n) {
		if(sum > n) {
			return 0;
		}
		if(sum == n) {
			return 1;
		}
		int now = 0;
		for(int i=1;i<=y;i++) {
			now += cal(i,y,sum+i,n);
			System.out.println(now);
		}
		System.out.println("========================");
		return now;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// ��ü��ܼ�
		int n = sc.nextInt();
		// �ִ� �ѹ��� ������ �ִ� ��� ��
		int j = sc.nextInt();
		
		int[] ord = new int[n];
		
		System.out.println(cal(0,j,0,n));
		
		
	}
	

}
