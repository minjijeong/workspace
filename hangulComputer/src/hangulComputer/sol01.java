package hangulComputer;

import java.util.*;
import javax.script.*;

public class sol01 {

	public static void main(String[] args) throws ScriptException {
        String input = "�̹�� + {(��õ�� - ����) + ��õ��}";
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<Integer> idxs = new ArrayList<Integer>();
    	char[] operationCode = {'+', '-', '{', '}', '(', ')'}; //���� ��ȣ
    	
    	//����ǥ������� ��ȯ ��
    	ArrayList<String> postfixList = new ArrayList<String>(); 
    	//����ǥ������� �����ϴ� stack
    	Stack<Character> opStack = new Stack<Character>(); 
    	//���� ǥ����� ����ϴ� Stack
    	Stack<String> calculatorStack = new Stack<String>(); 
    	
    	// �ѱ�->���ڷκ�ȯ
    	String MONEY = "�����̻�����ĥ�ȱ��ʹ�õ������";
        String opers = "-+{}()";
        int from = 0, to=0;

        boolean startYn = false;

  		for(int i=0;i<input.length();i++) {
		  	String ch = String.valueOf(input.charAt(i));
		  	if(ch.equals("(")) {
		  		ch = "{";
			}
			else if(ch.equals(")")){
				ch = "}";
			}
		
		  	if(ch.equals("��")) {
		  		String tmp = input.substring(from,to+1); 
//		  		System.out.println(tmp);
		  		arr.add(String.valueOf(hangulToNum(tmp)));
		  		startYn = false;
		  	}
		  	else if(MONEY.indexOf(ch) >= 0) {
		  		if(startYn == false) {
		  			from = i;
		  			startYn = true;
		  		}
		  		to = i;
		  	}
		  	else if(opers.indexOf(ch) >= 0) {
		  		arr.add(ch);
		  	}	
		}

        String eq = "";
        for(int i=0;i <arr.size();i++) {
        	eq += arr.get(i);
        }
        System.out.println(eq);
        
    	int index = 0;
        for (int i = 0; i < arr.size(); i++) {
    	    for (int j = 0; j < operationCode.length; j++) {
    	        if (arr.get(i).equals(String.valueOf(operationCode[j]))) { //���ڿ��� ���� ��ȣ ��

    	            if (arr.get(i).equals("(")) {
        	        	//postfixList�� ���� ��ȣ�� ������ �������� ���ڸ� ��´�(��������)
        	            postfixList.add(arr.get(i).replace("(", "").replace(")", ""));

    	            	if (arr.get(i).equals(")")) {//�� ��ȣ�� ������ �� ��ȣ�� �����ų� ���ÿ� ��������� ���� pop�Ͽ� list�� ����
    	                    while (true) {
    	                        postfixList.add(opStack.pop().toString());
    	                        if (opStack.pop() == '(' || opStack.isEmpty()) {
    	                            break;
    	                        }
    	                    }
    	                }
    	            }
    	            else if (arr.get(i).equals("{")) {
        	            postfixList.add(arr.get(i).replace("{", "").replace("}", ""));

    	            	if (arr.get(i).equals("}")) {//�� ��ȣ�� ������ �� ��ȣ�� �����ų� ���ÿ� ��������� ���� pop�Ͽ� list�� ����
    	                    while (true) {
    	                        postfixList.add(opStack.pop().toString());
    	                        if (opStack.pop() == '{' || opStack.isEmpty()) {
    	                            break;
    	                        }
    	                    }
    	                }
    	            }
    	            
    	            if (opStack.isEmpty()) { //opStack�� ��� ���� ���
    	                opStack.push(operationCode[j]); //���� ��ȣ ����
    	            } else { //opStack�� ��� ���� ���� ���
    	                if (opOrder(operationCode[j]) > opOrder(opStack.peek())) { //�켱 ���� ��
    	                    opStack.push(operationCode[j]); //���ÿ� top �� ���� ���� �켱�����̸� �״�� ����
    	                } else if (opOrder(operationCode[j]) <= opOrder(opStack.peek())) {//�켱 ���� ��
    	                    postfixList.add(opStack.peek().toString());//���ÿ� �ִ� ���� �켱������ ���ų� ���� ��� list�� ����
    	                    opStack.pop();//���� ����
    	                    opStack.push(operationCode[j]);//���� �켱���� ���� ��ȣ ���ÿ� ����
    	                }
    	            }

    	            index = i + 1;// ���� ���� ó��
    	        }
            	System.out.println(i+">>>>>"+j);
    	        System.out.println(postfixList);
    	        System.out.println(opStack);
    	        System.out.println("===================================");
    	    }
    	}


//        System.out.println(input);

//        System.out.println(arr);
        if(idxs.size()>0) {
        	for(int i=1;i <idxs.size();i++) {
        		String before = input.substring(idxs.get(i-1),idxs.get(i-1)+1);
        		String cur = input.substring(idxs.get(i),idxs.get(i)+1);
        		if(before.equals(cur)) {
        			
        		}
        		else {
        			
        		}
        	}
        }
        

        // ����ó��
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        

//        System.out.println(engine.eval(eq));
    }
    public static long hangulToNum(String input) {
        long result = 0;
        long tmpResult = 0;
        long num = 0;
        final String NUMBER = "�����̻�����ĥ�ȱ�";
        final String UNIT = "�ʹ�õ������";
        final long[] UNIT_NUM = { 10, 100, 1000, 10000, (long)Math.pow(10,8), (long)Math.pow(10,12) };
        StringTokenizer st = new StringTokenizer(input, UNIT, true);
        
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            //��������, ����(UNIT)���� Ȯ��
            int check = NUMBER.indexOf(token);
            if(check == -1) { //������ ���

                if("������".indexOf(token) == -1) {
                	System.out.println(UNIT_NUM[UNIT.indexOf(token)]);
                    tmpResult += (num != 0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];
                } else {
                    tmpResult += num;
                    result += (tmpResult != 0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
                    tmpResult = 0;
                }
                num = 0;
            } else { //������ ���
                num = check;
            }            
        }

 
        return result + tmpResult + num;
    }
	/**
	* ���� ��ȣ �켱���� ���ϴ� �޼���
	* @param op - ���� ��ȣ
	*/

	public static int opOrder(char op) {
		switch (op) {
		    case '+':	
		    case '-':
		        return 2;
	
		    case '{':
		    case '}':
		        return 1;
		    default:
		        return -1;
	
		}

	}    
}
