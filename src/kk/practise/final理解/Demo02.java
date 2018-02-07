package kk.practise.final理解;

import kk.practise.值传递与引用传递.A;

/**
 * @author kangkai on 2017/11/27.
 */
public class Demo02 {

    public static void main(String[] args) {//final 修饰的对象 虽然不能new , 但是属性可以更改
        final A a = new A("123");
        //a = new A();//报错
        a.setName("345");
        System.out.println(a.getName());
    }

}
