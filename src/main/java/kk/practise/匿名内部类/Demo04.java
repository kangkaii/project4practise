package kk.practise.匿名内部类;

import org.junit.Test;

/**
 * Created by  kk on 2017/10/11.
 *
 * Desc: Thread类 的匿名内部类实现
 */
public class Demo04 {

    @Test
    public void test(){
        Thread thread = new Thread(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.print(i + " ");
                }
            }
        };
        thread.start();
    }

}
