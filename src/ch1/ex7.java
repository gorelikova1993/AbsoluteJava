package ch1;

public class ex7 {
    public static void main(String[] args) {
        double totalSeconds = 50391;
        int hours = (int) ((totalSeconds/60)/60);
        int minutes = (int) (totalSeconds/60 - hours*60);
        int seconds = (int) (totalSeconds - minutes*60 - hours*60*60);
        System.out.println("hours: " + hours + " minutes: " + minutes + " seconds: " + seconds);

    }
}
