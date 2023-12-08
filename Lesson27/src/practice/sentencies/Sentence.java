package practice.sentencies;

public class Sentence {

    // Count words in Sentence
    public int countWords(String str) {
        String[] words = str.split(" ");
        int n = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("–")||words[i].equals("-")||words[i].equals(",")) {
                n++;
            }
        }
//        System.out.println(words.length);
//        System.out.println(n);
        return words.length - n;
    }


    // Count symbols in Sentence
    public int countSymbols (String str) {
        String[] symbols = str.split("");
        int count =0;
        //TODO исключить из результата метода пробелы
        for (int i = 0; i < symbols.length; i++) {

            if (symbols[i].equals(" ")||symbols[i].equals("–")||
            symbols[i].equals("-")||symbols[i].equals(",")||symbols[i].equals(".")||symbols[i].isEmpty()){ // здесь добавляем знаки по
                // заказу, тест прошел
                count++;
            }
        }return symbols.length - count;
    }
    // Еще способы:
    // //Это регулярное выражение "[\\s,.;?!:;()]+" разделяет строку на слова, учитывая пробелы, запятые, точки с запятой, вопросительные и восклицательные знаки, двоеточия и скобки как разделители
    //public int countWords1(String str) {
    //    str.trim();
    //    String[] words = str.split("[\\s,.;?!:;()]+");
    //    return words.length;
    //}
    ////Этот метод использует регулярное выражение "[^a-zA-Z]", чтобы удалить все символы, кроме букв (как прописных, так и заглавных), затем возвращает количество оставшихся букв.
    //public int countSymbols1(String str) {
    //    str.trim();
    //    String lettersOnly = str.replaceAll("[^a-zA-Z]", "");
    //    return lettersOnly.length();
    //}

//public int countSimbols(String str) {
//        String[] letters = str.split("");
//        String specChar = " !@#$%^&*()_-+{[}]|?/>,<.~`=;:'€₽¥₴₪¢£¤¦§¨©ªº«»¬®¯°‰´µ¶·¸¹¿←↑→↓↔⇒⇐⇔⇑⇓↵♠♣♥♦◊○●◄▼►▲■▪▫♀♂™•";
//        String [] specChArr= specChar.split("");
//        int n = 0;
//        for (int i = 0; i < letters.length; i++) {
//            for (int j = 0; j < specChArr.length; j++) {
//            if (specChArr[j].equals(letters[i])) {
//                n++;
//            }
//            }
//        }
//        return letters.length - n;
//        // todo исключить пробелы из результата метода
//        // !@#$%^&*()_-+{[}]|?/>,<.~`=;:'€₽¥₴₪
//    }
//}
    //// Оставить в String'е только буквы и (!) пробелы.
    //// Ну или по другому: удалить все символы из строки.
    //// [^] - выбирает любой символ который НЕ перечислен внутри квадратных скобок
    //// Соответственно далее мы перечисляем что нам нужно оставить. А именно:
    //// a-zA-Z - Латинские символы
    //// а-яёА-ЯЁ - Кириллица
    //// пробел
    //public int countWords(String str) {
    //    String[] words = str.replaceAll("[^a-zA-Za-яёА-ЯЁ ]","").split(" ");
    //    System.out.println(Arrays.toString(words));
    //
    //    return words.length ;
    //}


}

