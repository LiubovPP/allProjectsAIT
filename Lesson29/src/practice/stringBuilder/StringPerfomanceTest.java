package practice.stringBuilder;

public class StringPerfomanceTest {
    private static final int N_ITERATION = 100_000;// определяем константу для вычисления и работают на весь класс
    private static final String WORD = "Word";// определяем константу

    public static void main(String[] args) {
        //String - immutable
        String str = ""; // инициировали пустую строку
        long t1 = System.currentTimeMillis();// Засекаем время
        for (int i = 0; i < N_ITERATION; i++) {
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis();// вторая засечка времени
        System.out.println(t2 - t1);// столько времени прошло в миллисекундах

        // StringBuilder - mutable
        StringBuilder stringBuilder = new StringBuilder("");
        t1 = System.currentTimeMillis();// Засекаем время
        for (int i = 0; i < N_ITERATION; i++) {
            stringBuilder.append(WORD);
        }
        str=stringBuilder.toString();
        t2 = System.currentTimeMillis();// вторая засечка времени
        System.out.println(t2 - t1);// столько времени прошло в миллисекундах
    }
}
