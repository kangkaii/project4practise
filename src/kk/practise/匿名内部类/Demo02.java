package kk.practise.匿名内部类;

import org.junit.Test;

/**
 * Created by  kk on 2017/10/11.
 */

public class Demo02 {//不使用子类 来实现对抽象类方法的调用
    @Test
    public void test(){
        Person person = new Person() {
            public void eat(){
                System.out.println("eat something");
            }
        };
        person.eat();

    }

}
