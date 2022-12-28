package lv.tsi.producer_consumer;

public class Goods {
    int amount;
    public synchronized void produce(int amount) throws InterruptedException {
        while (this.amount != 0){
            wait();
        }
        this.amount += amount;
        notifyAll();
    }
    public synchronized int consume() throws InterruptedException {
        while (this.amount == 0){
            wait();
        }
        int consumed = this.amount;
        this.amount=0;
        notifyAll();
        return consumed;
    }
}
