package convert_N_Game;

public class Solution04 {
	  public String solution(int n, int t, int m, int p) {
	      String answer = "";
	      int count  = 0;
	      int tube = p; //계속 m을 더해줘야함.
	      int no=0;
	      int index=0;
	      char[] result = new char[1001];
	      result[index] = ' ';

	      while(count<t) {
	          if(result[index] == ' ') {
	              String num = function(n, no);
	              int i=0;
	              for(i=0; i<num.length(); i++) {
	                  result[i] = num.charAt(i);
	              }
	              result[i]= ' ';
	              index=0;
	              no++;
	          }
	          if(tube==1) {
	              answer += result[index];
	              count++;
	              tube = m+1;
	          }
	          tube--;
	          index++;
	      }

	      return answer;
	  }

	  public String function(int std, int no) {
	      if(no==0) return "0";
	      if(no<std) return ((no<10)?Integer.toString(no):Character.toString((char)(no+55)));

	      int temp = no%std;
	      String result = ((temp<10)?Integer.toString(temp):Character.toString((char)(temp+55)));
	      result = function(std, no/std) + result;
	      return result;
	  }
	}