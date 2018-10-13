import java.security.DomainCombiner;
import java.util.*;

public class test03 {
	public Map<Integer,Object> cList = new HashMap();
	
    public int solution(String[][] relation) {
        int answer = 0;
        int colSize = 1;// relation[0].length;
        //System.out.println("row:"+relation.length);
        test03 ex = new test03();
        int[] arr = new int[colSize];
        int r = 1;
        int[] combArr = new int[colSize];
        for(int i=0;i<colSize;i++) {
			arr[i] = i+1;
		};
        
        ex.doCombination(combArr, colSize, r, 0, 0, arr);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� n, �̸� ���� ������ ���� t, ���ӿ� �����ϴ� �ο� m, Ʃ���� ���� p �� �־�����.
		test03 ex = new test03();
		String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		int result = ex.solution(relation);

	}
	
	public void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr){
        System.out.println("=> "+n+" "+r+" "+index+" "+target);
         
        // r ==0 �̶� ���� ���� ���Ҹ� �� �̾Ҵٴ� ��.
        if(r == 0){
            System.out.println(Arrays.toString(combArr));
            for(int i=0; i<index; i++)System.out.print(arr[combArr[i]] + " ");
           
            System.out.println();
         
        //������ �� �˻��� ���..1���� ���� ���¿��� ������ ����� ������ return ���� ����
        }else if(target == n){ 
             
            return;
         
        }else{
            combArr[index] = target;
            // (i) �̴� ��� 
            // �����ϱ�, r-1
            // �̾����� ���� index + 1 ����� ��
            doCombination(combArr, n, r-1, index+1, target+1, arr);
             
            //(ii) �� �̴°��
            // �Ȼ����ϱ� �״�� r
            // �Ȼ̾�����, index�� �״��!
            doCombination(combArr, n, r, index, target+1, arr); 
        }
    }
}
