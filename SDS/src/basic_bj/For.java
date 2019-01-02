package basic_bj;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		//int[] arr = new int[qty];
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int res = 0;
			/*
			while(true) {
				if(i >= qty) break;
				arr[i] = sc.nextInt();
			}
			*/
			System.out.println(n);
			for(int i0=1;i0<=3;i0++) {
				if(i0 == n) res += 1;
				for(int i1=1;i1<=3;i1++) {
					if(i0+i1 == n) res += 1;
					for(int i2=1;i2<=3;i2++) {
						if(i0+i1+i2 == n) res += 1;
						for(int i3=1;i3<=3;i3++) {
							if(i0+i1+i2+i3 == n) res += 1;
							for(int i4=1;i4<=3;i4++) {
								if(i0+i1+i2+i3+i4 == n) res += 1;
								for(int i5=1;i5<=3;i5++) {
									if(i0+i1+i2+i3+i4+i5 == n) res += 1;
									for(int i6=1;i6<=3;i6++) {
										if(i0+i1+i2+i3+i4+i6 == n) res += 1;
										for(int i7=1;i7<=3;i7++) {
											if(i0+i1+i2+i3+i4+i5+i6+i7 == n) res += 1;
											for(int i8=1;i8<=3;i8++) {
												if(i0+i1+i2+i3+i4+i5+i6+i7+i8 == n) res += 1;
												for(int i9=1;i9<=3;i9++) {
													if(i0+i1+i2+i3+i4+i5+i6+i7+i8+i9 == n) res += 1;
												}
											}
										}
									}
								}
							}
						}
					}
				}	
			}
			System.out.println(res);
        }
	}
}
