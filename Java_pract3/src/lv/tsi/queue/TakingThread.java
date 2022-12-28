package lv.tsi.queue;

import java.util.concurrent.BlockingQueue;

public class TakingThread extends Thread{
    BlockingQueue<String> blockingQueue;
    TakingThread(BlockingQueue<String> blockingQueue){
        this.blockingQueue=blockingQueue;
    }
    @Override
    public void run(){
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(this.blockingQueue.take());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
