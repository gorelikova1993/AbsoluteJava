package ch3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckVowelsInFile {
    public static void main(String[] args) {
        Scanner file = null;
        Scanner input;
        String words = "", temp;
        char vowel;

        try {
            file = new Scanner(new FileInputStream("src/ch3/files/ex16.txt"));
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }
        input = new Scanner(System.in);
        System.out.println("Please type one of five vowels(a, e, i, o, and u) to find out\n" +
                "how many words in file start with it");
        vowel = input.next().charAt(0);
        while(file.hasNext()){
            temp = file.next();
            if(temp.charAt(0) == vowel){
                words = words + "\n" + temp;
            }
        }
        System.out.println(words.trim());
    }
}
