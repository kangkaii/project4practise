package kk.practise.海子线程系列.生产者消费者模型;

import java.util.Queue;

/**
 * @author kangkai on 2018/2/8.
 */
public class Consumer implements Runnable{

    private final Queue<String> queue;

    //private final int maxSize;

    public Consumer(Queue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        consume();
    }

    private void consume() {

        while (true) {
            synchronized (queue) {
                if (queue.isEmpty()) {
                    System.out.println("消费者：仓库为空，等待生产者生产");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                queue.notifyAll();
                System.out.println("消费者消费：" + queue.remove());
            }
        }
    }
}
