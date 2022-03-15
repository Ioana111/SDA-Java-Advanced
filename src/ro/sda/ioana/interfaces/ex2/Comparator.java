package ro.sda.ioana.interfaces.ex2;

public class Comparator {
    public static void compareTwoObjects(Comparable o1, Comparable o2){
        if(o1.compareTo(o2) == 0){
            System.out.println(o1 + " is equal with " + o2);
        }
        if(o1.compareTo(o2) == -1){
            System.out.println(o1 + " is smaller than " + o2);
        }
        if(o1.compareTo(o2) == 1){
            System.out.println(o1 + " is bigger than " + o2);
        }
    }

}
