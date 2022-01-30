package ch14.ex2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program that uses an ArrayList of parameter type Dictionary to store a
 * database of words. The Dictionary class should store the term and its synonyms.
 * Add appropriate accessor and mutator methods.
 * Your database program should present a menu that allows the user to add a term,
 * delete a term, display all terms, search for a specific term, or search for a specific
 * term and give the user the option to delete it. The search should find any term
 * where any instance variable contains a target search string. For example, if “Legacy”
 * is the search target, then the term should be displayed or deleted. Use the "foreach" loop to iterate through the ArrayList. The program should also check if
 * the user inputs only text and should prompt the user for “Invalid Input” if the
 * input is other than text.
 */
//TODO REFACTORING
public class Main {
    private static List<Dictionary> dictionaries = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        List<String> synonymsForNoodle = new ArrayList<>();
        synonymsForNoodle.add("pasta");
        synonymsForNoodle.add("macaroni");

        dictionaries.add(new Dictionary("noodle", synonymsForNoodle));
        Main main  = new Main();
        main.menu();


    }

    void menu() {
        boolean isExit  = false;

    while (!isExit) {
        System.out.println("Menu\n" +
                "1. add a term\n" +
                "2. delete a term\n" +
                "3. display all terms\n" +
                "4. search for a term\n" +
                "0. exit");

        String str = scanner.nextLine();
        if (str.matches("\\d")) {
            int chose = Integer.parseInt(str);
            switch (chose) {
                case 1:
                    addTerm();
                    break;
                case 2:
                    deleteTerm();
                    break;
                case 3:
                    displayAllTerms();
                    break;
                case 4:
                    searchTerm();
                    break;
                case 0:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid parameter");
                    break;
            }
        }
    }

    }

    private void searchTerm() {
        System.out.println("type a term");
        String term = scanner.nextLine();
        boolean isFound = false;
        for (Dictionary dic : dictionaries) {
            if (dic.getTerm().equalsIgnoreCase(term)) {
                System.out.println(
                        dic.getTerm() + "\n"
                                + "synonyms: " + dic.getSynonyms()
                );
                isFound = true;
            }
        }
        if (isFound) {
            System.out.println("Do you want to delete the term?\n" +
                    "Type 1 for yes, 2 for no ");
            String str = scanner.nextLine();
            if (str.matches("\\d")) {
                int choose = Integer.parseInt(str);
                if (choose == 1) {
                    for (int i = 0;  i < dictionaries.size(); i++) {
                        if(dictionaries.get(i).getTerm().equalsIgnoreCase(term)) {
                            dictionaries.remove(i);
                        }
                    }
                    System.out.println("The term was removed");
                }
            }
        } else {
            System.out.println("The term was not found");
        }
    }

    private void displayAllTerms() {
        for (Dictionary dictionary : dictionaries) {
            System.out.println(dictionary.getTerm() + "\n" + "" +
                    "synonyms: " + dictionary.getSynonyms().toString());
        }
    }

    private void addTerm() {
        System.out.println("type a term");
        String term = scanner.nextLine();
        System.out.println("type synonyms separated by semicolons");
        String synLine = scanner.nextLine();
        List<String> synonyms = new ArrayList<String>(Arrays.asList(synLine.split(";")));
        dictionaries.add(new Dictionary(term, synonyms));
    }

    private void deleteTerm() {
        System.out.println("type a term which you want to delete");
        String term = scanner.nextLine();
        boolean isFound = false;
        for (int i = 0;  i < dictionaries.size(); i++) {
            if(dictionaries.get(i).getTerm().equalsIgnoreCase(term)) {
                dictionaries.remove(i);
                isFound = true;
            }
        }
        if(isFound) {
            System.out.println("The term was removed");
        } else {
            System.out.println("the term was not found");
        }
    }
}
