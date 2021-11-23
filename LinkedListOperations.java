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
	
	
	public void insertBetween(int data, int nextData) {
		Node currentNode = head;
		
		// checking if coming node is equal to the node before which we are supposed to add new node.
		while(currentNode.next.data != nextData) {
			currentNode = currentNode.next;
		}
		
		Node node = new Node();
		node.setData(data);
		node.setNext(currentNode.next);
		currentNode.next = node;
	}
	
	
	public void insertAfter(int data, int key) {
		Node currentNode = head;
		
		while(currentNode.data != key) {
			currentNode = currentNode.next;
		}
		
		Node node = new Node();
		node.setData(data);
		node.setNext(currentNode.next);
		currentNode.next = node;
		
	}
	
	
	public Node findNode(int key) {
		Node currentNode = head;
		
		while(currentNode.data != key) {
			currentNode = currentNode.next;
		}
		
		return currentNode;
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
	
	
	public void deleteNode(int data) {
		Node currentNode = head;
		Node previousNode = null;
		
		while(currentNode.data != data) {
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		
		previousNode.setNext(currentNode.next);
	}
	
	
	public int size() {
		Node currentNode = head;
		int size = 0;
		
		while(currentNode != null) {
			size++;
			currentNode = currentNode.next;
		}
		
		return size;
	}
	
	
	public void displayNodesData() {
		Node currentNode = head;
		
		while(currentNode != null) {
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
		
	}

}
