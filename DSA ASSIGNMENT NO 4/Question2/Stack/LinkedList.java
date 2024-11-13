package Assignment.Question03;

public class LinkedList {
	static class Node {
		int data;
		Node next;
	}

	Node head;
	public void push(int n) {
		Node newNode = new Node();
		newNode.data = n;
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		System.out.println("Element pushed Succesfully ");
	}

	public void pop() {
		if (head == null)
			System.out.println("Nothing to pop.");
		else {
			System.out.println("Element popped : " + head.data);
			head = head.next;
		}
	}

	public void peek() {
		if (head == null)
			System.out.println("Stack is empty!");
		else {
			
			System.out.println("Top : "+head.data);
		}
	}
}
