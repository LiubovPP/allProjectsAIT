package consultation;

public class WeekDays {
    public static void main(String[] args) {
        //String[] dayWeekString = {"", ""};
        // int [] dayWeek = {1,2,3};

        String day[] = new String[7];
        day[0] = "Monday";
        day[1] = "Tuesday";
        day[2] = "Wednesday";
        day[3] = "Thursday";
        day[4] = "Friday";
        day[5] = "Saturday";
        day[6] = "Sunday";
       for (int i = 0; i < day.length; i++) {
            System.out.println("День недели " + (i + 1) + " " + day[i]);
        }
        System.out.println();
        for (int i = day.length - 1; i >= 0; i--) {
            System.out.println("День недели " + (i + 1) + " " + day[6]);

        }
        System.out.println();
        printWeekArabic(day);
    }
  public static void printWeekArabic(String[] str) {
      System.out.println("День недели 1 "+ str[6]);
        for (int i = 0; i < str.length-1; i++) {
          System.out.println("День недели " + (i + 2) + " " + str[i]);
      }
  }


}
