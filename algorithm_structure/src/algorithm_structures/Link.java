package algorithm_structures;

public class Link {
	
	public int data1; 
	public double data2;
	public Link nextLink;
	
	//link 생성자
	public Link(int d1, double d2) {
		data1 = d1; 
		data2 = d2;
	}
	
	//link 데이터 출력
	public void printLink() {
		System.out.println("{"+data1+", "+data2+"} ");
	}
}

