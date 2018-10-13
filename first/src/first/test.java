package first;

import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap();
		Integer a= map.put("kay", 3);
		System.out.println(a+"\n");
		System.out.println("\n////////-"+map.containsKey("bol")+"\n");
		System.out.println("\n////////-"+map.get("kay")+"\n");
		a = map.put("key", 5);
		System.out.println(a+"\n");
		System.out.println("\n////////-"+map.get("kay")+"\n");
		System.out.println("\n////////-"+map.get("kay")+"\n");		

	}

}
