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

	public void pushLast(Object data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
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
		input.pushLast(70);
		input.pushLast(30);
		input.pushLast(56);
		input.display();
		
	}
}
