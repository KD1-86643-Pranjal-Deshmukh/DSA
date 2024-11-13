package Assignment.Question03;

import java.util.Scanner;

public class StackMain {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int choice;
		LinkedList l = new LinkedList();
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
					System.out.print("\nEnter the element to push : ");
					l.push(sc.nextInt());
				break;
			case 2:
				l.pop();
				break;
			case 3:
				l.peek();
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
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.peek");
		System.out.print("\nEnter your choice : ");
		return sc.nextInt();
	}
}
