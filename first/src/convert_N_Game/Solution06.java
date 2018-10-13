package convert_N_Game;

public class Solution06 {
	    public String convert(int n, int num) {
	        return Integer.toString(num, n).toUpperCase();
	    }

	    public String solution(int n, int t, int m, int p) {
	        String answer = "";
	        int num = 0;
	        int idx = 0;

	        game : while (true) {
	            String nNum = convert(n, num);
	            for (char c : nNum.toCharArray()) {
	                idx++;

	                if(idx == p) {
	                    answer += c;
	                    if (answer.length() == t) break game;
	                }

	                idx %= m;
	            }

	            num++;
	        }

	        return answer;
	    }
	}