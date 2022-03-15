package ro.sda.ioana.inheritance.ex2;

/*Create classes Dog and Cat.
        a) Move common methods and fields to the class Animal.
        b) Create method „yieldVoice”.
*/

public class Animal {
    private int age;
    private double weight;

    public Animal(int age, double weight){
        this.age = age;
        this.weight = weight;
    }

    public void yieldVoice(){
        System.out.println();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
