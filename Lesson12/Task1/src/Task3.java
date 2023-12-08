public class Task3 {
    //Задача 3 Частотный анализ
    //Программа должна подсчитать, сколько раз каждое число встречается в массиве и вывести результат в коноль.
    public static void main(String[] args) {

        int sum = 0;
        int number = 5;
        int[] counter = {1, 2, 3, 5, 5};
        int[] frequency = new int[11];
        for (int i = 0; i < counter.length; i++) {
            number = counter[i];

        }
        for (int j = 0; j < counter.length; j++) {
            sum =0;
            if (counter[j]== number);
            sum+=1;
        }
        System.out.println(sum);
    }

    }
