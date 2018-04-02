package kk.practise.海子线程系列.生产者消费者模型;

import java.util.Queue;

/**
 * @author k@ngk@i on 2018/2/8.
 */
public class Producer implements Runnable{

    private final Queue<String> queue;

    private final int maxSize;

    public Producer(Queue<String> queue,int maxSize) {
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        product();
    }

    private void product() {
        //Producer producer = new Producer()
        try {

            while (true) {
                synchronized (queue) {
                    if (queue.size() == maxSize) {
                        System.out.println("当前仓库已满，等待消费者消费");
                        //使 当前线程 处于等待状态，等待的是：另一个线程调用notifyAll或者notify
                        queue.wait();
                    }
                    System.out.println("生产者：生产"+queue.add("product"));
                    //唤醒这个对象监视器上正在等待获取锁的所有线程
                    queue.notifyAll();
                }
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
