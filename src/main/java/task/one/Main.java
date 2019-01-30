package task.one;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 */
class Main {
    /**
     * @param args example, empty input
     */
    public static void main(final String[] args) {
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fin = new FileInputStream("Homework3.txt")) {
            System.out.printf("File size: %d bytes \n", fin.available());

            int i;
            while ((i = fin.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String text = "Kolomeytzev"; // строка для записи
        try (FileOutputStream fos = new FileOutputStream("MyHomework.txt")) {
            byte[] buffer = sb.toString().getBytes();
            fos.write(buffer, 0, buffer.length);
            buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
