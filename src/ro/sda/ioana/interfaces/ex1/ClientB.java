package ro.sda.ioana.interfaces.ex1;

import java.time.Instant;

public class ClientB implements NotifyInterface{
    @Override
    public void notifyClient(Instant currentDateAndTime) {
        System.err.println(currentDateAndTime);
    }
}
