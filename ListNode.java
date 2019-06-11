
public class ListNode {
	
	public int data; //data stored in the node
	public ListNode next; //link to the next node in the list
	
	//constructs a node with a data value and a null link
	public ListNode() {
		this(0, null);
	}

	public ListNode(int data) {
		this(data, null);
	}
	
	//construct a node with a given data value and a given link
	public ListNode (int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
	
	
}
