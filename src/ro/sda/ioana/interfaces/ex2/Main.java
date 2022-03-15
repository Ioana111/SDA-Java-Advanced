package ro.sda.ioana.interfaces.ex2;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(16);
        Person person2 = new Person(45);

        Comparator.compareTwoObjects(person1, person2);
    }
}
