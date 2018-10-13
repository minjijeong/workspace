package first;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);        
        for(int i=0;i < participant.length; i++) {
            if(i < completion.length) {
            	if(!completion[i].equals(participant[i])) {
                    answer = participant[i];
                    break;
	        	}
        	}
        	else {
                answer = participant[i];
                break;           		
        	}
        }        
        return answer;
    }

	public static void main(String[] args) {
		String[] part = { new String("kiki"),new String("aeo"), new String("eden")};
		String[] comp = {"eden", "kiki"};
		
		Solution sol = new Solution();
		String answer = sol.solution(part, comp);
		System.out.println(answer);
	}
    
}