package study_20181013;

import java.util.Arrays;
import java.util.Scanner;

public class chapter01 {
/*
 * 1. 배열을 이용한 알고리즘 
 * 정렬 : 항목의 집합을 특정한 순서대로 맞추는 것, desc, asc 존재
 * 외부정렬: 외부기억장치에 대부분의 데이터가 있고, 일부만 주기억장치에 저장된 상태에서 정렬
 * 
 * 1.1 단순(리스트 크기가 작고 정렬을 자주하지 않는다) 
 * 삽입, 선택, 버블정렬
 * 1) 선택정렬 : 제일 큰 것을 찾는 선택 정렬 방법과 제일 작은 것을 찾는 선택정렬방법이 있음
 * 2) 삽입정렬 : M개 짜리 배열에 하나의 원소를 추가하여 M+1 개짜리 정렬된 배열을 만드는 과정을 반복함
 * 
 * 1.2 복잡(리스트가 복잡하고 정교한 정렬) 
 * 퀵, 히프, 병합, 기수정렬
 * 1) 병합정렬 : 자신에 비해 크기가 반이 ㄴ배열을 정렬한 다음 이들을 병합하는 일을 재귀적으로 반복함, 데이터 크기가 클수록 효율적 
 * 2) 퀵정렬 : 임의의 숫자를 기준으로 작거나 같은 값을 지닌 숫자는 앞으로, 큰 값을 지닌 숫자는 뒤로 가도록 하여 작은 값을 갖는 숫자와 큰 값을 갖는 숫자로 분리해가며 정렬. 데이터가 실시간 입력되고 있을때 효율적임
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.1.1 선택정렬 
		 */
//		int[] score = {41,31,48,97,9,65,27,29,13,15};
		String[] grade = {"F","D","D+","C","C+","B","B+","A","A+","A+"};
		Scanner sc = new Scanner(System.in);
		System.out.println("배열크기 지정?");
		int size = sc.nextInt();
		System.out.println("성적을 입력해주세요. 스페이스바로 구분해주세요.");
		int[] scores = new int[size];
		//int score = sc.nextInt();
		//String test = sc.nextLine();
		
		for(int i=0;i<size;i++) {
			scores[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(scores));
		
	}

}
