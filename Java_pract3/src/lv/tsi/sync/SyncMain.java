package lv.tsi.sync;

public class SyncMain {
    public static void main(String[] args) {
        final TaskManager taskManager = new TaskManager();
        TaskThread taskThread_1 = new TaskThread(1,taskManager);
        TaskThread taskThread_2 = new TaskThread(2,taskManager);
        taskThread_1.start();
        taskThread_2.start();
        /*
            before adding synchronised:
            thread name and the value of taskId: 1
            thread name and the value of taskId: 2
            thread name and the value of taskId: 1
            thread name and the value of taskId: 2
         */
        /*
            after adding synchronised:
            thread name and the value of taskId: 1
            thread name and the value of taskId: 1
            thread name and the value of taskId: 2
            thread name and the value of taskId: 2
         */
    }
}
