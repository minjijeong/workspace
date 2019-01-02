package basic_bj;

import java.util.Scanner;

public class bj_2448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 첫째 줄에 N이 주어진다. N은 항상 3×2k 수이다. (3, 6, 12, 24, 48, ...) (k ≤ 10)
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
         
        String map[] = new String[n];
        map[0] = "  *  ";
        map[1] = " * * ";
        map[2] = "*****";
         
        for (int k = 1; 3 * (int)Math.pow(2, k) <= n; ++k) {
        	printStar(k, map);
        }
         
        for (int i = 0; i < n; ++i) {
            System.out.println(map[i]);
        }
	}

	public static void printStar(int k,String map[]) {
		int bottom = (int) (3*(Math.pow(2, k)));
		int middle = bottom/2;
		
		for(int i=middle;i<bottom;i++) {
			map[i] = map[i-middle]+" "+map[i-middle];
		}
		String space = " ";
		while(space.length() < middle) {
			space += " ";
		}
		
		for(int i=0;i<middle;i++) {
			map[i] = space + map[i] + space;
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//    private static void makeBigStar(int k, String map[]) {
//        int bottom = 3 * (int)Math.pow(2, k);
//        int middle = bottom / 2;
//         
//        for (int i = middle; i < bottom; ++i) {
//            map[i] = map[i - middle] + " " + map[i -middle];
//        }
//         
//        String space = "";
//        while (space.length() < middle) {
//            space += " ";
//        }
//        for (int i = 0; i < middle; ++i) {
//            map[i] = space + map[i] + space;
//        }
//    }
}






