import java.util.ArrayList;

public class AdvanceCollection {
    public static void main(String args[]) {

        ArrayList<Adding> must = new ArrayList<>();

        Adding so = new Adding();
        so.name = "ceo";
        so.id = 9;

        must.add(so);

        for (Adding i : must) { // new iteration
            System.out.println(i);
        }

        /*
         * new iteration syntax: for(The type of value stored ij collection variable
         * name: collection name){}
         */

    }
}