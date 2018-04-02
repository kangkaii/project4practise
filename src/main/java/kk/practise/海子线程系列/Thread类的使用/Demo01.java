package kk.practise.海子线程系列.Thread类的使用;

/**此类说明，线程 sleep() 使线程进入睡眠，但不会释放对象的锁
 * @author kangkai on 2018/2/8.
 */
public class Demo01 {

    private int i = 10;
    private Object object = new Object();

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        MyThread thread01 = demo01.new MyThread();
        MyThread thread02 = demo01.new MyThread();
        thread01.start();
        //thread01.start();
        thread02.start();

    }


    class MyThread extends Thread{
        @Override
        public void run() {
            synchronized (object) {
                i++;
                System.out.println("i:"+i);
                try {
                    System.out.println("线程"+Thread.currentThread().getName()+"进入睡眠状态");
                    Thread.currentThread().sleep(10000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
                System.out.println("线程"+Thread.currentThread().getName()+"睡眠结束");
                i++;
                System.out.println("i:"+i);
            }
        }
    }

}


