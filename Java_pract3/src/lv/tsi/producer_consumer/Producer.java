package lv.tsi.producer_consumer;

import java.util.Random;

public class Producer extends Thread {
    Goods goods;
    Producer(Goods goods){
        this.goods=goods;
    }
    @Override
    public void run(){
        Random random = new Random();
        try {
            while (true) {
                goods.produce(random.nextInt(10));
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
