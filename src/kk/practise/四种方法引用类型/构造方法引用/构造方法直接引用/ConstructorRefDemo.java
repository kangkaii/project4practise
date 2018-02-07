package kk.practise.四种方法引用类型.构造方法引用.构造方法直接引用;

import org.junit.Test;

/**
 * Created by kk on 2017/10/13.
 */
public class ConstructorRefDemo {

    @Test
    public void test() {
        MyFunc1 myClassCons = MyClass :: new;
        //MyFunc1 myClassCons02 () -> new MyClass();
        MyClass mc = myClassCons.func(100);
        System.out.println("val in mc is: " + mc.getValue());

    }

}
