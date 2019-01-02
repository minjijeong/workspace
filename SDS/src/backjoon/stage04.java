package backjoon;

import java.io.*;
//import java.util.Scanner;

public class stage04 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int n = Integer.parseInt(br.readLine().trim());
//		br.close();
		boolean[] chk = new boolean[10001];
		for(int i=1;i<=10000;i++) {
//			System.out.println(i+">>>"+chk[i]);
				int a = 0,b = 0,x = 0;
				int y = i%10;
				int sum = 0;
				if(i>=10 && i <100) {
					x = i/10;
				}
				else if(i>=100 && i <1000) {
					b = i/100;
					x = (i%100)/10;
				}
				else if(i>=1000 && i <10000) {
					a = i/1000;
					b = (i%1000)/100;
					x = (i%100)/10;
				}
				sum = i+a+b+x+y;					

				if(sum <= 10000) {
					chk[sum] = true;
//					System.out.println(sum);
//					System.out.println(chk[sum]);
				}			
		}
		
		for(int i=1;i<=10000;i++) {
			if(chk[i]==false) {
				bw.write(String.valueOf(i+"\n"));
//				System.out.println(i);
			}
		}

		bw.flush();
		bw.close();
	}
}

////do {			
////int x = rt/10;
////int y = rt%10;
////System.out.println("x=>"+x+">>y="+y);
////int sum = (x+y)%10;
////System.out.println(sum);
////rt = y*10+sum;
////System.out.println(rt);
////i++;
////}while(n != rt);
//while(true) {			
//int x = rt/10;
//int y = rt%10;
//		
//int sum = (x+y)%10;
//rt = y*10+sum;
//i++;
//if(n==rt) break;
//}
//bw.write(String.valueOf(i));
//bw.flush();
//bw.close();

//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//int n = Integer.parseInt(br.readLine().trim());
//
//for(int m=0;m < n ;m++) {
//
//	String[] ds = br.readLine().split(" ");
//	int np = Integer.parseInt(ds[0]);
//	double tot = 0;
//	for(int i=1;i <= np ;i++) {
//		int comp = Integer.parseInt(ds[i]);
//		tot += (double)comp;
//	}
//	double avg = (tot/np);
//
////	System.out.println(tot);
////	System.out.println(avg);			
//	int hsCnt = 0;
//	for(int i=1;i <= np ;i++) {
//		int comp = Integer.parseInt(ds[i]);
//		if((int)avg < comp) hsCnt++;  
//	}
////	System.out.println(hsCnt);
//    System.out.printf("%.3f", 100.0 * (double)hsCnt / np);
//    System.out.println("%");
//    
////	bw.write(Math.round(((double)hsCnt/np*100)*1000.000)/1000.000+"% \n");		
//
//}
////System.out.format("%.6f%n", avg);
//bw.flush();
//bw.close();

//int n = Integer.parseInt(br.readLine().trim());
//
//String[] score = br.readLine().split(" ");
//
//double tot = 0;
//double max = 0;
//double l = score.length;
//for(int i=0;i < l ;i++) {
//	int comp = Integer.parseInt(score[i]);
//	tot += (double)comp;
//	if(max < comp) max = comp;
//	//if(x > comp) System.out.println(comp);
//}
//double avg = (tot*100/max/l);
//bw.write(String.valueOf(Math.round(avg*1000000.0)/1000000.0));		
////System.out.format("%.6f%n", avg);
//bw.flush();
//bw.close();

//String[] in = br.readLine().split(" ");
//int n = Integer.parseInt(in[0]);
//int x = Integer.parseInt(in[1]);
//
//String[] num = br.readLine().split(" ");
//
//for(int i=0;i < n ;i++) {
//	int comp = Integer.parseInt(num[i]);
//	if(x > comp) System.out.println(comp);
//}

//String in = br.readLine();

//String[] sc = in.split(" ");
//int max = 0, min=0, tot = 0;
//for(int i=0;i<sc.length;i++) {
//	int a = Integer.parseInt(sc[i]);
//	if(max < a) {
//		max = a;
//	}
//	if(min > a || min == 0) {
//		min = a;
//	}
//	tot += a;
//}
//System.out.println(tot - max - min);

//Scanner sc = new Scanner(System.in);
//
//int score = sc.nextInt();
//
//while(true) {
//	if (score >= 90) {
//		System.out.println("A");
//		break;
//	}
//	else if(score < 90 && score >=80) {
//		System.out.println("B");
//		break;				
//	}
//	else if(score < 80 && score >=70) {
//		System.out.println("C");
//		break;				
//	}
//	else if(score < 70 && score >=60) {
//		System.out.println("D");
//		break;				
//	}
//	else {
//		System.out.println("F");
//		break;
//	}
//
//
//}
