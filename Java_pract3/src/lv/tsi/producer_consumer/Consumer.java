package lv.tsi.producer_consumer;

public class Consumer extends Thread{
    Goods goods;
    Consumer(Goods goods){
        this.goods = goods;
    }
    @Override
    public void run(){
        try {
            while (true){
                System.out.println("Consumed: "+this.goods.consume());
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

