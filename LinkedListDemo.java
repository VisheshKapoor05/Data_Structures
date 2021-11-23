package LinkedLists;

public class LinkedListDemo{
	public static void main(String[] args) {
		
		LinkedListOperations linkedList = new LinkedListOperations();
		
		linkedList.insertFirst(70);
		linkedList.insertFirst(30);
		linkedList.insertFirst(56);
		linkedList.insertAfter(40, 30);
		linkedList.displayNodesData();
		
		System.out.println(" ");
		System.out.println("Deleting 40:");
		linkedList.deleteNode(40);
		linkedList.displayNodesData();
		
		System.out.println(" ");
		System.out.println("Size: " +linkedList.size());
	}
}
