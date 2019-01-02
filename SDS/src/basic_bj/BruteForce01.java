package basic_bj;

import java.util.*;

public class BruteForce01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] ls = new int[9];
		int n = 9;
		int totSum = 0;
		int idx = 0;
		while(n > idx) {
			int tmp = sc.nextInt();
			ls[idx] = tmp;
			totSum += tmp;
			idx++;
		}
		sc.close();
		//System.out.println(Arrays.toString(ls));
		Arrays.sort(ls);
		//System.out.println(Arrays.toString(ls));
		//System.out.println(n);
		for(int i=0 ; i < n; i++) {
			//System.out.println(Arrays.toString(ls));
			for(int j=i+1; j< n; j++) {
				//System.out.println(Arrays.toString(ls));
				if(totSum - ls[i] - ls[j] == 100) {
					for(int k=0; k<n;k++) {
						if(k ==i || k==j) continue;
						System.out.println(ls[k]);
					}
					System.exit(0);
				}
			}
		}
	}
}
