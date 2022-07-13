class Ashok2 {
    public void acres() {
        System.out.println("acres");
    }
}

class vinesh1 extends Ashok2 {
    public void home() {
        System.out.println("home");
    }
}

public class Multilevel extends vinesh1 {
    public static void main(String args[]) {
        Multilevel obj = new Multilevel();
        obj.acres();
        obj.home();
    }

}
