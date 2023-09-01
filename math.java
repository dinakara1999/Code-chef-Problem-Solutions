public class math {
    public static void main(String[] args) {
//        double d= Math.round(2.5+Math.random());
//        System.out.println(d);

//                String biz = args[1];
//                String baz = args[2];
//                String rip = args[3];
//                System.out.println("Arg is " + rip);
        int result = 0;

        Boolean b1 = new Boolean("TRUE");
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("tRuE");
        Boolean b4 = new Boolean("false");

        if (b1 == b2)  /* Line 10 */
            result = 1;
        if (b1.equals(b2) ) /* Line 12 */
            result = result + 10;
        if (b2 == b4)  /* Line 14 */
            result = result + 100;
        if (b2.equals(b4) ) /* Line 16 */
            result = result + 1000;
        if (b2.equals(b3) ) /* Line 18 */
            result = result + 10000;

        System.out.println("result = " + result);


    }
}
