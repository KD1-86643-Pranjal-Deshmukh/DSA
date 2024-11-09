package Assignment.Question3;
public class LinearQueue {
	int front;
	int rear;
	int arr[];
	final int size;
	public LinearQueue(int size)
	{
		this.size=size;
		front=rear=0;
		arr=new int[size];
	}
	public boolean isEmpty()
	{
		if(front==rear)
			return true;
		return false;
	}
	public boolean isFull()
	{
		if(rear==size)
			return true;
		return false;
	}
	public void push(int n)
	{
		arr[rear]=n;
		rear++;
	}
	public int pop()
	{
		front++;
		return arr[front-1];
	}
	public int peek()
	{
		return arr[front+1];
	}
}
