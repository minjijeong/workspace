package convert_N_Game;

public class Solution05 {
	   static String convert(int n, int base) {
	        String T = "0123456789ABCDEF";
	        int q = n / base;
	        int r = n % base;

	        if(q==0) return T.substring(r,r+1);
	        else return convert(q, base) + T.substring(r,r+1);
	  }

	    public String solution(int n, int t, int m, int p) {
	        String answer = "";
	        String allWord = "";
	        for(int i=0; allWord.length() < m*t; i++) {
	                allWord += convert(i, n);
	        }
	        System.out.println(allWord);
	         for(int i=0; i<t; i++){
	           answer += allWord.substring(i*m+p-1, i*m+p);
	        }
	        return answer;
	  }

	}
