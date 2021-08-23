package ch4.ex6;

import java.util.Scanner;

public class StudentRecordDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter in the first quiz score (out of 100): ");
        int quiz1 = (input.nextInt());

        System.out.println("Enter in the second quiz score (out of 100): ");
        int  quiz2 = input.nextInt();

        System.out.println("Enter in the third quiz score (out of 100): ");
        int quiz3 = input.nextInt();

        System.out.println("Enter in the Midterm score (out of 100): ");
        int midterm = input.nextInt();

        System.out.println("Enter in the Final Exam score (out of 100): ");
        int exam = input.nextInt();

        studentRecord newGrade = new studentRecord(quiz1, quiz2, quiz3, midterm, exam);
        System.out.println();
        System.out.println(newGrade);


    }
}
