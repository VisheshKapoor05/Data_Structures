package LinkedLists;

public class LinkedListOperations {
	
	Node head;
	
	public void insertFirst(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(head);
		head = node;
	}
	
	public void insertLast(int data) {
		Node currentNode = head;
		
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		Node node = new Node();
		node.setData(data);
		currentNode.next = node;
	}
	
	public void displayNodesData() {
		Node currentNode = head;
		
		while(currentNode != null) {
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
		
	}

}
