package ro.sda.ioana.generics.ex1;

public class Car implements Comparable<Car> {
    private int fullSpeed;
    private String name;

    public Car(int fullSpeed, String name) {
        this.fullSpeed = fullSpeed;
        this.name = name;
    }

    public int getFullSpeed() {
        return fullSpeed;
    }

    public void setFullSpeed(int fullSpeed) {
        this.fullSpeed = fullSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.fullSpeed, car.fullSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "fullSpeed=" + fullSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
