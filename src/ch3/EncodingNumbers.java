package ch3;

import java.util.Scanner;

public class EncodingNumbers {
    public static void main(String[] args) {
        int number, size, firstDigit, lastDigit, temp;
        String encodedNumber = "";
        System.out.println("Please type the number that should be encoded: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        size = Integer.toString(number).length();
        firstDigit = (int) (number/Math.pow(10, size-1));
        lastDigit = number%10;
        for(int i=0;i<size;i++){
            temp=number%10;
            switch (temp){
                case 0:
                    encodedNumber="*"+encodedNumber;
                    break;
                case 1:
                    encodedNumber="B" + encodedNumber;
                    break;
                case 2:
                    encodedNumber="E" +encodedNumber;
                    break;
                case 3:
                    encodedNumber="A" +encodedNumber;
                    break;
                case 4:
                    encodedNumber="@" +encodedNumber;
                    break;
                case 5:
                    encodedNumber="F" +encodedNumber;
                    break;
                case 6:
                    encodedNumber="K" +encodedNumber;
                    break;
                case 7:
                    encodedNumber="%" +encodedNumber;
                    break;
                case 8:
                    encodedNumber="R" +encodedNumber;
                    break;
                case 9:
                    encodedNumber="M"+encodedNumber;
                    break;
                default:
                    break;
            }
            number = number/10;
        }
//        encodedNumber = new StringBuffer(encodedNumber).reverse().toString();
        if(firstDigit%2==0 && lastDigit%2==0 && lastDigit!=0){
            encodedNumber = encodedNumber.substring(1, size-1);
            encodedNumber = "$" + encodedNumber + "$";
        }
        if(firstDigit%2!=0 && lastDigit%2!=0 && lastDigit!=0){
            encodedNumber = encodedNumber.substring(1, size-1);
            encodedNumber = "X" + encodedNumber + "X";
        }
        if(lastDigit==0){
            encodedNumber = encodedNumber.substring(0, size-1);
            encodedNumber = encodedNumber + "#";
        }
        System.out.println("Your encoded number: " + encodedNumber);
    }
}
