package practice;

import java.util.ArrayList;

public class ColorArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colorList = new ArrayList<>();

        // Add colors to the ArrayList
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Orange");

        // Print out the collection
        System.out.println("Colors in the ArrayList:");
        for (String color : colorList) {
            System.out.println(color);
        }

        // Iterate through all elements in the ArrayList
        System.out.println("\nIterating through all elements:");
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println(colorList.get(i));
        }
    }
}