package ch4.ex4;

import ch4.Date;

public class JournalDemo {
    public static void main(String[] args) {
        Journal jn = new Journal("Dick", "akkskskjsf seiekeje ototoyo aha", new Date(1, 12, 2014));
        jn.displayDetails();
        System.out.println(jn.getSubmissionDetails());
    }
}
