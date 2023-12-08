package homework_Lesson57;

import java.util.HashMap;
import java.util.Map;

// Посчитайте количество повторяющихся букв в предложении Л.Н. Толстого.
public class SentenceTolstoy {
    public static void main(String[] args) {
        String sentence = "Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.";
        countLetters(sentence);
    }

    private static void countLetters(String sentence) {
        // Приводим к нижнему регистру для учета регистра
        sentence = sentence.toLowerCase();

        // Удаляем все символы, кроме букв
        sentence = sentence.replaceAll("[^а-яё]", "");
        System.out.println(sentence);
        // Инициализируем HashMap для подсчета букв
        Map<String, Integer> letterCountMap = new HashMap<>();

        // Подсчитываем количество каждой буквы
        String[] letters = sentence.split("");
        for (String l : letters) { // идем по массиву символов из предложения
            if (!letterCountMap.containsKey(l)) {
                letterCountMap.put(l, 1);
            } else {
                letterCountMap.put(l, letterCountMap.get(l) + 1);
            }
        }
        // Выводим результаты
        letterCountMap.forEach((letter, count) -> System.out.println(letter + ": " + count));
    }
}

