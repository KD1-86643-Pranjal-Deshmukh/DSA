package Assignment.Question01;

public class SinglyCircularLinkedList {
	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
		}
	}
	Node tail;
	int size;
	public SinglyCircularLinkedList()
	{
		tail=null;
		size=0;
	}
	private boolean isEmpty() {
		return tail==null;
	}
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if(isEmpty())
		{
			tail=newNode;
			tail.next=tail;
		}
		else
		{
			newNode.next=tail.next;
			tail.next=newNode;
		}
		size++;
		System.out.println("Node added sucessfully");
	}
	public void addLast(int data) {
		Node newNode=new Node(data);
		if(isEmpty())
		{
			tail=newNode;
			tail.next=tail;
		}
		else
		{
			newNode.next=tail.next;
			tail.next=newNode;
			tail=newNode;
		}
		size++;
		System.out.println("Node added sucessfully");
		
	}
	public void addPostion(int data, int pos) {
		Node newNode=new Node(data);
		if(isEmpty())
		{
			tail=newNode;
			newNode.next=tail;
		}
		else if(pos<=1)
		{
			addFirst(data);
			return;
		}
		else if(pos>=size)
		{
			addLast(data);
			return;
		}
		else
		{
			Node trav=tail.next;
			for(int i=1;i<pos-1;i++)
				trav=trav.next;
			newNode.next=trav.next;
			trav.next=newNode;
		}
		size++;
		System.out.println("Node added successfully");
	}
	public void deleteFirst() {
		if(isEmpty())
		{
			System.out.println("Nothing to delete");
		}
		else
		{
			if(size==1)
			    tail=null;
			else
			{
				tail.next=tail.next.next;
			}
			size--;
			System.out.println("Node deleted successfully");
		}
	}
	public void deleteLast() {
		if(isEmpty())
		{
			System.out.println("Nothing to delete");
		}
		else
		{
			if(size==1)
			    tail=null;
			else
			{
				Node trav=tail.next;
				while(trav.next!=tail)
					trav=trav.next;
				trav.next=tail.next;
				tail=trav;
			}
			size--;
			System.out.println("Node deleted successfully");
		}
	}
	public void deletePosition(int pos) {
		if(isEmpty())
		{
			System.out.println("Nothing to delete");
		}
		else if(pos<=1)
		{
			deleteFirst();
			return;
		}
		else if(pos>=size)
		{
			deleteLast();
			return;
		}
		else
		{
			Node trav=tail.next;
			for(int i=1;i<pos-1;i++)
				trav=trav.next;
			trav.next=trav.next.next;
		}
		size++;
		System.out.println("Node added successfully");
	}
	public void traverseList() {
		if(isEmpty())
			System.out.println("Nothing to display");
		else
		{
			Node trav=tail.next;
			System.out.print("Linked List : \n\t[ ");
			do{
				System.out.print(trav.data + "  ");
				trav = trav.next;
			}while (trav!=tail.next) ;
			System.out.print("] \n");
		}
	}
}
