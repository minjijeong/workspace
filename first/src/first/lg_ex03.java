package first;
import java.util.*;

public class lg_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] node ={ {1, 2}, {1, 3}, {2, 4}, {2, 5} };		
		int[][] way = { {1, 5}, {2, 5}, {3, 5}, {4, 5} };
		int N = 5;
		lg_ex03 ex = new lg_ex03();
		ex.solution(N, node, way);
	}

	public int[] solution(int N, int[][] directory, int[][] query) {
        int[] answer = {};
        lg_ex03 sol = new lg_ex03();
        Arrays.sort(directory,new Comparator<int[]>() {

			@Override
			public int compare(int[] arg0, int[] arg1) {
				// TODO Auto-generated method stub
				final int hp1 = arg0[1];
				final int hp2 = arg1[1];
				return Integer.compare(hp1, hp2);
			}
        	
        });
        Map map = new HashMap();
        for(int i=0;i<directory.length;i++) {
            // �ʱ� ������ 2�� �����Ѵ�. [1,2] 1�� ���� 2, 2�� ���� 1�̵ȴ�. 
        	// ���� �׸��� [2,3] �ϰ�� ������ ���� 2�� ��� �׸��� ���� 3�� �ø��� 2�� ������ ����1�� ����2�� �����Ѵ�. 3�� ���� 1�� �ȴ�. 
        	int lv = 2;
            ArrayList back = new ArrayList<>();
            ArrayList front = new ArrayList<>();
            
            if(map.get(2) == null) {
            	// ù��° �׸��� ������ ���� �ִ� row ã��
            	// �����ϸ� ��ü level �ø���
            	if(sol.excut(directory,directory[i][0],1)) {
            		System.out.println("������");
            	}
            	else {
                	front.add(directory[i][0]);
                	back.add(directory[i][1]);
                	map.put(2, front);
                	map.put(1, back);	
            	}
            }
            else {

            }
            
            System.out.println(map);
        	
            for(int j=0;j<directory.length;j++) {
            	
            }
            
        	
        	
        	
            //getKeyFromValue
        } 
        return answer;
    }
	public Boolean excut(int[][] directory, int value, int type) { 
		
		for(int k=0; k < directory.length; k++) { 
			// �˻�
			if(type == 1) {
				if(directory[k][0] != value) {
					if(directory[k][1] == value) {
						return true;
					}
				}
			}
			// level ���׷��̵� 
			if(type == 2) {
				
			}
		} 
		return false; 
	}

}
