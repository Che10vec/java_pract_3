package lv.tsi.sync;

public class TaskThread extends Thread {
    String name;
    TaskManager taskManager;
    int taskid;
    TaskThread(int taskid, TaskManager taskManager){
        this.taskid = taskid;
        this.taskManager=taskManager;
        name = Integer.toString(taskid);
    }
    @Override
    public void run(){
        try {
            taskManager.performTask(this.taskid);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
