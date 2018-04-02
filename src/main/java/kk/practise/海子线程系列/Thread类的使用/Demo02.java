package kk.practise.海子线程系列.Thread类的使用;

/**此例说明：thread01.join() 作用是让“其他线程” 等待“thread01线程”执行完毕
 * @author kangkai on 2018/2/9.
 */
public class Demo02 {
    //Object object = new Object();
    public static void main(String[] args) throws InterruptedException {
        System.out.println("进入线程"+Thread.currentThread().getName());
        Demo02 demo02 = new Demo02();
        MyThread thread01 = demo02.new MyThread();
        thread01.start();
        System.out.println("线程"+Thread.currentThread().getName()+"进入等待");
        try {
            thread01.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程"+Thread.currentThread().getName()+"继续执行");
    }

    class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println("进入线程"+Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(0);
            }catch (InterruptedException e) {
                // todo
            }
            System.out.println("线程"+Thread.currentThread().getName()+"执行完毕");

        }



    }

}
