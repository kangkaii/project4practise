package kk.practise.四种方法引用类型.构造方法引用.构造方法直接引用;

/**
 * Created by kk on 2017/10/13.
 */
public class MyClass {

    private int val;

    MyClass(int v) {
        val = v;
    }

    MyClass(){
        val = 0;
    }

    public int getValue() {
        return val;
    }

}
