package ro.sda.ioana.encapsulation;

public class Main {

    public static void main(String[] args) throws Exception {

        Dog dog = new Dog("Max", -7, "male", "Metis", 6.4);
        System.out.println(dog);

        dog.setAge(-4);
        dog.setWeight(-4);
        System.out.println(dog);

        Dog dog1 = new Dog("female", "ciobanesc");
        System.out.println(dog1);
    }
}
