package backjoon;

import java.io.*;
import java.util.*;

public class stage03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine().trim());
        
        for(int i=0; i<n; i++){
			String[] tmp = (br.readLine()).split(" ");
			int tot = Integer.parseInt(tmp[0])+Integer.parseInt(tmp[1]);
			bw.write(tot+"\n");
		}
		bw.flush();
		bw.close();
//		for(int i=0;i<n;i++) {
//			System.out.println(x[i]+y[i]);			
//		}

		//		String str = sc.next();
//		for(int i=0; i<str.length();i+=10) {
//			int end = i+10;
//			int start = i;
//			String c ="";
//			if(i+10 > str.length()) c = str.substring(start);
//			else c = str.substring(start, end);
//			//System.out.println(start+">>>>>"+end);
//			System.out.println(c);
//		}
//		int n = sc.nextInt();
//		while(true) {
//			if(!str.equals("")&&str != null) break;
//			str = sc.next();
//			//System.out.println(str);
//		}
//		int sum = 0;
//		System.out.println(str.length());
//		for(int i=0; i<n;i++) {
//			String c = str.substring(i, i+1);
//			//System.out.println(c);
//			sum += Integer.parseInt(c.trim());
//		}
//		System.out.println(sum);
		
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int n = sc.nextInt();		
		
//		for(int i=0;i <= n; i++) {
//			System.out.println(i);
//		}
//		for(int i=n;i >0; i--) {
//			System.out.println(i);
//		}
//		for(int i=1;i < 10; i++) {
//		System.out.println(n+" * "+i+" = "+n*i);
//		}
//		String cnt = "*";
//		for(int i=1;i <= n; i++) {
//		System.out.println(cnt);
//		cnt += "*";
//		}
//		String cnt = "*";
//		
//		for(int i=1;i <= n; i++) {
//			String spc = "";
//			for(int j=i+1;j <= n; j++) {	
//				spc += " ";
//			}
//			System.out.println(spc+cnt);
//			
//			cnt += "*";
//		}
//		String cnt = "*";
//		for(int i=1;i <= n; i++) {
//		cnt += "*";
//		}
//		for(int i=0;i<n;i++) {
//		String rep = cnt.substring(0, i).replaceAll(".", " ");
//		System.out.println(rep + cnt.substring(i,n));
//		}
//		int[] dayMon = new int[12];
//		int idx = 0;
//		int monSum =0;
//		for(int i=1;i<=12;i++) {
//			if(i%7%2==1||i%7==0) {
//				dayMon[idx] = 31; 
//			}
//			else if(i==2) {
//				dayMon[idx] = 28; 				
//			}
//			else {
//				dayMon[idx] = 30; 				
//			}
////			System.out.println(i+"<<<<<<"+dayMon[idx]);
//
//			idx++;
//		}
//		for(int i=0;i<x-1;i++) {
//			monSum += dayMon[i];
////			System.out.println(i+">>>>>>>"+monSum);
//		}
////		System.out.println(monSum+y);
//		switch((monSum+y-1)%7) {
//			case 1 : System.out.println("TUE");
//					break;
//			case 2 : System.out.println("WED");
//					break;
//			case 3 : System.out.println("THU");
//					break;
//			case 4 : System.out.println("FRI");
//					break;
//			case 5 : System.out.println("SAT");
//					break;
//			case 6 : System.out.println("SUN");
//					break;
//			default : System.out.println("MON");
//					break;
//		}
	}
}
