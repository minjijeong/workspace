package first;

import java.util.*;

public class lg_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ppl = {2,3};
		int[] tr = {1,2,3};
		
		lg_ex01 ex = new lg_ex01();
		ex.solution(ppl, tr);
	}
    public int solution(int[] people, int[] tshirts) {
        int answer = 0;
        Map getTshirt = new HashMap();
        Map tmap = new HashMap();
        // tshirts stock list 
        for(int i=0;i<tshirts.length;i++) {
        	if(tmap.size() > 0) {
	        	if(tmap.get(tshirts[i]) == null) {
	        		tmap.put(tshirts[i], 1);
	        	}
	        	else {
	        		int tmpQty = (int) tmap.get(tshirts[i]);
	        		tmap.replace(tshirts[i], tmpQty+1);
	        	}
        	}
        	else {
        		tmap.put(tshirts[i], 1);
        	}	
        }
        
        System.out.println(tmap);

        for(int j=0;j < people.length; j++) {
        	if(tmap.get(people[j]) != null) {
        		int stock = (int) tmap.get(people[j]);
        		if(stock > 1) {
        			getTshirt.put(answer, people[j]);
        			answer++;
        			tmap.replace(people[j], stock-1);
        		}
        		else if(stock == 1) {
        			getTshirt.put(answer, people[j]);
        			answer++;        			
        			tmap.remove(people[j]);
        		}
        		else {
        			tmap.remove(people[j]);
        		}
        	}
        }        
//        System.out.println(tmap);
//        System.out.println(getTshirt);
//        System.out.println(answer);
        
        return answer;
    }
}