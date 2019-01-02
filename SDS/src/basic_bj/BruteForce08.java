package basic_bj;

import java.util.*;

public class BruteForce08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i <n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int max = 0;
		do {
			int tmp = calculate(a);
			max = Math.max(max, tmp);
		}while(next_permutation(a));
		
		System.out.println(max);
	}
	public static boolean next_permutation(int[] a) {
		int i = a.length - 1;
		while(i > 0 && a[i-1] >= a[i]) {
			i-=1;
		}
		
		if(i <= 0) {
			return false;
		}
		
		int j = a.length -1;
		while(a[j] <= a[i-1]) {
			j -=1;
		}
		
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length -1;
		while(j > i) {
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
			i += 1;
			j -= 1;
		}
		
		return true;
	}
	public static int calculate(int[] a) {
		int sum = 0; 
		for(int i=1; i< a.length;i++) {
			sum = sum + Math.abs(a[i] - a[i-1]);
//			System.out.println(sum);
		}

		return sum;
	}

}