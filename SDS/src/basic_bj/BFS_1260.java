package basic_bj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_1260 {
	static ArrayList<Integer>[] a; 
	static boolean[] c; 
	
	public static void dfs(int x) {
		if(c[x]) {
			return; 
		}
		c[x] = true; 
		System.out.println();
		for( int y: a[x]) {
			if(c[y]==false) {
				dfs(y);
			}
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		c[start] = true;
		
		while(!q.isEmpty()) {
			int x = q.remove();
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
