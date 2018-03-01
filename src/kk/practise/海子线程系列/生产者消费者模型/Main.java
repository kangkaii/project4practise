package kk.practise.海子线程系列.生产者消费者模型;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kangkai on 2018/2/8.
 */
public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        int maxSize = 100;
        Thread producer = new Thread(new Producer(queue,maxSize));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();
    }

}
