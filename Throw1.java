public class Throw1 {
    // throw keyword=>means we are throwing exception in explictly. where in try and
    // catch block we are throwing exception implicitly.
    // In these we through exception forcebly.
    public void cherrys(int a, int b) {
        try {
            int c = a + b;
            if (c > 20) {
                throw new ArithmeticException("hi");
            } else {
                throw new ArrayIndexOutOfBoundsException("hello");
            }
        } finally {
            System.out.println("vinesh");
        }
        // catch (ArithmeticException e) {
        // System.out.println("hello");
        // } //catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("hi");
        // }
    }

    public static void main(String args[]) {
        Throw1 on = new Throw1();
        on.cherrys(10, 5);
    }
}
