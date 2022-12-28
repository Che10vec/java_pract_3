package lv.tsi.producer_consumer;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);
        producer.start();
        consumer.start();
    }
}
