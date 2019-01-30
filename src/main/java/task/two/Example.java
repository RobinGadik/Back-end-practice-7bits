package task.two;

/**
 *
 */
class Example {

    /**
     * @param fr fron where search start
     * @return max length
     */
    static int getLongestLineCharsCount(FileReader fr) {
        int a = -1;
        while (fr.hasMoreLines()) {
            int b = fr.readLine().length();
            a = a > b ? a : b;
        }
        return a;
    }

}
