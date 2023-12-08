// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Long long1 = Long.valueOf("45");
        long long2 = Long.parseLong("67");

        System.out.println("long1 = " + long1);
        System.out.println("long2 = " + long2);

        String string1 = Integer.toHexString(254);
        System.out.println("254 в 16-ой системе = " + string1);

        String string2 = Long.toOctalString(254);
        System.out.println("254 в  8-ой системе = " + string2);

        String string3 = Long.toBinaryString(254);
        System.out.println("254 в  2-ой системе = " + string3);

        Integer iOb = new Integer(1000);

        System.out.println(iOb.byteValue());    // byte
        System.out.println(iOb.shortValue());   // short
        System.out.println(iOb.intValue());     // int
        System.out.println(iOb.longValue());    // long
        System.out.println(iOb.floatValue());   // float
        System.out.println(iOb.doubleValue());  //double
        }
    }
