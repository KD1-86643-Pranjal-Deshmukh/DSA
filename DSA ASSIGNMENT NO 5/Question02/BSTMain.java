package Question02;

import java.util.Scanner;

public class BSTMain {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int choice;
		BST l = new BST();
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				System.out.print("Enter Element to add : ");
				l.addNode(sc.nextInt());
				break;
			case 2:
				System.out.print("InOrder Traversal  : ");
				l.inOrder();
				break;
			case 3:
				System.out.print("Enter Node to search  : ");
				if(l.SearchNode(sc.nextInt())==null)
					System.out.println("Element not found");
				else
					System.out.println("Element found");
				break;
			default:
				System.out.println("Invalid Choice!");
			}
		}
	}

	static int menu() {
		System.out.println("---------------------------------");
		System.out.println("Menu");
		System.out.println("0.exit");
		System.out.println("1.Add Node");
		System.out.println("2.Inorder Traversal");
		System.out.println("3.Search Node");
		System.out.print("\nEnter your choice : ");
		return sc.nextInt();
	}

}
