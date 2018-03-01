package kk.practise.海子线程系列.基本介绍;

/** 此例用于说明：start() 才是创建线程 而非 run()
 * @author kangkai on 2018/2/8.
 */
public class Demo02 {
    public static void main(String[] args)  {
        System.out.println("主线程ID:"+Thread.currentThread().getId());
        MyThread thread1 = new MyThread("thread1");
        //start()  可以创建一个新的线程
        thread1.start();
        MyThread thread2 = new MyThread("thread2");
        MyThread thread3 = new MyThread("thread3");
        thread2.start();
        // 只是 调用了方法。不会创建一个新的线程~
        thread3.run();

    }
}


class MyThread extends Thread{
    private String name;

    public  MyThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("name:"+name+" 子线程ID:"+Thread.currentThread().getId());
    }
}
