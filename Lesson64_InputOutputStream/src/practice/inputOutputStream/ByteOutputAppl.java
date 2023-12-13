package practice.inputOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteOutputAppl {
    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("dest/data.txt")) {
            fout.write(65);// пишем файл
            fout.write(66);// пишем файл
            fout.write(27); // esc
            fout.write(257);
            fout.write(1);
            fout.write(67);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
