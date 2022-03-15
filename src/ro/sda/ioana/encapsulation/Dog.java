package ro.sda.ioana.encapsulation;

public class Dog {

    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    public Dog(String name, int age, String gender, String race, double weight) {
        this.name = name;
        if (weight < 0) {
            System.err.println("Invalid age");
        } else {
            this.weight = weight;
        }        this.gender = gender;
        this.race = race;
        if (age < 0) {
            System.err.println("Invalid age");
        } else {
            this.age = age;
        }    }

    public Dog(String gender, String race) {
        this("Rex", 5, gender, race, 20.1);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("Invalid age");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.err.println("Invalid weight");
        } else {
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return "ro.sda.ioana.encapsulation.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}
