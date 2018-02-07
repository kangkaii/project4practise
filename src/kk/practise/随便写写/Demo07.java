package kk.practise.随便写写;

import java.util.Vector;

/**
 * @author kangkai on 2017/12/4.
 */

interface Person {
    public abstract void eat();
}

public class Demo07 {
    public static void main(String[] args) {
        //Vector
        Person p = new Person() {
            public void eat() {
                System.out.println("eat something");
            }
        };
        p.eat();
    }
}
