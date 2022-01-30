package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The task:
 * Body Mass Index (BMI) helps in specifying the weight category a person
 * belongs to, depending on their body weight. BMI is estimated using the following formula:
 * BMI = Weight in kilograms / (Height in meters)2
 * Write a program that calculates and outputs the BMI. Assume various input values wherever required.
 */

public class ex1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Type your weight in kg");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int weight = Integer.parseInt(br.readLine());
        System.out.println("Type your height in m");
        double height = Double.parseDouble(br.readLine());
        double bmi = weight/(height*height);
        System.out.printf("Your BMI is %.1f" , bmi);
    }
}
