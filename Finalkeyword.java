public class Finalkeyword {

    final int x = 20;// Using final keyword use is does not change value.
    String last = "reddy";

    public static void main(String args[]) {
        Finalkeyword obj = new Finalkeyword();
        // obj.x = 13; complier does not excute . and gives error because of final
        // keyword.
        System.out.println(obj.x);
    }
}
