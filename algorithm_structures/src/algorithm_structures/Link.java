package algorithm_structures;

public class Link {
	
	public int data1; 
	public double data2;
	public Link nextLink;
	
	//link ������
	public Link(int d1, double d2) {
		data1 = d1; 
		data2 = d2;
	}
	
	//link ������ ���
	public void printLink() {
		System.out.println("{"+data1+", "+data2+"} ");
	}
}

