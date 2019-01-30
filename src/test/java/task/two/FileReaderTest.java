package task.two;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {
    @Test
    void readLine() throws FileNotFoundException {
        FileReader fr = new FileReader("Homework3.txt");
        assertEquals("Homework3.txt line 1:./", fr.readLine());
    }

}