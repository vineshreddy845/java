abstract class Ashok {
    public abstract void show(); // it do not have body

    public void demo() {
        System.out.println("hello");
    }
}

class Abstract extends Ashok {

    public void show() {
        System.out.println("hello"); // this is abstract method . it is body develop by using subclass.
    } // essitinal information.

    /*
     * Data Abstraction is used for hidding details and showing esstinal information
     * to user.
     * Abstraction can be achieved using Abstract class and interface.
     * Abstract class: it is cannot create class objects.
     * Abstract method : ot is used only in abstract class.it doesnot have body and
     * body is provided by subclass
     * Abstract class can have abstract methods and normal methods
     * 
     */
    public static void main(String args[]) {
        Abstract obj = new Abstract();
        obj.demo();
        obj.show();
    }
}
