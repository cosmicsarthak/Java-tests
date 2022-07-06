import java.util.*;

public class s3q1_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(al);
        // for (int el : hs) {
        // System.out.println(el + " " + Collections.frequency(al, el));
        // }

        // int count = 1;
        // System.out.println(al);
        // for (int i = 1; i < n; i++) {
        // if (al.get(i) == al.get(i - 1)) {
        // System.out.println(al.get(i - 1) + "...." + al.get(i));
        // ++count;
        // } else {
        // System.out.println(al.get(i - 1) + "...." + al.get(i));
        // System.out.println(al.get(i - 1) + "___" + count);
        // count = 1;
        // }
        // }

        sc.close();
    }
}
