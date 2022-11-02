import java.util.ArrayList;

public class Collection {

    public static void main(String args[]) {
        int c = 0, d = 0, g = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(0);
        a.add(-1);
        a.add(-1);
        int x = a.size();
        System.out.println(x);
        for (Integer i : a)// new iteration method.
        {

            System.out.println(i);
            if (i == 0) {
                c++;
            } else if (i >= 0) {
                d++;
            } else {
                g++;
            }

        }
        System.out.println(c);
        float q = (c % x);
        System.out.println(q);
        float e = (d % x);
        System.out.println(e);
        float o = (g % x);
        System.out.println(o);

    }
}
