import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HelloWords {
	public int[] fill100() {
        int[] array = new int[100];
        // array�� ������� 1���� 100���� ������ �־����.
        for(int i=0; i < array.length; i++){
            array[i] = i+1;
        }
        // �Ʒ��� ��� �򰡸� ���� �ڵ��Դϴ�. �������� ������.
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
                System.out.println("array[" + i + "]�� ���� Ʋ���ϴ�.");
                break;
            }
            else {
            	correctCnt = correctCnt +1;
            }
        }
		System.out.println(correctCnt);
	    System.out.println("2�� 10�� = " + Math.pow(2, 10));
	    System.out.println("16�� 1/2�� = : " + Math.pow(16, 0.5));
	    System.out.println("log200 = " + Math.log10(200));

	    Set<String> set = new HashSet<String>();
	    set.add("a");
	    set.add("a");
	    set.add("b");

	    System.out.println("set�� ������ ����մϴ�.");
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
