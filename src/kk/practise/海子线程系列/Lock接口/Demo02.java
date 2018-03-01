package kk.practise.海子线程系列.Lock接口;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**此例说明：
 * 简单的使用 tryLock() ！
 * 注意1：调用后 返回值 boolean 可以作为 获取成功标志
 * 注意2：需要写 else{} ---> 获取失败要做什么
 * @author kangkai on 2018/2/9.
 */
public class Demo02 {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private Lock lock = new ReentrantLock();    //注意这个地方

    public static void main(String[] args) {
        final Demo02 demo02 = new Demo02();

        new Thread() {
            @Override
            public void run() {
                demo02.insert(Thread.currentThread());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                demo02.insert(Thread.currentThread());
            }
        }.start();
    }

    public void insert(Thread thread) {
        if (lock.tryLock()) {
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
        } else {
            System.out.println(thread.getName() + "获取锁失败");
        }
    }
}
