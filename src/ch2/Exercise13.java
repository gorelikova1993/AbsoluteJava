package ch2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise13 {

    public static int WEIGHT_FOR_MINIMUM_HEIGHT_IN_POUNDS = 110;
    public static int MINIMUM_ALLOW_HEIGHT_IN_FEET = 5;
    public static int WEIGHT_PER_ADDITIONAL_INCH_IN_POUNDS = 5;
    public static int INCHES_PER_FEET = 12;

    public static void main(String[] args) {
        Scanner infile = null;

        try {
            infile = new Scanner(new FileInputStream("src/ch2/data.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        String personName;
        int personHeightInFeet;
        int personHeightInInches;
        double idealBodyWeightInPounds;

        personName = infile.nextLine();
        personHeightInFeet = infile.nextInt();
        infile.nextLine();
        personHeightInInches = infile.nextInt();
        infile.nextLine();

        idealBodyWeightInPounds = WEIGHT_FOR_MINIMUM_HEIGHT_IN_POUNDS
                + ((personHeightInFeet - MINIMUM_ALLOW_HEIGHT_IN_FEET)
                * INCHES_PER_FEET + personHeightInInches)
                * WEIGHT_PER_ADDITIONAL_INCH_IN_POUNDS;

        System.out.println("  Name: " + personName + ", Ideal Body Weight: "
                + idealBodyWeightInPounds + " pounds");
        System.out.println();

        personName = infile.nextLine();
        personHeightInFeet = infile.nextInt();
        infile.nextLine();
        personHeightInInches = infile.nextInt();
        infile.nextLine();

        idealBodyWeightInPounds = WEIGHT_FOR_MINIMUM_HEIGHT_IN_POUNDS
                + ((personHeightInFeet - MINIMUM_ALLOW_HEIGHT_IN_FEET)
                * INCHES_PER_FEET + personHeightInInches)
                * WEIGHT_PER_ADDITIONAL_INCH_IN_POUNDS;

        System.out.println("  Name: " + personName + ", Ideal Body Weight: "
                + idealBodyWeightInPounds + " pounds");
        System.out.println();

        personName = infile.nextLine();
        personHeightInFeet = infile.nextInt();
        infile.nextLine();
        personHeightInInches = infile.nextInt();

        idealBodyWeightInPounds = WEIGHT_FOR_MINIMUM_HEIGHT_IN_POUNDS
                + ((personHeightInFeet - MINIMUM_ALLOW_HEIGHT_IN_FEET)
                * INCHES_PER_FEET + personHeightInInches)
                * WEIGHT_PER_ADDITIONAL_INCH_IN_POUNDS;

        System.out.println("  Name: " + personName + ", Ideal Body Weight: "
                + idealBodyWeightInPounds + " pounds");
        System.out.println();

        infile.close();
    }
}
