package kk.practise.匿名内部类;

import org.junit.Test;

/**
 * Created by  kk on 2017/10/11.
 * Desc: Runnable接口的匿名内部类实现
 */
public class Demo05 {

    @Test
    public void test(){
        Runnable runnable = new Runnable(){
            public void run(){
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
            }
        };
        runnable.run();
    }


}
