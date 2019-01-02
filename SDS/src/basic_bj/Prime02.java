package basic_bj;

import java.util.Scanner;

public class Prime02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();

        boolean[] check = new boolean[end+1];
		check[0] = check[1] = true;

		for(int i=2;i*i<=end;i++) {
			if(check[i]==false) {
				for(int j= i*i; j <= end; j+=i ) {
					check[j] = true;
				}
			}
		}
		
		for(int i=start;i<=end;i++) {
			if(check[i]== false) System.out.println(i);
		}	
//		int[] list = Prime(start,end);
//		for(int i=0;i<list.length;i++) {
//			if(list[i] >= start && list[i] <= end) System.out.println(list[i]);
//		}
	}
//	public static int[] Prime(int x, int y) {
//		int[] prime = new int[y-x+1];
//		int pn = 0;
//		boolean[] check = new boolean[y+1];
//		check[0] = check[1] = true;
//
//		for(int i=2;i<=y;i++) {
//			if(check[i]==false) {
//				//System.out.println(i);
//				prime[pn++] = i;
//				for(int j= i*i; j <= y; j+=i ) {
//					check[j] = true;
//				}
//			}
//		}
//		return prime;
//	}

}
