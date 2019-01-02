package basic_bj;

import java.util.*;

public class Prime03 {
	public static final int MAX = 1000000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean[] ls = new boolean[MAX+1];
		ls[0] = ls[1] = true;
		for(int i=2;i*i < MAX; i++) {
			if(ls[i] == false) {
				for(int j = i+i; j <= MAX;j+=i) {
					ls[j] = true;
				}
			}
		}
		
		while(sc.hasNext()) {
			int num = sc.nextInt();
			if(num == 0) break;
			prime(num,ls);
		}
	}
	
	public static void prime(int x,boolean[] ls) {
		int max = 0; 
		
		for(int i=x-1; i>1; i--) {	
			if(ls[i]==false) {
				//System.out.println(i+"="+ls[i]+">>>>>"+ls[x-i]);
				if(ls[x-i] ==false) {
					max = i;
					break;
				}
			}
		}
		if(max != 0 ) System.out.println(x+" = "+(x-max)+" + "+(max));
		else System.out.println("Goldbach's conjecture is wrong.");
	}

}

//
//public static final int MAX = 1000000;
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	Scanner sc = new Scanner(System.in);
//    
//    // ¼Ò¼ö list
//    ArrayList<Integer> prime = new ArrayList<Integer>();
//    boolean[] ls = new boolean[MAX+1];
//    ls[0] = ls[1] = true;
//    
//    for(int i=2;i*i <= MAX; i++) {
//    	if(ls[i] == true) {
//    		continue;
//    	}
//        prime.add(i);
//   		for(int j = i+i; j <= MAX;j+=i) {
//    		ls[j] = true;
//	    }
//    	//if(i==2) ls[i] = false;
//    }
//		
//	while(true) {
//		int num = sc.nextInt();
//		if(num == 0) {
//			break;
//		}
//
//	    for(int i=1; i < prime.size(); i++) {
//	    	int p = prime.get(i);
////	    	System.out.println(i+">>>>>>>"+p+"<<<<<<<"+(num-p));
////	    	System.out.println(ls.length);
////	    	System.out.println(ls[num]);
////	    	System.out.println(ls[p]);
////	    	System.out.println(ls[num-p]);
//            if(p >= num) {
//            	System.out.println("Goldbach's conjecture is wrong.");
//            	break;
//            }
//	    	if(ls[num-p]== false) {
//		    	System.out.println(num+" = "+p+" + "+(num-p));
//                break;
//			}
//
//	    }
//    }
//	sc.close();
//}
