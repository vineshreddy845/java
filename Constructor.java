public class Constructor {

    /*
     * constructor in java is a special method that is used to initallize objects.
     * constructor does not return type.
     */
    public int x; // installize variable.

    public Constructor(int r) {
        x = r;
    }

    public static void main(String args[]) {
        Constructor obj = new Constructor(5); // using constructor we installizing to r to x;
        System.out.println(obj.x);
    }

}
