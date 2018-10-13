package sort;

public class sort_sel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort_sel ex = new sort_sel();
		
		int[] data = {41,31,48,97,9,65,27,29,13,15};
		ex.sort(data);
		
		for(int i=0;i < data.length; i++) {
			System.out.println("data["+i+"] : "+data[i]);
		}
	}
	
	public void sort(int[] data) {
		int size = data.length;
		int min;
		int temp;
		
		for(int i=0; i<size-1; i++) {
			min = i;
			for(int j=i+1; j<size;j++) {
				if(data[min] > data[j]) {
					min = j;
				}
			}
			System.out.println("i data["+i+"] : "+data[i]);
			System.out.println("max data["+min+"] : "+data[min]);
			
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
	}
    static int[][] rotateImage(int[][] a,int i,int move) {
        int n = a.length;
        boolean cycle;
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
	        for(int j = i; j < n-i-1; j++){
	            int temp = a[i][j];
	            a[i][j] = a[n-j-1][i];
	            a[n-j-1][i] = a[n-1-i][n-1-j];
	            a[n-1-i][n-1-j] = a[j][n-1-i];
	            a[j][n-1-i] = temp;

	    		//90도 회전 출력

	    		System.out.println("===============i="+i+"======j="+j+"=====================");

	    		for(int m=0;m<=n-1;m++){

	    			for(int l=0;l<=n-1;l++){

	    				System.out.printf("%3d", a[m][l]);

	    			}

	    			System.out.println();

	    		}
	        }
        }
        else {
	        for(int j = i; j < n-i-1; j++){
	            int temp = a[j][n-1-i]; 
	            a[j][n-1-i] = a[n-1-i][n-1-j] ;
	            a[n-j-1][i] = a[i][j];
	            a[n-1-i][n-1-j] = a[n-j-1][i] ;
	            a[i][j] = temp;
	        }        	
        }
        return a;
    }
}
