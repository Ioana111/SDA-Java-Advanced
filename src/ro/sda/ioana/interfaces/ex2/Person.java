package ro.sda.ioana.interfaces.ex2;

public class Person implements Comparable {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Object o1) {
        return Integer.compare(this.age, ((Person)o1).getAge());
        //((Person)o1) am castat o1 sa fie obligatiu de tip Person
    }





    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }


}
