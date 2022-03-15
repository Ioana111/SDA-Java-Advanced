package ro.sda.ioana.generics.ex1;

public class GenericMain {
    public static void main(String[] args) {

        Person person1 = new Person("Ioana", 1.73);
        Person person2 = new Person("Ileana", 1.92);
        Comparator<Person> comparator = new Comparator<>();
        comparator.compare(person1, person2);

        Car car1 = new Car(350, "Porche");;
        Car car2 = new Car(300, "Mercedes");;

        Comparator<Car> comparator1 = new Comparator<>();
        comparator1.compare(car1, car2);


    }


}
