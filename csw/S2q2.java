import java.util.*;

class S2q2 {

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> st = new Stack<>();
        boolean flag = true;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
                st.push(str.charAt(i));
            } else if (str.charAt(i) == ']') {
                if (st.peek() != '[') {
                    flag = false;
                    break;
                } else {
                    st.pop();
                }
            } else if (str.charAt(i) == '}') {
                if (st.peek() != '{') {
                    flag = false;
                    break;
                } else {
                    st.pop();
                }
            } else if (str.charAt(i) == ')') {
                if (st.peek() != '(') {
                    flag = false;
                    break;
                } else {
                    st.pop();
                }
            }
            // char x = str.charAt(i);
            // switch (x) {
            // case ']':
            // if (st.peek() != '[') {
            // flag = false;
            // break;
            // } else {
            // st.pop();
            // }
            // case '}':
            // if (st.peek() != '{') {
            // flag = false;
            // break;
            // } else {
            // st.pop();
            // }
            // case ')':
            // if (st.peek() != '(') {
            // flag = false;
            // break;
            // } else {
            // st.pop();
            // }
            // }

        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
