package kk.practise.海子线程系列.synchronized的用法;

/** synchronized的用法
 * @author kangkai on 2018/2/8.
 */
public class Demo01 {
    public static void main(String[] args) {
        SyncThread syncThread = new SyncThread();
        //两个并发线程 ： thread1 与 thread2  ---> 他们同时访问了一个对象：syncThread
       /* Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread, "SyncThread2");
        thread1.start();
        thread2.start();*/
        //
        Thread thread3 = new Thread(new SyncThread(), "SyncThread3");
        Thread thread4 = new Thread(new SyncThread(), "SyncThread4");
        thread3.start();
        thread4.start();


    }

}

class SyncThread implements Runnable {//创建线程的2种方式之二：实现`Runnable`

    private static int count;

    public SyncThread() {
        count = 0;
    }

    @Override
    public void run() {
        //下方的代码块称之为：同步语句块
        synchronized(this) {//加了锁：同步锁，作用于调用此代码块的 `对象`
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);//让当前线程 sleep
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getCount() {
        return count;
    }
}
