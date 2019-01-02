package basic_bj;

import java.util.Scanner;

public class BruteForce06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		if(next_permuation(a)) {
			for(int k=0;k <n;k++) {
				System.out.print(a[k]+" ");
			}
			System.out.println();
		}
		else {
			System.out.println("-1");
		}
		
	}
	public static boolean next_permuation(int[] a) {
		int i = a.length -1; 
		while(i > 0 && a[i-1] <= a[i]) {
			i-=1;
		}
    	if(i <= 0) {
    		return false;
    	}
    	
		int j = a.length -1; 
		while(a[j] >= a[i-1]) {
			j-=1;
		}
		
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		while(i < j) {
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
			i += 1; 
			j -= 1;
		}
		return true;
		
	}

}
