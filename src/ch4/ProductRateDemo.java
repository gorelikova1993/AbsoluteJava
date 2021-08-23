package ch4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductRateDemo {
    public static void main(String[] args)
    {
        Scanner fr = null;
        DecimalFormat df = new DecimalFormat("0.00");
        try {
            fr = new Scanner(new FileInputStream("src/ch4/customerRatings.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }
        String productRates = fr.nextLine();
        StringTokenizer splitproductRates = new StringTokenizer(productRates, ",");
        int productRatesCount = splitproductRates.countTokens();
        String[] productRatesArray = new String[productRatesCount];
        double[] total = new double[productRatesCount];
        int[] countProduct = new int[productRatesCount];
        int mark = 0;
        while (splitproductRates.hasMoreTokens()) {
            String product = splitproductRates.nextToken();
            productRatesArray[mark] = product;
            mark = mark + 1;
        }
        int rowsCount = 50;
        int rows = 0;
        int columns = 0;
        int[][] ratingsarray = new int[rowsCount][productRatesCount];
        int userRate;
        while (fr.hasNextLine()) {
            String ratingsLine = fr.nextLine();
            StringTokenizer splitRatings = new StringTokenizer(ratingsLine, ",");
            while (splitRatings.hasMoreElements()) {
                String prodcutARating = splitRatings.nextToken();
                userRate = prodcutARating.charAt(0) - 48;
                if (userRate > 0){
                    ratingsarray[rows][columns] = userRate;
                }
                columns++;
            }
            rows++;
            columns = 0;
        }
        fr.close();
        int x = rows;
        int y = productRatesCount;
        System.out.println("User Ratings from input file:customerRatings.txt");
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++) {
                System.out.print(ratingsarray[i][j] + " ");
            }
            System.out.println();
        }
        for (int columns1 = 0; columns1 < y; columns1++) {
            for (int rows1 = 0; rows1 < x; rows1++) {
                total[columns1] += ratingsarray[rows1][columns1];
                if (ratingsarray[rows1][columns1] > 0)
                    countProduct[columns1] = countProduct[columns1] + 1;
            }
        }
        System.out.println("\n***CUSTOMER PRDOUCT RATINGS***\n");
        for (int t = 0; t < productRatesCount; t++) {
            System.out.println("Product " + productRatesArray[t] + " average rate: "
                    + df.format(total[t] / countProduct[t]));
        }
    }
}
