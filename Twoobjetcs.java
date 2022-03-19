public class Twoobjetcs {

    int x = 20;
    String name = "vinesh";
    char c = 'I';

    public static void main(String args[]) {
        Twoobjetcs obj = new Twoobjetcs();// we are using two objects for one class
        Twoobjetcs obj1 = new Twoobjetcs();
        obj.name = "reddy";// changing name value is also known as overriding.
        obj1.c = 'J';// changing c value
        System.out.println(obj.name);
        System.out.println(obj1.c);
        System.out.println(obj.x);
    }
}
