package first;

import java.awt.image.DataBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String[] logs = {
	     "2016-09-15 20:59:57.421 0.351s",
	     "2016-09-15 20:59:58.233 1.181s",
	     "2016-09-15 20:59:58.299 0.8s",
	     "2016-09-15 20:59:58.688 1.041s",
	     "2016-09-15 20:59:59.591 1.412s",
	     "2016-09-15 21:00:00.464 1.466s",
	     "2016-09-15 21:00:00.741 1.581s",
	     "2016-09-15 21:00:00.748 2.31s",
	     "2016-09-15 21:00:00.966 0.381s",
	     "2016-09-15 21:00:02.066 2.62s"
	      };
	      Solution2 sol = new Solution2();
	      sol.solution(logs);
	}
	
	public int solution(String[] lines) {
		 int answer = 0;
		 Map<String,Integer> max = new HashMap();
		 int maxSec = 0;
		 for(int i=0;i<lines.length;i++) {
			 //Date date = new Date("yyyy-mm-dd hh:mm:ss.sss");
			 SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss.sss");
			 try {
				System.out.println(date.parse(lines[i].split(" ")[0]+" "+lines[i].split(" ")[1]));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Calendar cal = new Calendar();
			 //cal.add(Calendar.SECOND, );
			 System.out.println(lines[i].split(" ").length);
			 System.out.println(lines[i].split(" ")[2]);
			 System.out.println(lines[i].split(" ")[1].split(":")[2]);
			 if(maxSec < Integer.parseInt(lines[i].split(" ")[2].replace("s", ""))) {
				 maxSec = Integer.parseInt(lines[i].split(" ")[2].replace("s", ""));
			 }
		 }
		 
		 return answer;
	}

}
