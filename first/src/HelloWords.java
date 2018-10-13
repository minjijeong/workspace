import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HelloWords {
	public int[] fill100() {
        int[] array = new int[100];
        // array에 순서대로 1부터 100까지 정수를 넣어보세요.
        for(int i=0; i < array.length; i++){
            array[i] = i+1;
        }
        // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
        return array;
    }
	/**
	 * 
	 * @param args
	 */
	/**/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWords exam = new HelloWords();
        int[] arr2 = exam.fill100();
        int correctCnt = 0;
        for (int i = 0; i < 100; i++) {
            if (arr2[i] != i + 1) {
                System.out.println("array[" + i + "]의 값이 틀립니다.");
                break;
            }
            else {
            	correctCnt = correctCnt +1;
            }
        }
		System.out.println(correctCnt);
	    System.out.println("2의 10승 = " + Math.pow(2, 10));
	    System.out.println("16의 1/2승 = : " + Math.pow(16, 0.5));
	    System.out.println("log200 = " + Math.log10(200));

	    Set<String> set = new HashSet<String>();
	    set.add("a");
	    set.add("a");
	    set.add("b");

	    System.out.println("set의 내용을 출력합니다.");
	    for(String str : set){
	      System.out.println(str);
	    }
	    Iterator<String> iter = set.iterator();
	    while(iter.hasNext()) {
	    	String str = iter.next();
	    	System.out.println(str);
	    }
	}

}
