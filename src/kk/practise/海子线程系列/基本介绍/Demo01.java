package kk.practise.海子线程系列.基本介绍;

/**
 * @author kangkai on 2018/2/8.
 */
public class Demo01 {

    public static void main(String[] args)  {
        MyThread01 thread01 = new MyThread01();
        thread01.start();
        MyThread01 thread02 = new MyThread01();
        thread02.start();

        /*MyThread02 thread03 = new MyThread03();
        thread03.run();*/
    }
}

class MyThread01 extends Thread{//创建线程的2种方式之一：继承`Thread`
    private static int num = 0;


    private String name;

    public MyThread01(String name){
        this.name = name;
    }

    public MyThread01(){
        num++;
    }

    @Override
    public void run() {
        System.out.println("主动创建的第"+num+"个线程");
    }
}

class MyThread02 implements Runnable{//创建线程的2种方式之一：实现`Runnable`
    private static int num = 0;

    public MyThread02(){
        num++;
    }

    @Override
    public void run() {
        System.out.println("主动创建的第"+num+"个线程");
    }
}
