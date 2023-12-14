package homeworkTarakan.race;

import homeworkTarakan.race.tarakan.Tarakan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TarakanRaceAppl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // принимает на "вход" всегда строку
        System.out.println("Number of cockroaches: ");
        int nTarakans = Integer.parseInt(br.readLine());
        System.out.println("Distance: ");
        int distance = Integer.parseInt(br.readLine());
        Tarakan.setDistance(distance);// всем тараканам назначили дистанцию
        Thread[] tarakans = startRace(nTarakans);  // старт гонки
        waitFinish(tarakans); // все потоки присоединились к main
        System.out.println("Congratulations to Cockroach " + Tarakan.getWinner());
    }


    private static Thread[] startRace(int nTarakans) {
        Thread[] threads = new Thread[nTarakans];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Tarakan("Tarakan #" + (i + 1)));
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        return threads;
    }

    private static void waitFinish(Thread[] tarakans) {
        for (int i = 0; i < tarakans.length; i++) {
            try {
                tarakans[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
                //e.printStackTrace();
            }
        }
    }

}
