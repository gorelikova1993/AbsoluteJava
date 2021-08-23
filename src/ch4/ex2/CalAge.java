package ch4.ex2;

public class CalAge {
    private int dayOfBirth;
    private String monthOfBirth;
    private int yearOfBirth;
    private int currentDay;
    private String currentMonth;
    private int currentYear;

    public CalAge(){

    }


    public void setBirthDate(int day, int month, int year){
        if(validDate(day, monthString(month), year)){
            this.dayOfBirth = day;
            this.monthOfBirth = monthString(month);
            this.yearOfBirth = year;
        } else {
        System.out.println("Fatal Error");
        System.exit(0);
    }
    }
    public void setCurrentDate(int day, int month, int year){
        if(validDate(day, monthString(month), year)) {
            this.currentDay = day;
            this.currentMonth = monthString(month);
            this.currentYear = year;
        }else {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }
    public int calAge(){
        if(yearOfBirth>0 && currentYear>0){
            return currentYear - yearOfBirth;
        }
        else{
            System.out.println("Please provide information");
            return 0;
        }
    }
    private String monthString(int monthNumber) {
        switch (monthNumber) {
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
                return "Error"; //to keep the compiler happy
        }
    }
    private boolean validDate(int day, String month, int year){
        if(year >= 1000 && year <= 9999) {
            if (month.equals("February") & (day > 0 && day < 29)) {
                return true;
            } else if ((month.equals("January") || month.equals("March") || month.equals("May")
                    || month.equals("July") || month.equals("August") || month.equals("October") || month.equals("December")) & (day > 0 && day < 32)) {
                return true;
            } else if ((month.equals("April") || month.equals("June") || month.equals("September")
                    || month.equals("November")) & (day > 0 && day < 31)) {
                return true;
            } else {
                return false;
            }
        }
        else{
            return false;
        }
    }
}
