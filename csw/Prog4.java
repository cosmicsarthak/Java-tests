//count Even OR Odd No. of Nodes.

import java.util.Scanner;
class Link4 {
	int info;
	Link4 next;
}

public class Prog4 {
	static Link4 start=null;
	
	// Creating & Assigning values to the node
	public static void create(Link4 node) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first node");
		node.info=sc.nextInt();
		node.next=null;
		System.out.println("Enter 0 to exit or 1 to continue");
		int x=sc.nextInt();
		while(x!=0) {
			Link4 temp=new Link4();
			System.out.println("Enter the value for the temp the node");
			temp.info=sc.nextInt();
			temp.next=null;
			node.next=temp;
			node=temp;
			System.out.println("Enter 0 to exit or 1 to continue");
			x=sc.nextInt();
		}
	}
	
	//  count even node | odd nodes :
	public static void check(Link4 node) {
		int even=0;
		int odd=0;
		while (node != null) {
			if (node.info % 2 == 0) {
				even++;
			} else
				odd++;
			node = node.next;
		}
		System.out.println("\n EVEN NODES :-> "+even+" ODD NODES :-> "+odd);
	}
	
	//display
	public static void display(Link4 node) {
		while(node != null) {
			System.out.print(node.info + " ===> ");
			node=node.next;
		}
		System.out.print("NULL");
	}
	
     //main program
	public static void main(String[] args) {
		Link4 node = new Link4();
		start=node;
		create(start);
		display(start);
		check(start);
	}
}

