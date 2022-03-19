class variable {

    public int a = 5; // This code is public so it can accessable for all classes.
    public String name = "vinesh"; // same above.
}

public class Accessmodifier {

    /*
     * Access modifiers are
     * 1:public
     * 2:private
     * 3:protected
     * public class: it is accesiable to all classes.
     * /////////////////////////////////////////////
     * Access modifier for attributes , methods and constructors.
     * public -----------> The code is accesiable for all classes.
     * private------------> The code is accessiable within declared classes.
     * protected-----------> The code is accessiable in the same package and
     * subclasses.
     */

    public static void main(String args[]) {
        variable obj = new variable();
        System.out.println(obj.a);
        System.out.println(obj.name);
    }

}
