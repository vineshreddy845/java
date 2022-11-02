public class practice {

    public static void main(String args[]) {
        String a[] = { "a", "b", "c" };
        String b[] = { "a", "b", "c" };
        System.out.println(a);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                System.out.println("hello");
            } else {
                System.out.println("hi");
            }
        }
    }

}
