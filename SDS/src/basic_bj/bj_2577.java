package basic_bj;

import java.io.*;
import java.util.*;

public class bj_2577 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		�Է�
//		ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ���ų� ũ��, 1,000���� ���� �ڿ����̴�.
//		���
//		ù° �ٿ��� A��B��C�� ����� 0 �� �� �� �������� ����Ѵ�. ���������� ��° �ٺ��� �� ��° �ٱ��� A��B��C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
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
////	�Է�
////	ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ���ų� ũ��, 1,000���� ���� �ڿ����̴�.
////	���
////	ù° �ٿ��� A��B��C�� ����� 0 �� �� �� �������� ����Ѵ�. ���������� ��° �ٺ��� �� ��° �ٱ��� A��B��C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
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
