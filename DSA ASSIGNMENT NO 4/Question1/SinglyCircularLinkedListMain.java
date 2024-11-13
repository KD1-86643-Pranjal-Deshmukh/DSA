package Assignment.Question01;

import java.util.Scanner;

public class SinglyCircularLinkedListMain {
	static Scanner sc;
		public static void main(String[] args) {
			sc = new Scanner(System.in);
			int choice;
			SinglyCircularLinkedList l = new SinglyCircularLinkedList();
			while ((choice = menu()) != 0) {
				switch (choice) {
				case 1:
					System.out.print("Enter Element to add at first : ");
					l.addFirst(sc.nextInt());
					break;
				case 2:
					System.out.print("Enter Element to add at last  : ");
					l.addLast(sc.nextInt());
					break;
				case 3:
					System.out.print("Enter Element to add  : ");
					int n=sc.nextInt();
					System.out.print("Position  : ");
					l.addPostion(n, sc.nextInt());
					break;
				case 4:l.deleteFirst();
					break;
				case 5:l.deleteLast();
					break;
				case 6:
					System.out.print("Position to delete node : ");
					l.deletePosition(sc.nextInt());
					break;
				case 7:
					l.traverseList();
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
			System.out.println("1.Add first");
			System.out.println("2.Add Last");
			System.out.println("3.Add position");
			System.out.println("4.Delete first");
			System.out.println("5.Delete Last");
			System.out.println("6.Delete position");
			System.out.println("7.Traverse Linkedlist");
			System.out.print("\nEnter your choice : ");
			return sc.nextInt();
		}

}
