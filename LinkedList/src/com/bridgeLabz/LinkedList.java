/**
 * 
 */
package com.bridgeLabz;

/**
 * @author Admin
 *
 */
public class LinkedList {

	/**
	 * 
	 *UC2-Ability to add First And Last in Linked List
	 */
	
	public Node head;

	public class Node { 		
		Object data;	
		Node next;		
		public Node(Object data) {		
			this.data = data;

		}
	}

	public void pushFirst(Object data) {
		Node newNode = new Node(data);

		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			head = newNode;
			head.next = temp;

		}
	}

	public void display() {

		if (head == null) {
			System.out.println("List is empty");
		}
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		//Driving Class
		System.out.println("Linked List Program:");
		LinkedList input = new LinkedList();
		input.pushFirst(70);
		input.pushFirst(30);
		input.pushFirst(56);
		input.display();
		
	}
}
