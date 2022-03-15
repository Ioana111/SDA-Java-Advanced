package ro.sda.ioana.multithread.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
         List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            threadList.add(new FirstThread("LOL" + i));
        }
        for (int i = 0; i < 3; i++) {
            threadList.add(new SecondThread());
        }

        for (Thread Thread : threadList) {
            Thread.start();
        }

    }
}
