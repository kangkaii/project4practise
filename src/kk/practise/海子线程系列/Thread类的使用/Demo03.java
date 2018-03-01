package kk.practise.海子线程系列.Thread类的使用;

/**此例说明：interrupt() 可以中断处于  “阻塞状态(通过sleep() 实现)”  的线程
 * @author kangkai on 2018/2/9.
 */
public class Demo03 {

    public static void main(String[] args) {

        Demo03 demo03 = new Demo03();
        MyThread thread = demo03.new MyThread();
        thread.start();
        try {
            //使 main 线程 睡眠 2000毫秒
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {

        }
        thread.interrupt();
    }


    class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("进入睡眠状态");
            try {
                Thread.currentThread().sleep(5000);
                System.out.println("睡眠完毕");
            } catch (InterruptedException e) {
                System.out.println("线程异常终止");
            }
            System.out.println("线程的run方法执行完毕");
        }
    }
}
