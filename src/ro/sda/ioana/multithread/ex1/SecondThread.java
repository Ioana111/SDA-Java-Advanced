package ro.sda.ioana.multithread.ex1;

/**
 * - Inherit a class from Thread and override the run( ) method.
 * - Inside run( ), print a message, and then call sleep( ).
 * - Repeat this three times, then return from run( ).
 * - Put a start-up message in the constructor.
 * <p>
 * - Make a separate thread class that calls System.gc( ) inside run( ), printing a message as it does so.
 * - Make several thread objects of both types and run them to see what happens.
 * - Experiment with different sleep times to see what happens.
 */

public class SecondThread extends Thread {

    @Override
    public void run() {
        System.gc();
        System.out.println("hello from 2nd thread");
    }
}
