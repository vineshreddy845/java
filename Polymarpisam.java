public class Polymarpisam {
    /*
     * polymarpisam is poly means many, marpisam means behaviour
     * polymarpisam has two methods
     * 1: method overloading: method hs same name but different parameter.
     * 2:method overriding:subclass method will override superclass method.
     * 
     */

    public void show(int n) { // This method overloading
        System.out.println(n);
    }

    public void show(String s) {
        System.out.println(s);
    }

    public static void main(String args[]) {
        Polymarpisam obj = new Polymarpisam();
        obj.show("vinesh");
    }
}
