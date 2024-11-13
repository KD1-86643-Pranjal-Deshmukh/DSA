package Assignment.Question02;

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
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
		System.out.println("Element pushed successfully ");
	}

	public void pop() {
		if (head == null)
			System.out.println("Nothing to popped.");
		else {
			System.out.println("Element popped : " + head.data);
			head = head.next;
		}
	}


	public void peek() {
		if (head == null)
			System.out.println("Queue is empty!");
		else {
			System.out.println(head.data);
		}
	}
}
