
// creating LinkedList And Displaying the Nodes.
import java.util.Scanner;

class Link {
	int data;
	Link next;
}

public class Prog1 {
	static Link head = null;

	// Creating & Assigning values to the node
	public static void create(Link node) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first node");
		node.data = sc.nextInt();
		node.next = null;
		System.out.println("Enter 0 to exit or 1 to continue");
		int x = sc.nextInt();
		while (x != 0) {
			Link temp = new Link();
			System.out.println("Enter the value for the next node");
			temp.data = sc.nextInt();
			temp.next = null;
			node.next = temp;
			node = temp;
			System.out.println("Enter 0 to exit or 1 to continue");
			x = sc.nextInt();
		}
		sc.close();
	}

	// display
	public static void display(Link node) {
		while (node != null) {
			System.out.print(node.data + " ---> ");
			node = node.next;
		}
		System.out.print("null");
	}

	// main program
	public static void main(String[] args) {
		Link node = new Link();
		head = node;
		create(head);
		display(head);
	}
}
