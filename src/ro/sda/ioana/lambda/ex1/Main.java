//package ro.sda.ioana.lambda.ex1;
//
//import java.util.function.Consumer;
//import java.util.function.Supplier;
//
///**
// * Write a program that reads a collection of strings, separated by one or more whitespaces, from the console and then prints
// * them onto the console. Each string should be printed on a new line. Use a Consumer<T>.
// * - Input: Pesho Gosho Adasha
// * - Output:
// * - Pesho
// * - Gosho
// * - Adasha
// */
//
//
//public class Main {
//
//    public static final String testValue = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
//
//    public static void main(String[] args) {
//        //stringFormat(word -> System.out.println(word));
////        stringFormat(word -> System.err.println(word));
////        stringFormat(word -> System.out.print(word));
////        stringFormat(word -> {
////            if (word.length() > 5) {
////                System.out.println(word);
////            }
////        });
//
//        stringFormater() -> new Random().nextInt
//    }
//
//
//    public static void stringFormat(Consumer<String> consumer) {
//        String[] arrayOfStrings = testValue.split(" ");
//
//        for (String element : arrayOfStrings) {
//            //  System.out.println(arrayOfString);
//            consumer.accept(element);
//        }
//    }
//
//
//    public static void stringFormater(Supplier<String> consumer) {
//        String[] arrayOfStrings = testValue.split(" ");
//
//        for (String element : arrayOfStrings) {
//            String value = element + supplier.get();
//            //System.out.println(element + valueFromSupplier);
//        consumer.accept(value);
//        }
//
//    }
//
//
//}
