import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

import javax.print.attribute.SetOfIntegerSyntax;
import javax.print.attribute.standard.PrinterName;

public class ListExam{
  public List<String> addArray(String[]arr1, String[]arr2){
    List<String> list = new ArrayList<String>();

    for(String str : arr1){
      System.out.println(str);
      list.add(str);
    }

    for(String str : arr2){
      System.out.println(str);
      list.add(str);  
    }
    
    return list;
  }

  public static void main(String[] args){
	  ListExam list = new ListExam(); 
	  String[]arr1 = {"candy","smell","sweet"};
	  String[]arr2 = {"candy2","smell2","sweet2"};
	  List<String> strList = list.addArray(arr1,arr2);
	  System.out.println(strList);
	  
	  Map<String, Integer> products = new HashMap<>();
	    //��ǰ�� �̸��� ���� products�� �߰��� ������.
	    products.put("����", 2500);
	    products.put("ũ���Ľ�", 5000);
	    
	    Date date = new Date();

	    SimpleDateFormat ft =  new SimpleDateFormat ("yyyy.MM.dd 'at' hh:mm:ss a zzz");     
	    System.out.println(ft.format(date));  
	    
	    Calendar cal = Calendar.getInstance();
	    System.out.println(cal.getTimeInMillis());
	    System.out.println(ft.format(cal.getTimeInMillis()));  
	    System.out.println(cal.get(Calendar.YEAR));
	    System.out.println(cal.get(Calendar.MONTH));
	    System.out.println(cal.get(Calendar.HOUR));
	    System.out.println(cal.get(Calendar.HOUR_OF_DAY));
	    System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	    System.out.println(cal.get(Calendar.FEBRUARY));

	    cal.add(Calendar.DATE,100);
	    System.out.println(cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"��"+cal.get(Calendar.DATE)+"��");
	    
	    System.out.println("<==========================================================>");
	    
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint.getHour() );
        System.out.println(timePoint.getYear() );
        System.out.println(timePoint.getMonth());
        System.out.println(timePoint.getDayOfMonth());
        System.out.println(timePoint.getMonthValue());
        
        LocalDate lDate = LocalDate.now();
        System.out.println(lDate.getYear());
        System.out.println(lDate.getMonth());
        System.out.println(lDate.getDayOfMonth());
        System.out.println(lDate.getDayOfYear() );
        System.out.println(lDate.getDayOfWeek());
        
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        
        try
        (
        	//try�� �ڿ������� ��ȣ()���̿��� ���� stream�� ������ close���� �ʾƵ� �˴ϴ�.
        	//DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
        	DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
        		){
        	//�� �Ʒ��� out�� �̿��ؼ� data.txt�� int�� 100, double�� 3.14�� �����ϼ���.
        	out.writeDouble(3.124);
        	out.writeInt(33333);

		}
		catch(Exception e){      
		}
        try(
        		DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
        ){
        	int readCount = -1; 
        	while((readCount = in.readInt())!= -1) {
        		
        	}
        }catch (Exception e) {
			// TODO: handle exception
		}
        
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        
        try {
			String line = rd.readLine();
			System.out.println(line+"\n");
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        BufferedReader br =null;
		PrintWriter pw = null;
        try {
			br = new BufferedReader(new FileReader("./src/ListExam.java"));
			pw = new PrintWriter(new FileWriter("test.txt"));
			String line = null; 
			while((line=br.readLine()) != null) {
				pw.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        
        
  }
}
