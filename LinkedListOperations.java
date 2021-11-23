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
	
	
	public void insertBetween(int data, int afterData) {
		Node currentNode = head;
		
		// checking if coming node is equal to the node before which we are supposed to add new node.
		while(currentNode.next.data != afterData) {
			currentNode = currentNode.next;
		}
		
		Node node = new Node();
		node.setData(data);
		node.setNext(currentNode.next);
		currentNode.next = node;
	}
	
	
	public void pop() {
		 head = head.next;
	}
	
	
	public void popLast() {
		Node currentNode = head;
		
		while(currentNode.next.next != null) {
			currentNode = currentNode.next;
		}
		
		currentNode.next = null;
		
	}
	
	
	public void displayNodesData() {
		Node currentNode = head;
		
		while(currentNode != null) {
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
		
	}

}
