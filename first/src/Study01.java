import java.util.List;

public class Study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Study01 ex = new Study01();
		ex.TowersOfHanoi(3, 'A', 'Z', 'Q');

	}

	void TowersOfHanoi(int n, char frompeg, char topeg, char auxpeg) {
		if(n==1) {
			System.out.println("Move disk 1 from peg - + frompeg + - to peg "+topeg);
			return;
		}
		
		TowersOfHanoi(n-1, frompeg, topeg, auxpeg);
		System.out.println("Move disk from peg "+ frompeg + "  to peg "+topeg);
		
		TowersOfHanoi(n-1, auxpeg, topeg, frompeg);
	}
	
	List InsertInLinkedList(List headNode, List nodeToInsert, int position) {
		if(headNode == null) {
			return nodeToInsert;
		}
		else {
			int size = headNode.size();
			if(position > size + 1|| position <1) {
				System.out.println("position of node to insert is invaild");
				System.out.println("the valid inputs are 1 to "+ (size+1));
				return headNode;
			}
			if(position == 1) {
				nodeToInsert.add(headNode);
				return nodeToInsert;
			}
			else {
				List previousNode = headNode;
				int count = 1;
				while(count < position-1) {
					//previousNode = previousNode.
				}
			}
			return headNode;
		}
	}
	
}
