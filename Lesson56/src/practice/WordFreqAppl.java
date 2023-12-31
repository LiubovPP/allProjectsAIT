package practice;

import java.util.*;

public class WordFreqAppl {
    public static void main(String[] args) {
        String[] words = {"abs", "ab", "limit", "ab", "a", "ab", "limit"};
        printWordsFrequency(words);

    }

    private static void printWordsFrequency(String[] words) {
        Map<String, Integer> resMap = new HashMap<>();
        for (String word:words
             ) {
            if (!resMap.containsKey(word)) { // такое слово еще не встречалось
                resMap.put(word, 1); // пишем в карту слово и 1
            } else {
                resMap.put(word, resMap.get(word) + 1);
            }
        }
        Set<Map.Entry<String, Integer>> entries = resMap.entrySet();
        System.out.println("----- Unsorted-------");
        for (Map.Entry<String, Integer> entry:entries
             ) {
            System.out.println(entry.getKey()+ " => "+ entry.getValue());
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(resMap.entrySet());
        list.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));
        list.forEach(e -> System.out.println(e));
    }

}
