package ch4;

import java.util.Scanner;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date() {
        month = 1;
        day = 1;
        year = 1000;
    }

    public Date(int mmInteger, int day, int year) {
        setDate(mmInteger, day, year);
    }

    public Date(String mmString, int day, int year) {
        setDate(mmString, day, year);
    }

    public Date(int year) {
        setDate(1, 1, year);
    }

    public Date(Date dd) {
        if (dd == null) {
            System.out.println("found Error.");
            System.exit(0);
        }

        month = dd.month;
        day = dd.day;
        year = dd.year;
    }

    public void setDate(int mmInteger, int day, int year) {

        if (dateConform(mmInteger, day, year)) {
            this.month = mmInteger;
            this.day = day;
            this.year = year;
        } else {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    public void setDate(String mmString, int day, int year) {

        if (dateConform(mmString, day, year)) {
            this.month = mmInteger(mmString);
            this.day = day;
            this.year = year;
        } else {
            System.out.println("found Error");
            System.exit(0);
        }
    }

    public void setDate(int year) {
        setDate(1, 1, year);
    }

    public void setYear(int year) {

        if (year < 1000 || year > 9999) {
            System.out.println("Error");
            System.exit(0);
        } else
            this.year = year;
    }

    public void setMonth(int monthNum) {

        if (monthNum <= 0 || monthNum > 12) {
            System.out.println("Error");
            System.exit(0);
        } else
            month = monthNum;
    }

    public void setDay(int day) {

        if (day <= 0 || day > 31) {
            System.out.println("Error");
            System.exit(0);
        } else
            this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return mmString(month) + " " + day + ", " + year;
    }

    public boolean equals(Date ddMatch) {
        return (month == ddMatch.month) && (day == ddMatch.day) && (year == ddMatch.year);
    }

    public boolean precedes(Date ddMatch) {
        return (year < ddMatch.year) || (year == ddMatch.year && month < ddMatch.month)
                || (year == ddMatch.year && month < ddMatch.month && day < ddMatch.day);
    }

    public void readInput() {
        boolean choice = true;
        Scanner scn = new Scanner(System.in);
        while (choice) {
            System.out.println("Enter a month number, day, and year.");
            System.out.println("Separate each by space.");
            int mm = scn.nextInt();
            int dd = scn.nextInt();
            int yy = scn.nextInt();
            if (dateConform(mm, dd, yy)) {
                setDate(mm, dd, yy);
                choice = false;
            } else
                System.out.println("Wrong enter, re-enter input.");
        }
    }

    private boolean dateConform(int mmInteger, int dayInt, int yearInt) {
        return mmInteger >= 1 && mmInteger <= 12 && dayInt >= 1 && dayInt <= 31 && yearInt >= 1000 && yearInt <= 9999;
    }

    private boolean dateConform(String mmString, int dayInt, int yearInt) {
        return monthOK(mmString) && dayInt >= 1 && dayInt <= 31 && yearInt >= 1000 && yearInt <= 9999;
    }

    private boolean monthOK(String mmString) {

        return mmString.equals("January") || mmString.equals("February") || mmString.equals("March")
                || mmString.equals("April") || mmString.equals("May") || mmString.equals("June")
                || mmString.equals("July") || mmString.equals("August") || mmString.equals("September")
                || mmString.equals("October") || mmString.equals("November") || mmString.equals("December");
    }

    private String mmString(int monthNum) {
        switch (monthNum) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                System.out.println("Fatal Error");
                System.exit(0);
                return "Error";
        }
    }

    private int mmInteger(String mmString) {
        if (mmString.equals("January"))
            return 1;
        else if (mmString.equals("February"))
            return 2;
        else if (mmString.equals("March"))
            return 3;
        else if (mmString.equals("April"))
            return 4;
        else if (mmString.equals("May"))
            return 5;
        else if (mmString.equals("June"))
            return 6;
        else if (mmString.equals("July"))
            return 7;
        else if (mmString.equals("August"))
            return 8;
        else if (mmString.equals("September"))
            return 9;
        else if (mmString.equals("October"))
            return 10;
        else if (mmString.equals("November"))
            return 11;
        else if (mmString.equals("December"))
            return 12;
        else
            return -1;
    }
}
