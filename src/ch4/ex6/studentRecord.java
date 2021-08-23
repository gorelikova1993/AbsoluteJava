package ch4.ex6;

public class studentRecord {
    private int quiz1;
    private int quiz2;
    private int quiz3;
    private int midterm;
    private int exam;

    public String toString(){
        double numericGrade = finalWeightedGrade();
        return("Student Record: \nQuiz 1: " + quiz1 + " \nQuiz 2: "
                + quiz2 + " \nQuiz 3: " + quiz3 + " \nMidterm: " + midterm + " \nFinal Exam:  " + exam
                + " \nClass Numeric Grade " + numericGrade
                + " \nLetter Grade: " + letterGrade(numericGrade));
    }

    public void studentRecord(){
        quiz1 = 0;
        quiz2 = 0;
        quiz3 = 0;
        midterm = 0;
        exam = 0;
    }

    public studentRecord(int q1, int q2, int q3, int mt, int ex){
        midterm = mt;
        exam = ex;
        if(q1 > 100 || q1 < 0){
            System.out.println("Invalid quiz score: must be out of 100");
            System.exit(0);
        }else
        {
            quiz1 = q1;
        }
        if(q2 > 100 || q2 < 0){
            System.out.println("Invalid quiz score: must be out of 100");
            System.exit(0);
        }
        else{
            quiz2 = q2;
        }
        if(q3 > 100 || q3 < 0){
            System.out.println("Invalid quiz score: must be out of 100");
            System.exit(0);
        }
        else{
            quiz3 = q3;
        }
        if(mt > 100){
            System.out.println("Invalid midterm score: must be out of 100");
            System.exit(0);
        }
        else{
            midterm = mt;
        }
        if(ex > 100){
            System.out.println("Invalid final Exam score: must be out of 100");
            System.exit(0);
        }
        else{
            exam = ex;
        }
    }

    public double getQuizGrade(){
        return((quiz1 + quiz2 + quiz3) / 3) * 0.25;
    }


    public double getMidterm(){
        return midterm * 0.35;
    }

    public double getExam(){
        return exam * 0.4;
    }

    public double finalWeightedGrade(){
        return getQuizGrade() + getMidterm() + getExam();
    }

    public String letterGrade(double numericGrade){
        if (numericGrade >= 90){
            return "A";
        }
        else if (numericGrade < 90 && numericGrade >= 80){
            return "B";
        }
        else if (numericGrade < 80 && numericGrade >= 70){
            return "C";
        }
        else if (numericGrade < 70 && numericGrade >= 60){
            return "D";
        }
        else{
            return "F";
        }
    }
}
