
public class Operators {

    static void Assignment(int x, int y) {
        // Assignment operators =,+=,-=,*=,%=,&=,l=,^=,>>=,<<=

        x += y;
        // x -= y;
        System.out.println("x=" + x);
        System.out.println("x=" + x);
    }

    static void comparsion(int v, int y) {
        // comparsion operator ==,!=,>,<,>=,<=
        if (v == y) {
            System.out.println("v==y");
        } else if (v > y) {
            System.out.println("v is greater than y");
        } else {
            System.out.println("v is less than y");
        }
    }

    static void logicaloperators(int s, int r) {
        // logical operators &&,ll,!
        if (s < 5 && r < 3)// This code excutes when both s, r value true;
        {
            System.out.println("using logical operator && ");
        } else if (s < 5 || r < 3) { // This code excute when one of the condition true
            System.out.println("using logical operator !! or");
        } else {
            System.out.println("Hello");
        }
    }

    public static void main(String args[]) {
        // Arithmetaic operators +,-,%,/,*,++,--
        int a = 30, b = 20;
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a/b=" + (a / b));
        System.out.println("a%b=" + (a % b));
        System.out.println("a*b=" + (a * b));
        Assignment(2, 3);
        comparsion(2, 3);
        logicaloperators(2, 3);

    }
}
