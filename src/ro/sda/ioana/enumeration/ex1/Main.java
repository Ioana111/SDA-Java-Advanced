package ro.sda.ioana.enumeration.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planet [] planets = Planet.values();
        for(Planet elements: planets){
            System.out.println(elements.name());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert planet:");

        String planetName = scanner.nextLine().toUpperCase();
        Planet planet = Planet.valueOf(planetName);
        System.out.println(planet);
        System.out.println(planet.distanceFromEarth());
    }

}
