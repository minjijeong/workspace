//import java.io.Console;
//import java.lang.reflect.Array;
import java.util.*;

public class test02 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer,Double> ordMap= new HashMap();
        List<Integer> sorted = new ArrayList<Integer>();
        //Arrays.sort(stages);//(stages);
        //System.out.println(Arrays.toString(stages));
        for(int i = 1;i <= N ;i++) {
        	//System.out.println(i);
        	int index = 0;
        	int fightNum = 0; 
        	int curNum = 0;
        	double rate = 0;
        	while(true) {
        		//System.out.println(stages[index]+"////"+N);
        		if(stages[index] >= i) {
        			curNum++;
        			if(stages[index] == i) {
        				fightNum++;
        			}
        		}
        		index++;        		
        		if(index == stages.length) break;
        	}
        	//System.out.println("fightNum:"+fightNum);
        	//System.out.println("curNum:"+curNum);
        	if(curNum > 0) {
        		rate = fightNum/(double)curNum;//Double.parseDouble(String.format("%.3f",(fightNum/(double)curNum)));
        	//System.out.println("rate:"+String.valueOf(rate));
        	}
        	else
        	{
        		rate = 0;
        	} 
        	ordMap.put(i, rate);
       }
       sorted = test02.sortByValue(ordMap);
       answer = sorted.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int[] input = {2, 1, 2, 6, 2, 4, 3, 3};
    	int i = 5;
    	test02 ex = new test02();
    	int[] result = ex.solution(i,input);
    	System.out.println(Arrays.toString(result));
	}
    public static List sortByValue(final Map map){
        List<Integer> list = new ArrayList();
        list.addAll(map.keySet());
         
        Collections.sort(list,new Comparator(){
             
            public int compare(Object o1,Object o2){
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
//                System.out.println(v1+"//"+o1);
//                System.out.println(v2+"//"+o2);
//                System.out.println(((Comparable) v1).compareTo(v2));
                if(((Comparable) v1).compareTo(v2)==0) return -1;
                else return ((Comparable) v1).compareTo(v2);              
            }
             
        });
        Collections.reverse(list); // 주석시 오름차순
        return list;
    }
}
