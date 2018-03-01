package kk.practise.海子线程系列.基本介绍;

/**
 * 通过 实现 Runnable 接口创建线程
 *
 * @author kangkai on 2018/2/8.
 */
public class Demo03 {

    public static void main(String[] args) {

        System.out.println("主线程ID："+Thread.currentThread().getId());
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable,"thread01");
        thread.start();
        //System.out.println("子线程name"+thread.getName());
    }

}

class MyRunnable implements Runnable {
    public MyRunnable() {

    }

    @Override
    public void run() {
        System.out.println("子线程ID："+Thread.currentThread().getId());
    }

}
