// Example checked exception

package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFoundDemo {

    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("E://file.txt"); // If the file does not exist an exception is thrown. That exception is
                                              // called as FileNotFoundException
        FileReader fr = new FileReader(file);
    }
}