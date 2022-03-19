public class Staticvsnonstatic {
    /*
     * static keyword => static method can be accesed without creating class object.
     * non static keyword => public method can be accesed with class objects.
     */
    static void vinesh(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public void Vinni(int e, int d) {
        int f = e + d;
        System.out.println(f);

    }

    public static void main(String args[]) {
        Staticvsnonstatic obj = new Staticvsnonstatic();
        vinesh(2, 3);// it can be accesed without object. because it is static method.
        obj.Vinni(4, 5);// it can be accesed with class object. because it public method.
    }
}
