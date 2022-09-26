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
	 *UC1-Creating Linked List
	 */
	
	public Node head;

	public class Node { 		

		Object data;	
		Node next;		

		public Node(Object data) {		 
			this.data = data;

		}
	}
	public void push(int data) {

		Node newNode = new Node(data);		

		if (head == null) {
			head = newNode;

		} else {
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
		System.out.println("Linked List has been created: ");
		LinkedList input = new LinkedList();
		input.push(56);
		input.push(30);
		input.push(70);
		input.display();
	}



}
