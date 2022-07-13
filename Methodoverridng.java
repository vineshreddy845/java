class Ashok1{
    public void show() {
        System.out.println("vinesh");
    }
}

class soldierboy extends Ashok1 {
    public void show() {
        System.out.println("Aryan");
    }
}

public class Methodoverridng extends Ashok1{
    public void show() {
        System.out.println("vinni");
    }

    public static void main(String args[]) {
        Methodoverridng obj = new Methodoverridng(); // sub class method will override superclass method.
        obj.show();
    }
}
