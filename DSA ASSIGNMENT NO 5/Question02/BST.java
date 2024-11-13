package Question02;

public class BST {
	static class Node{
		int data;
		Node left,right;
		public Node(int data)
		{
			this.data=data;
		}
	}
	Node root;
	public BST()
	{
		root=null;
	}
	public Node SearchNode(int data)
	{
		return search(root,data);
	}
	public Node search(Node trav,int data)
	{
		if(trav==null)
			return null;
		else
		{
			if(data==root.data)
				return trav;
			else if(data<trav.data)
				search(trav.left,data);
			else
				search(trav.right,data);
			return null;
		}
	}
	public void addNode(int data)
	{
		Node newNode=new Node(data);
		if(isEmpty())
			 root=newNode;
		else
		{
			add(newNode,root);
		}
	}
	private void add(Node newNode,Node root) {
		if(newNode.data<root.data)
		{
			if(root.left==null)
			   root.left=newNode;
			else
			   add(newNode,root.left);
				
		}
		else
		{
			if(root.right==null)
				   root.right=newNode;
				else
				   add(newNode,root.right);
		}
	}
	private boolean isEmpty() {
		return root==null;
	}
	public void inOrder() {
		System.out.print("Inorder : [");
		inOrder(root);
		System.out.print(" ]\n");
	}
	public void inOrder(Node trav)
	{
		if(trav==null)
		  return;
		inOrder(trav.left);
		System.out.print(" "+trav.data);
		inOrder(trav.right);
	}
}
