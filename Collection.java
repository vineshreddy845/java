import java.util.ArrayList;

/*java collection has so many classes .
 * collection, List  is an interface we can't create object .where it implementatio can create. implementation
 * class is ArrayList
 * syntax: List name = new ArrayList();
 * Synatx:Stack name1 = new Treeset(); etc,
 * collection can store any type of data.example string,int float.
 * List list = new ArrayList();
 * list.add(1);
 * list.add("uu");
 * list.add(1.2);
 * but if you want to use certain type of data.we have to use generics.
 * syntax: List<datatype> list = new ArrayList<>();
 * example:
 *   List<Integer> list = new ArrayList<>();
 * list.add(1);
 * list.add(2);
 * difference between list , stack and maping.
 * List can have duplicate data. we can also add data wherver we want using index: list.add("indexnumber","data")
 * Stack can't have duplicate data. Data stored in stack in random .
 * map can have duplicate data .it store data in <key,value> pair.
 * example:
 * Map<Integer,String> wonder = new HashMap<>();
 */

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
