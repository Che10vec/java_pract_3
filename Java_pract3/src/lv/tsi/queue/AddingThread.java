package lv.tsi.queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class AddingThread extends Thread {
    BlockingQueue<String> blockingQueue;
    AddingThread(BlockingQueue<String> blockingQueue){
        this.blockingQueue=blockingQueue;
    }
    @Override
    public void run(){
        for(int l=1;l<=3;l++){
            blockingQueue.add("Element" + l);
            System.out.println("Element" + l+" has been added");
        }
    }
}
