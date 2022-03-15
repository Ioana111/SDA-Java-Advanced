package ro.sda.ioana.exceptions.ex2;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {


        try {
            Person person = new Person("Geo", "Milica", Instant.now().plusSeconds(300));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
