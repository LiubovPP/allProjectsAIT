// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Array {
    public static void main(String[] args) {
        String garage[] = new String[11];
        int size = garage.length;
        System.out.println(size);
        garage[5] = "B-AR 1555";
        garage[0] = "M-TT 2012";
        garage[9] = "WN-GG 777";
        garage[6] = "OS-BN 666";
        String carNumber = "S-WG 2012";
        garage[4] = carNumber;



        int parkNumber = 5;
        garage[parkNumber] = null;
        //for (int i = 0; i <=garage.length; i++) ;{
          //  System.out.println([]);
        //}
        int requestParkNumber=5;
        String result = garage [requestParkNumber];
        System.out.println(result);

        System.out.println(garage[0]);

    }
}
