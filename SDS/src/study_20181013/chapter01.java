package study_20181013;

import java.util.Arrays;
import java.util.Scanner;

public class chapter01 {
/*
 * 1. �迭�� �̿��� �˰����� 
 * ���� : �׸��� ������ Ư���� ������� ���ߴ� ��, desc, asc ����
 * �ܺ�����: �ܺα����ġ�� ��κ��� �����Ͱ� �ְ�, �Ϻθ� �ֱ����ġ�� ����� ���¿��� ����
 * 
 * 1.1 �ܼ�(����Ʈ ũ�Ⱑ �۰� ������ �������� �ʴ´�) 
 * ����, ����, ��������
 * 1) �������� : ���� ū ���� ã�� ���� ���� ����� ���� ���� ���� ã�� �������Ĺ���� ����
 * 2) �������� : M�� ¥�� �迭�� �ϳ��� ���Ҹ� �߰��Ͽ� M+1 ��¥�� ���ĵ� �迭�� ����� ������ �ݺ���
 * 
 * 1.2 ����(����Ʈ�� �����ϰ� ������ ����) 
 * ��, ����, ����, �������
 * 1) �������� : �ڽſ� ���� ũ�Ⱑ ���� ���迭�� ������ ���� �̵��� �����ϴ� ���� ��������� �ݺ���, ������ ũ�Ⱑ Ŭ���� ȿ���� 
 * 2) ������ : ������ ���ڸ� �������� �۰ų� ���� ���� ���� ���ڴ� ������, ū ���� ���� ���ڴ� �ڷ� ������ �Ͽ� ���� ���� ���� ���ڿ� ū ���� ���� ���ڷ� �и��ذ��� ����. �����Ͱ� �ǽð� �Էµǰ� ������ ȿ������
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.1.1 �������� 
		 */
//		int[] score = {41,31,48,97,9,65,27,29,13,15};
		String[] grade = {"F","D","D+","C","C+","B","B+","A","A+","A+"};
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭ũ�� ����?");
		int size = sc.nextInt();
		System.out.println("������ �Է����ּ���. �����̽��ٷ� �������ּ���.");
		int[] scores = new int[size];
		//int score = sc.nextInt();
		//String test = sc.nextLine();
		
		for(int i=0;i<size;i++) {
			scores[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(scores));
		
	}

}