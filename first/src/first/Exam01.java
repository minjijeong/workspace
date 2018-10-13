package first;

import java.util.*;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.N개의 정수를 입력받는다. 
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int max = (int)Math.pow(2, size)-1;
        System.out.println("size :"+size);
        System.out.println("max :"+max);
        int[] arr1,arr2 = new int[size];
        int[] res = new int[size];
        
        Exam01 ex = new Exam01();
        arr1 = ex.randomVals(max,size);
        arr2 = ex.randomVals(max,size);
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        
        for(int i = 0; i <size;i++) {
        	res[i] = ex.escapeNum(arr1[i], arr2[i], max);
        }
        //int loop = 0; 
	}
	
	public int[] randomVals(int max, int size) {
		int[] arry= new int[size];

        Random generator = new Random();
        
        for(int i=0;i < size;i++) {
        	arry[i] = generator.nextInt(max);
        }

		return arry;
	}
	
	public int escapeNum(int a, int b, int maxNum) {
		int res = a|b;
//		System.out.println(a+"\n"+b);
//		System.out.println(Integer.toBinaryString(a)+"\n"+Integer.toBinaryString(b));
//		System.out.println(res);
//		System.out.println(Integer.toBinaryString(res));
//        System.out.println("=========================\n");
//        System.out.println(maxNum);		
		
		res = res^maxNum;
//		System.out.println(res);
//		System.out.println(Integer.toBinaryString(res));
		return res;
	}

}
