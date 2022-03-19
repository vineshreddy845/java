class Ashok {
    public void acres() {
        System.out.println("acres");
    }
}

class vinesh extends Ashok {
    public void home() {
        System.out.println("home");
    }
}

public class Multilevel extends vinesh {
    public static void main(String args[]) {
        Multilevel obj = new Multilevel();
        obj.acres();
        obj.home();
    }

}
