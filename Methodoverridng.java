class Ashok {
    public void show() {
        System.out.println("vinesh");
    }
}

public class Methodoverridng extends Ashok {
    public void show() {
        System.out.println("vinni");
    }

    public static void main(String args[]) {
        Methodoverridng obj = new Methodoverridng(); // sub class method will override superclass method.
        obj.show();
    }
}
