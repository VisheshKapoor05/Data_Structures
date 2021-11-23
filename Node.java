package LinkedLists;

public class Node {
	
	int data;
	Node next = null;
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public void displayNode() {
		System.out.println(data);
	}
}
