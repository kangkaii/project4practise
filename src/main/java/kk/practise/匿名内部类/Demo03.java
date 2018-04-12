package kk.practise.匿名内部类;

import org.junit.Test;

/**
 * Created by  kk on 2017/10/11.
 * Description : 演示了，在接口上使用匿名内部类
 */

interface Person03 {
    public void eat();
}

public class Demo03 {

    @Test
    public void test(){
        Person03 person03 = new Person03() {
            public void eat() {
                System.out.println("eat something");
            }
        };
        person03.eat();
    }

}
