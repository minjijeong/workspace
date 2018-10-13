package first;

import java.util.*;

import javax.print.attribute.standard.NumberUpSupported;

public class lg_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] ppl = {300,200,500};//{200,120,150};
		int[] ppl = {200,120,150};
		//int[][] items = {{1000, 600}, {400, 500}, {300, 100}};//{{30,100},{500,30},{100,400}};
		int[][] items = {{30,100},{500,30},{100,400}};
		
		lg_ex02 ex = new lg_ex02();
		System.out.println(Arrays.toString(ex.solution(ppl, items)));		

	}
    public int[] solution(int[] healths, int[][] items) {
        int[] answer = {};
        Map mem = new HashMap();
        Map uitem = new HashMap();
        int uCnt = 0;
        
        //자료정렬
        Arrays.sort(healths);
        /*
        Arrays.sort(items,new Comparator<int[]>() {

			@Override
			public int compare(int[] arg0, int[] arg1) {
				// TODO Auto-generated method stub
				final int hp1 = arg0[1];
				final int hp2 = arg1[1];
				return Integer.compare(hp2, hp1);
			}
        	
        });
        */
        for(int i=0;i<healths.length;i++) {
        	mem.put(i,healths[i]);
        }  
        for(int l=0;l<items.length;l++) {
        	System.out.println(items[l][0] +"-"+items[l][1]);
        } 
        
        for(int m=0;m < items.length; m++) {
        	System.out.println(items[m][0] +"//"+items[m][1]);
        	for(int i=0;i < healths.length;i++) {
        		System.out.println(mem.get(i));
        		if(mem.get(i) != null) {
        			System.out.println(" hp :"+mem.get(i)+"\n cal:"+((int)mem.get(i)-items[m][1]));
        			if((int)mem.get(i)-items[m][1] >= 100) {            			
        				System.out.println(" m :"+m+"\n uCnt:"+uCnt);
	        			uitem.put(uCnt,m);
	        			uCnt++;
	        			mem.remove(i);
	        			break;
	        		}
        		}
        	}
        }
    	//System.out.println(Arrays.toString(mem));
        // System.out.println(Arrays.toString(healths));
        System.out.println(mem);
        System.out.println(uitem);
        
        Object[] values = uitem.values().toArray(new Integer [uitem.size()]);
        answer = new int[values.length];
        int ord = 0;
        for(int k=0;k <values.length; k++) {
        	answer[ord] = (int) values[k]+1;
            ord++;
        }
        return answer;
    }
}
