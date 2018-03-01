package kk.practise.海子线程系列.再看synchronized;

import java.util.ArrayList;
import java.util.List;

/**此例说明：方法被synchronized修饰后，一个对象的多个线程同时调用此方法时
 * 要按照顺序------> 1线程结束，开始2线程(不加 1 2 线程 同时进行，很可怕)
 * @author kangkai on 2018/2/9.
 */
public class Demo01 {


    public static void main(String[] args) {

        final InsertData insertData = new InsertData();
        //对象insertData 的 线程 1
        new Thread() {
            @Override
            public void run() {
                insertData.insert(Thread.currentThread());
            }
        }.start();

        //对象insertData 的 线程 2
        new Thread() {
            @Override
            public void run() {
                insertData.insert(Thread.currentThread());
            }
        }.start();
    }

}

class InsertData {
    private List<Integer> arrayList = new ArrayList<Integer>();
    Object object = new Object();
    //加 synchronized 后，可以让 某个对象的 有多个线程的时候
    //实现 1线程 调用方法结束后，2线程再调用
    //而不是，1 2 线程 同时调用
    public synchronized void insert(Thread thread) {
        for (int i = 0; i < 5; i++) {
            System.out.println(thread.getName() + "在插入数据" + i);
            arrayList.add(i);
        }
    }

}