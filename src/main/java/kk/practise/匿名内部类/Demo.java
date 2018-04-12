package kk.practise.匿名内部类;

import org.junit.Test;

/**
 * Created by  kk on 2017/10/11.
 */
abstract class Person {//抽象类  Person
    public abstract void eat();//抽象方法 eat();
}

class Child extends Person {//一个 非 抽象类 继承了 抽象类，必须impl方法
    public void eat() {
        System.out.println("eat something");
    }
}

public class Demo {
    @Test
    public void test(){//使用子类来实现 调用Person类的方法
        Person p = new Child();
        p.eat();
    }

}
