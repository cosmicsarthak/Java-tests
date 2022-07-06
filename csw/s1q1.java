//Inserting nodes at the end or at the begining or in between.

import java.util.Scanner;

class Link2 {
	int data;
	Link2 next;
}

public class s1q1 {
	static Link2 head = null;

	// Creating & Assigning values to the node
	public static void create(Link2 node) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first node");
		node.data = sc.nextInt();
		node.next = null;
		System.out.println("Enter 0 to exit or 1 to continue");
		int x = sc.nextInt();
		while (x != 0) {
			Link2 temp = new Link2();
			System.out.println("Enter the value for the next node");
			temp.data = sc.nextInt();
			temp.next = null;
			node.next = temp;
			node = temp;
			System.out.println("Enter 0 to exit or 1 to continue");
			x = sc.nextInt();
		}
	}

	// insert a Node at the end || at the beginning || at the end
	public static void insert(Link2 node) {
		Link2 current = new Link2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for the inserting node:");
		current.data = sc.nextInt();
		current.next = null;
		System.out.println("Enter the location :");
		int loc = sc.nextInt();

		// linkedlist size
		Link2 p = node;
		int c = 0;
		while (p != null) {
			c++;
			p = p.next;
		}

		// if element is at the end
		if (loc > c) {
			System.out.println("Invalid location...");
		}
		// if element is at the beginning.
		else {
			if (loc == 1) {
				current.next = node;
				head = current;
			}
			// if the element is in b/w the list.
			else {
				int i = 1;
				Link2 prev = new Link2();
				while (i < loc) {
					prev = node;
					node = node.next;
					i++;
				}
				prev.next = current;
				current.next = node;
			}
		}
	}

	// display
	public static void display(Link2 node) {
		while (node != null) {
			System.out.print(node.data + "----->");
			node = node.next;
		}
		System.out.println("Null");
	}

	// main program
	public static void main(String[] args) {
		Link2 node = new Link2();
		head = node;
		create(head);
		display(head);
		insert(head);
		display(head);
	}
}
