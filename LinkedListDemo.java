package LinkedLists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo{
	public static void main(String[] args) {
		
		List<Integer> newLinkedList = new LinkedList<Integer>();
		newLinkedList.add(56);
		newLinkedList.add(30);
		newLinkedList.add(70);
		
		for(int i=0; i<newLinkedList.size(); i++)
		{
			System.out.println(newLinkedList.get(i));
		}
		
	}
}
