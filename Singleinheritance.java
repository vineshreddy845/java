class Ashok {
    public void Acres() {
        System.out.println("Acres");
    }

    public void home() {
        System.out.println("home");
    }
}

/*
 * class vinesh extends Ashok {
 * public void cricket() {
 * System.out.println("Cricket");
 * }
 * }
 */

public class Singleinheritance extends Ashok {
    public static void main(String args[]) {
        Singleinheritance obj = new Singleinheritance();
        obj.Acres();
        obj.home();
        // obj.cricket();

    }

}
