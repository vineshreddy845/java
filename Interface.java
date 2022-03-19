import java.util.*;

interface Ashok {
    public void method(); // its is abstract method;

    public void show(); // it is abstract method
}

class vinesh implements Ashok {
    public void method() {
        System.out.println("hello");
    }

    public void show() {
        System.out.println("vinesh");
    }

}

public class Interface {
    /*
     * It is another way to achieve abstractions using interface.
     * interface is completey abstract class.
     * interface uses implements in place of extends.
     * interface can have only abstract methods.
     */

    public static void main(String args[]) {
        vinesh obj = new vinesh();
        obj.method();
        obj.show();

    }
}
