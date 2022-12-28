package lv.tsi.sync;

public class TaskManager {
    public synchronized void performTask(int taskid) throws InterruptedException {
        System.out.println("thread name and the value of taskId: " + taskid);
        Thread.sleep(4);
        System.out.println("thread name and the value of taskId: " + taskid);
    }
}
