package basic_bj;

import java.util.*;

public class BruteForce02_H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int n = 3;
		int idx = 0;
		int e=1, s=1, m=1;
		while(n > idx) {
			arr[idx] = sc.nextInt();
			idx++;
		}
		sc.close();
		
		for(int i=1;;i++) {
			if(e == arr[0] && s == arr[1] && m == arr[2]) {
				System.out.println(i);
				break;
			}
			
			e += 1;
			s += 1;
			m += 1; 
			
			if(e == 16) e = 1;
			if(s == 29) s = 1;
			if(m == 20) m = 1;
				
		}
	}
}
