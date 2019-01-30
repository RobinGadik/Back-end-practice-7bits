package task.two;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
class FileReader {

    private BufferedReader in;
    private File file;
    private int numb;
    private boolean moreLines;

    /**
     * @param name filename
     * @throws FileNotFoundException if file not found
     */
    FileReader(final String name) throws FileNotFoundException {
        file = new File(name);
        in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        numb = 0;
        moreLines = true;
    }

    /**
     * @return return line
     */
    String readLine() {
        StringBuilder sb = new StringBuilder();
        numb++;
        sb.append(file.getName()).append(" line ");
        sb.append(numb);
        sb.append(":");
        try {
            sb.append(in.readLine());
        } catch (IOException e) {
            moreLines = false;
        }
        return sb.toString();
    }

    /**
     * @return if can - true
     */
    boolean hasMoreLines() {
        return moreLines;
    }


}
