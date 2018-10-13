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
		//진법 n, 미리 구할 숫자의 갯수 t, 게임에 참가하는 인원 m, 튜브의 순서 p 가 주어진다.
		test03 ex = new test03();
		String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		int result = ex.solution(relation);

	}
	
	public void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr){
        System.out.println("=> "+n+" "+r+" "+index+" "+target);
         
        // r ==0 이란 것은 뽑을 원소를 다 뽑았다는 뜻.
        if(r == 0){
            System.out.println(Arrays.toString(combArr));
            for(int i=0; i<index; i++)System.out.print(arr[combArr[i]] + " ");
           
            System.out.println();
         
        //끝까지 다 검사한 경우..1개를 뽑은 상태여도 실패한 경우임 무조건 return 으로 종료
        }else if(target == n){ 
             
            return;
         
        }else{
            combArr[index] = target;
            // (i) 뽑는 경우 
            // 뽑으니까, r-1
            // 뽑았으니 다음 index + 1 해줘야 함
            doCombination(combArr, n, r-1, index+1, target+1, arr);
             
            //(ii) 안 뽑는경우
            // 안뽑으니까 그대로 r
            // 안뽑았으니, index는 그대로!
            doCombination(combArr, n, r, index, target+1, arr); 
        }
    }
}
