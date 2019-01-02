package algorithm_structures;

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return first == null; 
	}
	
	public void insert(int d1, double d2) {
		Link link = new Link(d1, d2);
		link.nextLink = first;
		first = link;
	}
	
	public Link delete() {
		Link temp = first;
		first = first.nextLink;
		return temp;
	}
	
	public void printList() {
		Link currentLink = first;
		System.out.println("List :");
		while(currentLink != null) {
			currentLink.printLink();
			System.out.println("==========>"+currentLink.nextLink+">>"+currentLink.data1+"//"+currentLink.data2);
			currentLink = currentLink.nextLink;
		}
		System.out.println("");
	}
}
