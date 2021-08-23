package ch4.ex5;

public class WordCountDemo {
    public static void main(String[] args) {
        WordCount wc = new WordCount();
        wc.incCounter();
        wc.displayCount();
        wc.incCounter();
        wc.displayCount();
        wc.dscCounter("Asdff");
        wc.displayCount();
        wc.dscCounter("asadad");
        wc.displayCount();
    }
}
