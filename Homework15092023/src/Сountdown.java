//Обратный отсчет: Напишите программу, которая начинает обратный отсчет от A до 0 с
// паузой в 1 секунду между числами.
// (Подсказка: используйте Thread.sleep(1000); для паузы). Используем цикл while
public class Сountdown {
    public static void main(String[] args) {
        int counter = 10;
        while (counter >= 0) {

            System.out.println(counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter--;
        }
    }
}
