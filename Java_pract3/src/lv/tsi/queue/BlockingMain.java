package lv.tsi.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingMain {
    public static void main(String[] args) {
        final BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        AddingThread addingThread = new AddingThread(blockingQueue);
        TakingThread takingThread = new TakingThread(blockingQueue);
        addingThread.start();
        takingThread.start();
        // took first element of the queue
    }
}
