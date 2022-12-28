package lv.tsi.priority;

public class PriorityThread extends Thread {
    String name;
    PriorityThread(String str) {
        name =str;
    }
    @Override
    public void run(){
        for(int l=1;l<=100;l++) {
            System.out.println(this.name + "(" + l + " iteration)");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static class PriorityMain{
        public static void main(String[] args) {
            PriorityThread min = new PriorityThread("min");
            PriorityThread max = new PriorityThread("max");
            PriorityThread norm = new PriorityThread("norm");
            min.setPriority(MIN_PRIORITY);
            max.setPriority(MAX_PRIORITY);
            norm.setPriority(NORM_PRIORITY);
            min.start();
            max.start();
            norm.start();
        }
    }
}
