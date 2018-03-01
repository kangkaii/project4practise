package kk.practise.海子线程系列.Lock接口;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**此例说明：lock 的用法
 * 注意 lock 应该定义在创建线程前
 * 如果定义在 方法中，每个线程获取的将是不同的锁
 * @author kangkai on 2018/2/9.
 */
public class Demo01 {

    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        final Demo01 test = new Demo01();


        new Thread() {
            @Override
            public void run() {
                test.insert(Thread.currentThread());
            }

            ;
        }.start();

        new Thread() {
            @Override
            public void run() {
                test.insert(Thread.currentThread());
            }

            ;
        }.start();
    }

    public void insert(Thread thread) {

        lock.lock();
        try {
            System.out.println(thread.getName() + "得到了锁");
            for (int i = 0; i < 5; i++) {
                arrayList.add(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println(thread.getName() + "释放了锁");
            lock.unlock();
        }
    }

}
