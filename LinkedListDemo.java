package LinkedLists;

public class LinkedListDemo{
	public static void main(String[] args) {
		
		LinkedListOperations linkedList = new LinkedListOperations();
		
		linkedList.insertFirst(70);
		linkedList.insertFirst(30);
		linkedList.insertFirst(56);
		//linkedList.pop();
		//linkedList.popLast();
		Node key = linkedList.findNode(30);
		System.out.println("key: " +key.data);
		
		System.out.println("");
		linkedList.displayNodesData();
		
	}
}
