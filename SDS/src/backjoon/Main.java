package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//	http://rightbellboy.tistory.com/19
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] ex = {1,2,4,7};

		while(sc.hasNextLine()) {
		int num1 = sc.nextInt();
		
		int num2 = 3;
		int num3 = 5;
		int r = num1;
		int cnt = 0;

		if( Arrays.asList(ex).contains(r)) {
			cnt = -1;
		}
		else {
			if(r == 3) {
				cnt = 1;
			}
			else if(r %num3%num2==0) {
				cnt += r/num3 + r%num3/num2 ;
			}
			else if(r%num3==1 && (r-6)%num3==0) {
				cnt += (r-6)/num3;
				if(r >= 6) cnt +=(6/num2);
				else cnt = -1; 
				
			}
			else if(r%num3==2 && (r-12)%num3==0) {
				cnt += (r-12)/num3;
				if(r >= 12) cnt +=(12/num2);
				else cnt = -1; 
			}
			else if(r%num3==4 && (r-9)%num3==0) {
				//System.out.println("num1/num2:"+num1+"/"+num2+"/"+9%num2);
				cnt += (r-9)/num3;
				if(r >= 9) cnt += 9/num2;
				else cnt = -1; 
				
			}
			
		}
		System.out.println(cnt);

//		System.out.println((num1+num2)%num3);
//		System.out.println((num1%num3+num2%num3)%num3);
//		System.out.println((num1*num2)%num3);
//		System.out.println((num1%num3*num2%num3)%num3);
		
//		System.out.println(num1 + num2);
//		System.out.println(num1 - num2);
//		System.out.println(num1 * num2);
//		System.out.println(num1/num2);
//		System.out.println(num1%num2);
		
		
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		}
		sc.close();
	}

}
