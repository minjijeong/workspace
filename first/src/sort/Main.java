package sort;
import java.io.*;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		String a[][] = 		{{"강미나", "김도연", "김세정"}
		,{"김소혜", "김청하", "유연정"}
		,{"임나영" ,"전소미" ,"정채연"}};

		String b[][] =  		{{"강미나", "김도연", "김세정"}
		,{"김소혜", "김청하", "유연정"}
		,{"임나영" ,"전소미" ,"정채연"}};
		
		Scanner sc = new Scanner(System.in);
		
		int row, col;

		int i=1;
		
		// int n = sc.nextLine();
		int n = a.length; // 3
		
		int cyleCnt = a.length/2;
		
		int move = 1; //-777
		

		for(row=0;row<=n-1;row++){

			for(col=0;col<=n-1;col++){

				System.out.printf("%s", a[row][col]);

			}

			System.out.println();

		}

		Main ex = new Main(); 
		
		for(i=0;i<=cyleCnt-1;i++){
			b = ex.rotate(a, i, move);
		}

		

		//회전 출력

		System.out.println();

		for(row=0;row<=n-1;row++){

			for(col=0;col<=n-1;col++){

				System.out.printf("%s ", b[row][col]);

			}

			System.out.println();

		}

	}
	
	static String[][] rotate(String[][] a,int i,int move) {
			int n = a.length;
			boolean cycle;

			int first = 0; 
			int last = n-1;
			int value = 1; 

			if(move > 0) {
				if( i % 2 == 0)
					cycle = true;
				else 
					cycle = false; 
			}
			else {
				if( i % 2 == 0)
					cycle = false;
				else 
					cycle = true;
			}
			if(cycle == true) {
				int size = n-2*i;
				
				for(int col=0;col <size-1;col++ ) {
					if(col==n-i||col==i) {
						
					}
					
				}
				
				for(int j = i; j < size-i-1; j++){
					String temp = a[i][j];
					
					/*
						a[i][j] = a[n-j-1][i];
						a[size-j-1][i] = a[n-1-i][n-1-j];
						a[size-1-i][size-1-j] = a[j][n-1-i];
						a[j][n-1-i] = temp;
					*/

				System.out.println("===============i="+i+"======j="+j+"=====================");

				for(int m=0;m<=n-1;m++){

					for(int l=0;l<=n-1;l++){

						System.out.printf("%s ", a[m][l]);

					}

					System.out.println();

				}
				}
			}
			else {
				for(int j = i; j < n-i-1; j++){
						String temp = a[j][n-1-i]; 
						a[j][n-1-i] = a[n-1-i][n-1-j] ;
						a[n-j-1][i] = a[i][j];
						a[n-1-i][n-1-j] = a[n-j-1][i] ;
						a[i][j] = temp;
				}
			}
			return a;
	}
}