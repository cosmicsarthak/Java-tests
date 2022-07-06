import java.util.HashMap;
import java.util.Scanner;

public class s3q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hmp = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (hmp.containsKey(tmp)) {
                hmp.put(tmp, hmp.get(tmp) + 1);
            } else {
                hmp.put(tmp, 1);
            }
        }
        int x = sc.nextInt();
        // for (int k : hmp.keySet()) {
        // System.out.println(k + "occurs_" + hmp.get(k));
        // }
        if (hmp.containsKey(x)) {
            System.out.println(x + " occurs_" + hmp.get(x));
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
