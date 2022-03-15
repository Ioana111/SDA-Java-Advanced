package ro.sda.ioana.inheritance.ex1;
/*
Create a Shape class.
	a) Add fields, create constructor, getters and setters.
b) Create classes Rectangle and Circle. Both of them should inherit class Shape.
	Which fields and methods are common?
 */


public class Main {
    public static void main(String[] args) {
//        Shape circle = new Circle(10);
//        System.out.println(circle.getArea());
//        System.out.println(circle.getPerimeter());


        Shape rectangle = new Rectangle(10, 12);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());


    }
}
