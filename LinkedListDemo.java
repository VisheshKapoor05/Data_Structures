package LinkedLists;

public class LinkedListDemo{
	public static void main(String[] args) {
		
		LinkedListOperations linkedList = new LinkedListOperations();
		linkedList.insertFirst(56);
		linkedList.insertLast(30);
		linkedList.insertLast(70);
		
		linkedList.displayNodesData();
		
	}
}
