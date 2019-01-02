package hangulComputer;

import java.util.*;
import javax.script.*;

public class sol01 {

	public static void main(String[] args) throws ScriptException {
        String input = "이백원 + {(오천원 - 만원) + 이천원}";
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<Integer> idxs = new ArrayList<Integer>();
    	char[] operationCode = {'+', '-', '{', '}', '(', ')'}; //연산 부호
    	
    	//후위표기법으로 변환 후
    	ArrayList<String> postfixList = new ArrayList<String>(); 
    	//후위표기법으로 변경하는 stack
    	Stack<Character> opStack = new Stack<Character>(); 
    	//후위 표기법을 계산하는 Stack
    	Stack<String> calculatorStack = new Stack<String>(); 
    	
    	// 한글->숫자로변환
    	String MONEY = "영일이삼사오육칠팔구십백천만억조";
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
		
		  	if(ch.equals("원")) {
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
    	        if (arr.get(i).equals(String.valueOf(operationCode[j]))) { //문자열과 연산 부호 비교

    	            if (arr.get(i).equals("(")) {
        	        	//postfixList에 연산 부호가 나오기 전까지의 숫자를 담는다(공백제거)
        	            postfixList.add(arr.get(i).replace("(", "").replace(")", ""));

    	            	if (arr.get(i).equals(")")) {//우 괄호가 나오면 좌 괄호가 나오거나 스택에 비어있을때 까지 pop하여 list에 저장
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

    	            	if (arr.get(i).equals("}")) {//우 괄호가 나오면 좌 괄호가 나오거나 스택에 비어있을때 까지 pop하여 list에 저장
    	                    while (true) {
    	                        postfixList.add(opStack.pop().toString());
    	                        if (opStack.pop() == '{' || opStack.isEmpty()) {
    	                            break;
    	                        }
    	                    }
    	                }
    	            }
    	            
    	            if (opStack.isEmpty()) { //opStack이 비어 있을 경우
    	                opStack.push(operationCode[j]); //연산 부호 저장
    	            } else { //opStack이 비어 있지 않을 경우
    	                if (opOrder(operationCode[j]) > opOrder(opStack.peek())) { //우선 순위 비교
    	                    opStack.push(operationCode[j]); //스택에 top 값 보다 높은 우선순위이면 그대로 저장
    	                } else if (opOrder(operationCode[j]) <= opOrder(opStack.peek())) {//우선 순위 비교
    	                    postfixList.add(opStack.peek().toString());//스택에 있는 값이 우선순위가 같거나 작을 경우 list에 저장
    	                    opStack.pop();//스택 제거
    	                    opStack.push(operationCode[j]);//높은 우선순위 연산 부호 스택에 저장
    	                }
    	            }

    	            index = i + 1;// 다음 순서 처리
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
        

        // 연산처리
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        

//        System.out.println(engine.eval(eq));
    }
    public static long hangulToNum(String input) {
        long result = 0;
        long tmpResult = 0;
        long num = 0;
        final String NUMBER = "영일이삼사오육칠팔구";
        final String UNIT = "십백천만억조";
        final long[] UNIT_NUM = { 10, 100, 1000, 10000, (long)Math.pow(10,8), (long)Math.pow(10,12) };
        StringTokenizer st = new StringTokenizer(input, UNIT, true);
        
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            //숫자인지, 단위(UNIT)인지 확인
            int check = NUMBER.indexOf(token);
            if(check == -1) { //단위인 경우

                if("만억조".indexOf(token) == -1) {
                	System.out.println(UNIT_NUM[UNIT.indexOf(token)]);
                    tmpResult += (num != 0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];
                } else {
                    tmpResult += num;
                    result += (tmpResult != 0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
                    tmpResult = 0;
                }
                num = 0;
            } else { //숫자인 경우
                num = check;
            }            
        }

 
        return result + tmpResult + num;
    }
	/**
	* 연산 부호 우선순위 정하는 메서드
	* @param op - 연산 부호
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
