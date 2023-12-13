package consultation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//**Задание 1.**
//В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main.
//Имена файлов принимать через массив args. Два файла считаем одинаковыми,
//если у них одинаковая длина, и на тех же позициях стоят те же байты.
//Результат должен быть выведен на консоль в виде сообщения.

public class CompareFileAppl {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Wrong number of arguments! Please input two files to compare");
        }
        try {
            FileInputStream file1 = new FileInputStream(args[0]);
            FileInputStream file2 = new FileInputStream(args[1]);
            int byte1 = file1.read();
            int byte2=file2.read();
            while ((byte1 != -1) &&  (byte2!= -1)) { // побайтовая проверка по байтам в обоих файле
                //    Два файла считаем одинаковыми,
//если у них одинаковая длина, и на тех же позициях стоят те же байты.
                if (file1.available() == file2.available() && byte1 == byte2) {
                    System.out.println("Файлы совпадают по длине и по байтам");
                } else {
                    System.out.println("Файлы различаются.");
                }
                file1.close();
                file2.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
