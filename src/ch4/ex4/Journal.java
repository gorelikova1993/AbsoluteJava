package ch4.ex4;

import ch4.Date;

import javax.xml.stream.events.Characters;
import java.util.StringTokenizer;

public class Journal {
    private String author;
    private String title;
    private Date date;

    public Journal(String author, String title, Date date) {
        this.author = author;
        this.title = title;
        this.date = date;
    }
    public void displayDetails(){
        System.out.println("Author's name: " + author + "\nTitle of the paper: " + title + "\nDate published: " + date.toString() );
    }
    public String getSubmissionDetails(){
        String newTitle = title;
        StringTokenizer wordFactory = new StringTokenizer(title, " \n.,");
        while(wordFactory.hasMoreTokens()){
            String s = wordFactory.nextToken();
            String s2 = Character.toUpperCase(s.charAt(0)) + s.substring(1);
            newTitle = newTitle.replace(s,s2);
        }
        return newTitle;
    }
}
