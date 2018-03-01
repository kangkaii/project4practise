package kk.practise.海子线程系列.再看synchronized;

import java.util.ArrayList;
import java.util.List;

/**此例说明：synchronized(obj){doSomething} --->调用此方法块的线程
 * 会锁住obj(可能是个对象，也可能是个对象属性)，让其他线程无法访问！
 * 不管直接锁住对象还是锁住属性(即使这个属性没有任何用处) == 锁住了对象
 * 比 synchronized 直接修饰在方法上，更加灵活！
 * @author kangkai on 2018/2/9.
 */
public class Demo02 {

    public static void main(String[] args) {
        InsertData_fk insertData_fk = new InsertData_fk();
        new Thread() {
            @Override
            public void run() {
                insertData_fk.insert_fk(Thread.currentThread());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                insertData_fk.insert_fk(Thread.currentThread());
            }
        }.start();
    }

}

class InsertData_fk {
    private List<Integer> arrayList = new ArrayList<Integer>();
    final Object object = new Object();

    //使用 synchronized 代码块-----------------------------更加灵活
    // 使用 synchronized 代码块---> 参数为 object(类的属性)
    public void insert_fk(Thread thread) {
        synchronized (object) {
            for (int i = 0; i < 5; i++) {
                System.out.println(thread.getName() + "在插入数据" + i);
                arrayList.add(i);
            }
        }
    }

    // 使用 synchronized 代码块---> 参数为 this
    public  void insert(Thread thread) {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(thread.getName() + "在插入数据" + i);
                arrayList.add(i);
            }
        }
    }
}
