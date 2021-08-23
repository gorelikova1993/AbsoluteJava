package ch3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculatingBodyWeight {
    public static final int WEIGHT_FOR_MINIMUM_HEIGHT_IN_POUNDS = 110;
    public static final int MINIMUM_ALLOW_HEIGHT_IN_FEET = 5;
    public static final int WEIGHT_PER_ADDITIONAL_INCH_IN_POUNDS = 5;
    public static final int INCHES_PER_FEET = 12;
    public static void main(String[] args) {
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new FileInputStream("src/ch3/exercise12.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
            System.exit(0);
        }

        double idealBodyWeight;
        do
        {
            String name = fileIn.nextLine();
            double heightFeet = fileIn.nextDouble();
            double heightInche = fileIn.nextDouble();
            if(fileIn.hasNext()) {
                fileIn.nextLine();
            }
            idealBodyWeight = WEIGHT_FOR_MINIMUM_HEIGHT_IN_POUNDS + ((heightFeet - MINIMUM_ALLOW_HEIGHT_IN_FEET)*INCHES_PER_FEET
                    + heightInche)*WEIGHT_PER_ADDITIONAL_INCH_IN_POUNDS;

            System.out.println(name + " ideal body weight is: " + idealBodyWeight + " Pounds.");
        }
        while(fileIn.hasNext());
        fileIn.close();

    }
}
