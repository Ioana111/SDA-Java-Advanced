package ro.sda.ioana.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("blue");
        colors.add("blue");
        colors.add("white");
        colors.add("red");
        colors.add("red");
        colors.add("verde");
        System.out.println(colors);
        String color = "violet";
        colors.add(color);

        if (colors.contains(color)) {
            System.out.println(color);
        }
        colors.remove("violet");

        for (String color1 : colors) {
            if (color1.startsWith("v")) {
                System.out.println(color1);
            }
        }
        colors.remove("white");

        if (colors.isEmpty()) {
            System.out.println("List in empty");
        } else {
            System.out.println("List is not empty");
        }

        Set<String> otherColors = new HashSet<>();
        otherColors.add("brown");
        colors.addAll(otherColors);
        System.out.println(colors);
        System.out.println(colors.containsAll(otherColors));//true
        otherColors.removeAll(colors);
        System.out.println(otherColors);
    }

}
