import java.util.*;

public class S1q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>(); // original stack
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		System.out.println("Enter the length:");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		int i = 0;
		while (i++ < n) {
			s.push(sc.nextInt());
		}
		System.out.println("The orinal stack:" + s.toString());

		System.out.println("Enter the no. of elements to be reversed:");
		int key = sc.nextInt();

		while (!s.isEmpty()) {
			s1.push(s.pop()); // added elements from s to s1 in reverse order
		}

		int j = 0;
		while (j++ < key) {
			s2.push(s1.pop()); // adding k elements from s1 to s2
		}

		while (!s2.isEmpty()) {
			s.push(s2.pop()); // 1st adding left over elements to s
		}
		while (!s1.isEmpty()) {
			s.push(s1.pop()); // 2nd adding elements to s
		}
		// System.out.print("The k reversed elements: " +s.toString());
		System.out.println(s);

		// for(int el:s) {
		// System.out.print(el + " ");
		// }
	}

}
