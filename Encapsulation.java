class Vinesh {
    private int value;
    // private String name;

    public void setValue(int r) {
        value = r;
    }

    public int getValue() {
        return value;
    }
}

public class Encapsulation {
    public static void main(String args[]) {

        /*
         * The meaning of Encapsulation is to make sure that sensitive data is hidden
         * from users. To achieve this
         * you must.
         * 
         * 1: declare class variable/ attributes as priavte.
         * 2:provide public get and set methods to access and update the value of
         * private variable.
         * 
         */
        Vinesh obj = new Vinesh();
        obj.setValue(20);
        System.out.println(obj.getValue());

    }
}
