package basic_bj;

import java.io.*;

public class bj_1152 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		String arr[];

		String str = br.readLine().trim();
		// str이 null인 경우 예외처리 해야함!!!
		if (str.isEmpty()) {
            System.out.println(0);
        } else {
        	arr = str.split(" ");
    		bw.write(String.valueOf(arr.length));
        }
		
		bw.flush();
		bw.close();
	}

}
