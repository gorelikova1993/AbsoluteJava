package ch5.ex2;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void displayFraction() {
        System.out.println(numerator + "/" + denominator);
    }

    public boolean equals(Fraction aFraction) {
        int num1, den1;
        int num2, den2;
        int num5 = 1;
        for (int i = 2; i <= Math.min(numerator, denominator); i++) {
            if (numerator % i == 0 && denominator % i == 0)
                num5 = i;
        }
        num1 = numerator / num5;
        den1 = denominator / num5;
        int otherGcf = 1;
        for (int i = 2; i <= Math.min(aFraction.numerator, aFraction.denominator); i++) {
            if (aFraction.numerator % i == 0 && aFraction.denominator % i == 0)
                otherGcf = i;
        }
        num2 = aFraction.numerator / otherGcf;
        den2 = aFraction.denominator / otherGcf;
        return (num1 == num2 && den1 == den2);
    }

}
