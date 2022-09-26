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
	/*public void deleteFirst() {
		if (head == null)
			System.out.println("No elements in list to delete");
		else if (head.next == null) {
		head = null;}
		else {
			System.out.println("First element in list deleted");
			Node temp = head.next;
			head = temp;

		}
	}
	public void deleteLast() {
		if (head == null)
			System.out.println("No elements in list to delete");
		else if (head.next == null)
			head = null;
		else {
			System.out.println("Last element in list is deleted");
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
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
	*/
	
	public void search(Object searchData) {
		if (head.data == searchData)
			System.out.println(searchData + " is Found in List");
		else {
			Node temp = head;

			boolean isFound = false;

			while (temp != null) {
				if (temp.data == searchData) {
					isFound = true;
					break;
				}

				temp = temp.next;
			}

			if (isFound == true)
				System.out.println(searchData + " is Found in List");
			else
				System.out.println(searchData + " is not Found in List");
		}
	}
	public void display() {
		if (head == null)
			System.out.println("No elements in list to display");
		else if (head.next == null)
			System.out.println(head.data);
		else {
			Node temp = head;
			while (temp != null) {
				if (temp.next != null)
					System.out.print(temp.data + "-->");
				else
					System.out.print(temp.data + "\n");
				temp = temp.next;
			}
		}
	}

	public int size() {
		int count = 0;

		Node temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;

	}

	/*public void insertIndex(int userIndex, Object data) {

		if (userIndex == 0)
			pushFirst(data);
		else if (userIndex == size())
			pushLast(data);

		else if (userIndex < 0 || userIndex >= size())
			System.out.println("Invalid index");


		else {
		
			Node newNode = new Node(data);


			int index = 0;
			Node left = head;
			Node right = left.next;

			while (index < userIndex - 1) {
				left = left.next;
				right = right.next;
				index++;
			}
			newNode.next = right;
			left.next = newNode;
		}
	}
*/

	public static void main(String[] args) {
		// Driving Class
		System.out.println("Linked List Program");
		LinkedList input = new LinkedList();
		input.pushFirst(56);
		input.pushFirst(30);
		input.pushFirst(70);
		input.display();
		input.search(56);
		
}
}
