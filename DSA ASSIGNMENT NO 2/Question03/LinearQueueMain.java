package Assignment.Question3;
import java.util.Scanner;

public class LinearQueueMain {
	static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int choice;
		LinearQueue q=new LinearQueue(5);
		while((choice=menu())!=0)
		{
			switch(choice)
			{
			case 1:if(q.isFull())
			{
				System.out.println("Queue is full");
			}
			else
			{
				System.out.print("\nEnter the element to enqueue : ");
				q.push(sc.nextInt());
			}
				break;
			case 2:if(q.isEmpty())
			{
				System.out.println("Queue is Empty");
			}
			else
			{
				System.out.println("Element popped : "+q.pop());
			}
				break;
			case 3:if(q.isEmpty())
			{
				System.out.println("Queue is Empty");
			}
			else
			{
				System.out.println("Element at front : "+q.peek());
			}
				break;
			default:System.out.println("Invalid Choice!");
			}
		}
	}
	static int menu()
	{
		System.out.println("---------------------------------");
		System.out.println("Menu");
		System.out.println("0.exit");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.peek");
		System.out.print("\nEnter your choice : ");
		return sc.nextInt();
	}

}
