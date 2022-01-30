package ch14;

import java.util.ArrayList;
import java.util.List;

/**
Write a computer program to make use of the dynamic data structure ArrayList
provided in Java. The program should create a list of items available in a departmental store. First add at least five items in the list. Then display those items.
Make use of the methods that can be used with an ArrayList to perform the following
operations:
a. Fetch the current number of elements available in the list.
b. Check for a particular item in the list.
c. Replace an item of a list with a new item.
Also, in the end convert the latest ArrayList in to an Array and display the items
that are available in the array.
 */
public class Chapter14Exercise1 {
    public static void main(String[] args) {
        List<String> availableItems = new ArrayList<>();
        availableItems.add("pencil");
        availableItems.add("knife");
        availableItems.add("tomatoes");
        availableItems.add("noodle");
        availableItems.add("beer");

        for (String str : availableItems) {
            System.out.println(str);
        }

        System.out.println();

        for (int i = 0; i < availableItems.size(); i++) {
            if (availableItems.get(i).equalsIgnoreCase("beer")) {
                availableItems.remove(i);
                availableItems.add(i, "notebook");
            }
        }

        String[] arr = new String[availableItems.size()];
        arr = availableItems.toArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
