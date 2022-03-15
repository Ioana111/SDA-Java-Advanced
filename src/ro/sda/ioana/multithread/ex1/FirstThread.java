package ro.sda.ioana.multithread.ex1;

import java.beans.IntrospectionException;

public class FirstThread extends  Thread{

    private String startUpMessage;

    public FirstThread(String startUpMessage){
        this.startUpMessage = startUpMessage;
    }

    @Override
    public void run(){
        try {
            System.out.println("Hello from 1st thread " + startUpMessage);
            Thread.sleep(1000);
            System.out.println("Hello from 1st thread " + startUpMessage);
            Thread.sleep(1000);
            System.out.println("Hello from 1st thread " + startUpMessage);
            Thread.sleep(1000);
        }
        catch   (InterruptedException e){
            e.printStackTrace();
        }
    }


}
