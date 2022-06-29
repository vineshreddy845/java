public class Throws1 {
    // Throws keyword-> Throws keyword it checks exception by it own
    public static void main(String args[]) throws ArithmeticException {
        // it olny throws exception when it occurs.otherwise no exception is throwed.
        int a = 10, b = 20, c;
        c = a + b;
        System.out.println(c);
        // In above example there is no exception there.so, that throws keyword does not
        // throw exception.
    }
}
