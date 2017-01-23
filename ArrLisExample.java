package org.moro.pages;

import java.util.ArrayList;

/**
 * Created by eyal on 11/12/2016.
 */
public class ArrLisExample {



    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(100);
        list.add(99);
        list.add(100);
        list.add(99);

        // Get size and display.
        int count = list.size();
        System.out.println("Amount of elements Count = " + count);

        // Loop through lists.
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            System.out.println("current element list = " + value);
        }

        // Search for values.
        int index = list.indexOf(100);
        int lastIndex = list.lastIndexOf(100);
        int notFound = list.indexOf(200);

        // Display results.
        System.out.println(index);     // 1
        System.out.println(lastIndex); // 3
        System.out.println(notFound);  // -1
    }
}

