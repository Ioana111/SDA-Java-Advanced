package ro.sda.ioana.generics.ex1;

public class Comparator<T extends Comparable<T>>{
//vreau sa am un T comparabil cu T, iar comparatorul are doar elemente comparabile cu T
 //T trb neaprat sa extinda Comparable, pt ca altfel nu pot folosi "compareTo"
    public void compare (T t1, T t2){
        int result = t1.compareTo(t2);
        if(result == 1){
            System.out.println(t1 + " is > than " + t2);
        }
        else if (result == -1) {
            System.out.println(t1 + " is < than " + t2);
        }else {
            System.out.println(t1 + " is = " + t2);
        }
    }


}
