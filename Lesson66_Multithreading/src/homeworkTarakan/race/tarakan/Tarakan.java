package homeworkTarakan.race.tarakan;

import java.util.Random;

//Task 1.
//
//Create a game application “TarakansRace” Cockroach is a thread that performs a loop of iterations. At each iteration,
// the thread prints its own number and goes to sleep for a random number of milliseconds [2-5]. The sleep time range
// should be the same for all cockroaches. The cockroach that finishes the circle first is considered the winner.
//
//The application must receive the number of cockroaches and distance (number of iterations) from console I/O.
//
//At the end of the game the following message should be printed “Congratulations to cockroach #X (winner)”
// where X is the number of the winning cockroach.
public class Tarakan implements Runnable {

    String name;
    static int distance; // спросим у пользователя
    static int minSleepTime = 2;
    static int maxSleepTime = 5;
    static String winner; // должен быть какой-то метод для определения
    static Random random = new Random();

    // Конструктор только на имя, т.к. остальные поля статичные
    public Tarakan(String name) {
        this.name = name;
    }

    public static String getWinner() {
        return winner;
    }

    public static void setDistance(int distance) {
        Tarakan.distance = distance;
    }

    public static void setMinSleepTime(int minSleepTime) {
        Tarakan.minSleepTime = minSleepTime;
    }

    public static void setMaxSleepTime(int maxSleepTime) {
        Tarakan.maxSleepTime = maxSleepTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < distance; i++) {
            int sleepTime = minSleepTime + random.nextInt(maxSleepTime + 1 - minSleepTime);

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " is moving"); // таракан ползет
        }
        // доклад о приходе к финишу
        System.out.println(name + " has finished");
        // у каждого таракана есть шанс "добежать" до этой строчки программы
        if (winner == null) {
            winner = name; // принцип "оплодотворения", принцип сперматозоида
        }
    }
}

