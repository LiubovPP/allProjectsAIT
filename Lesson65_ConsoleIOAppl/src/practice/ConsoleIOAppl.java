package practice;

import java.io.*;

public class ConsoleIOAppl {
    public static void main(String[] args) throws IOException {
        // сценарий
        // спросим у пользователя имя файла, затем будем сохранять то, что он напишет в этом файле

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name: ");
        String str = bufferedReader.readLine(); // пользователь ввел правильное имя файла
//        System.out.println(str);
        PrintWriter printWriter = new PrintWriter(new FileWriter(str, true));  // создаем новый символьный поток в файл
        System.out.println("Type your text, please");
        str = bufferedReader.readLine();
        while (!"stop".equalsIgnoreCase(str)) {
            printWriter.println(str);
            System.out.println("Type your text, please");
            str= bufferedReader.readLine();
        }

        printWriter.flush(); // отправление из буфера в поток в файл
        printWriter.close();
    }
}
