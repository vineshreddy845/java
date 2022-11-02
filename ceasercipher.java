public class ceasercipher {

    public static void main(String args[]) {
        String a = "amiddle-Outz";
        String c = "abcdefghijklmnopqrstuvwxyz";
        int n1 = c.length();
        int n = a.length();
        String b[] = new String[n];
        b = a.split("");
        String d[] = new String[n1];
        d = c.split("");
        // System.out.println(d[12]);
        // System.out.println(b[0]);

        /*
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < n1; j++) {
         * if (b[i] == d[j]) {
         * b[i] = d[j + 2];
         * System.out.println(b[i]);
         * } else {
         * System.out.println("searching");
         * }
         * }
         */
        System.out.println(b[0]);
        System.out.println(d[0]);
        if (b[0] == d[0]) {
            System.out.println("hi");
        } else {
            System.out.println("hello");
        }
    }

}
