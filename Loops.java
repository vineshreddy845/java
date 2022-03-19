public class Loops {

    static void forloop(int a[], int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    /*
     * static void dowhile(int a[], int n, int x) {
     * do {
     * System.out.println("I am in do while loop ");
     * } while (x <= n);
     * {
     * int i;
     * for (i = 0; i < n; i++) {
     * System.out.println(a[i]);
     * 
     * }
     * 
     * }
     * 
     * }
     */

    public static void main(String args[]) {
        // if __ else
        int x = 5, y = 25, z = 50;
        int a[] = { 1, 2, 3, 4, 5 };
        if (x < y) {
            System.out.println("x is less than y");
        } else if (y < z) {
            System.out.println("y is less than z ");
        } else {
            System.out.println("z is greater than y");
        }
        forloop(a, 5);
        // dowhile(a, 5, x);
    }
}
