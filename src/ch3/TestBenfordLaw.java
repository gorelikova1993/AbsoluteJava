package ch3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TestBenfordLaw {
    public static void main(String[] args) {
       int count1 = 0, count2 = 0, count3=0, count4=0, count5=0, count6=0, count7=0, count8=0, count9=0, number=0, quantity=100;
       char firstDigit;
        Scanner sc = null;
       try {
            sc = new Scanner(new FileInputStream("src/ch3/files/numbers.txt"));
       }
       catch (FileNotFoundException e) {
           System.out.println("File not found.");
           System.exit(0);
       }
        do{
            number = sc.nextInt();
            if(sc.hasNext()){
                sc.nextLine();
            }
            firstDigit = Integer.toString(number).charAt(0);
            switch (firstDigit){
                case '1':
                    count1++;
                    break;
                case '2':
                    count2++;
                    break;
                case '3':
                    count3++;
                    break;
                case '4':
                    count4++;
                    break;
                case '5':
                    count5++;
                    break;
                case '6':
                    count6++;
                    break;
                case '7':
                    count7++;
                    break;
                case '8':
                    count8++;
                    break;
                case '9':
                    count9++;
                    break;
                default:
                    break;
            }

        }while(sc.hasNext());
        DecimalFormat df =  new DecimalFormat("##.## %");
        System.out.println("1 appears " + df.format((double)count1/quantity));
        System.out.println("2 appears " + df.format((double)count2/quantity));
        System.out.println("3 appears " + df.format((double)count3/quantity));
        System.out.println("4 appears " + df.format((double)count4/quantity));
        System.out.println("5 appears " + df.format((double)count5/quantity));
        System.out.println("6 appears " + df.format((double)count6/quantity));
        System.out.println("7 appears " + df.format((double)count7/quantity));
        System.out.println("8 appears " + df.format((double)count8/quantity));
        System.out.println("9 appears " + df.format((double)count9/quantity));


    }
}
