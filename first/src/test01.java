import java.util.*;

public class test01 {
    public String[] solution(String[] record) {
        String[] answer = {};
        Map<Integer,String> ordChat = new HashMap();
        Map<String,String> uList = new HashMap();
        ArrayList<String> result = new ArrayList<>();
        
        int dataCnt = 0;
        for(int i=0;i<record.length;i++) {
        	//System.out.println(record[i]);
        	String[] tmpStr = record[i].split(" ");
        	if(tmpStr[0].equals("Change")) {
        		uList.replace(tmpStr[1], tmpStr[2]);
        	}
        	else {
        		if(!tmpStr[0].equals("Leave")) {
        			uList.put(tmpStr[1], tmpStr[2]);        			
        		}
            	ordChat.put(dataCnt, tmpStr[0]+"^"+tmpStr[1]);
            	dataCnt++;
        	}
        }
        
        for(int j=0; j<ordChat.size();j++) {
        	System.out.println(ordChat.get(j));
        	String tmp1 = ordChat.get(j).substring(0,5);
        	String tmp2 = ordChat.get(j).substring(6);

        	String addWd = "";
        	if(!tmp1.equals("")&& tmp1 != null) {
        		System.out.println(tmp1+"-"+tmp2);
        		if(tmp1.equals("Enter"))
        		{
        			addWd ="���� ���Խ��ϴ�.";
        		}
        		else if(tmp1.equals("Leave")) {
        			addWd ="���� �������ϴ�.";        			
        		}
        		result.add(uList.get(tmp2)+addWd);
        	}
        }
        answer = result.toArray(new String[result.size()]);

        return answer;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� n, �̸� ���� ������ ���� t, ���ӿ� �����ϴ� �ο� m, Ʃ���� ���� p �� �־�����.
    	String[] input = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
    	test01 ex = new test01();
    	String[] result = ex.solution(input);
    	System.out.println(Arrays.toString(result));
    	System.out.println(result[0]);
	}
}