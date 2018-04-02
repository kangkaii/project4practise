package kk.practise.海子线程系列.再看synchronized;

/**
 * 此例说明：类锁 与 对象锁  不会互斥
 * 类锁：synchronized static 修饰的方法
 * 对象锁:synchronized 修饰的方法
 * 实现方式：线程1 调用 类锁(类锁要sleep)
 * 线程2 调用对象锁(调用开始 马上结束)
 * 故输出：线程1开始，线程2开始，2结束，1结束
 * @author kangkai on 2018/2/9.
 */
public class Demo03 {
    public static void main(String[] args) {
        InsertData01 insertData01 = new InsertData01();
        new Thread() {
            @Override
            public void run() {
                InsertData01.insert01();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                insertData01.insert02();
            }
        }.start();
    }
}


class InsertData01 {

    public synchronized static void insert01() {
        System.out.println("执行insert01");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行insert01完毕");

    }

    public synchronized void insert02() {
        System.out.println("执行insert02");

        System.out.println("执行insert02完毕");


    }
}
