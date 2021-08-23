package ch2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new FileInputStream("src/ch2/exercise12.txt"));
        String line = file.nextLine();
        System.out.println(line.replace("hate", "love"));

    }
}
