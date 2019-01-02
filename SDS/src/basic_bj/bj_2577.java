package basic_bj;

import java.io.*;
import java.util.*;

public class bj_2577 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		입력
//		첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.
//		출력
//		첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
		Scanner sc = new Scanner(System.in);
//		String line = "";
		int numCnt = 3; 
		int[] arr = new int[numCnt];
		String resStr = "";
		int idx = 0;
		while(idx < arr.length) {
			arr[idx] = sc.nextInt(); 
			idx ++;
		}
		
		int res = 1; 
		for(int j=0;j<numCnt;j++) {
			res *= arr[j];
		}
		resStr = String.valueOf(res).trim();
		int size = resStr.length();
		
		int[] nArr = new int[size];
		int index = 0;
		int tmp = res;
		
		//System.out.println(res);
		for(int i=size-1;i>=0;i--) {
			int div = (int)Math.pow(10, i);
			nArr[index] =  (tmp/div);
			tmp = (tmp - div*(tmp/div));
			index ++;
		}
		
		for(int num=0;num <10;num++) {
			int cnt = 0;
			for(int i=0;i<nArr.length;i++) {
				if(nArr[i]==num) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}

//
//public static void main(String[] args) throws IOException {
//	// TODO Auto-generated method stub
////	입력
////	첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.
////	출력
////	첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
//	BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
//	BufferedWriter wr  = new BufferedWriter(new OutputStreamWriter(System.out));
////	String line = "";
//	int numCnt = 3; 
//	String[] arr = new String[numCnt];
//	String resStr = "";
//	int idx = 0;
//	while(idx < arr.length) {
//		String str = br.readLine().trim();
//		int tmp = Integer.parseInt(str);
//		if(!str.isEmpty()) {
//			arr[idx] = str; 
//			idx ++;
//		}	
//	}
//	
//	int res = 1; 
//	for(int j=0;j<numCnt;j++) {
//		res *= Integer.parseInt(arr[j]);
//	}
//	System.out.println(res);
//	resStr = String.valueOf(res).trim();
//	for(int num=0;num <10;num++) {
//		int cnt = 0;
//		for(int i=0;i<resStr.length()-1;i++) {
//			String chr = resStr.substring(i, i+1);
//			if(Integer.parseInt(chr) ==num) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
//	}
//	
//}
