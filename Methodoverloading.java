public class Methodoverloading {
    /*
     * defination: mutilpe methods can have same name with different parameters.
     * Note**: instead of defining two methods that should o the same thing, it is
     * better to overload one.
     * In the below example we overload the Vinesh method to work for both int and
     * string.
     * 
     */

    static int Vinesh(int a, int b) {
        return a + b;
    }

    static String Vinesh(String name, String surname) {
        return name + surname;
    }

    public static void main(String args[]) {
        int c = Vinesh(2, 3);
        String fullname = Vinesh("vinesh", "Jallapuram");
        System.out.println(c);
        System.out.println(fullname);
    }
}
