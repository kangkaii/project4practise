package kk.practise.四种方法引用类型.特定实例对象的方法引用.父类上的实例方法引用;

import kk.practise.四种方法引用类型.静态方法引用.一.MyStringOps;
import kk.practise.四种方法引用类型.静态方法引用.一.StringFunc;
import org.junit.Test;

/**
 * Created by kk on 2017/10/13.
 */
public class MethodRefDemo extends MyStringOps {

    public static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    @Test
    public void test() {
        String inStr = "lambda add power to Java";
        //super 调用父类
        //super::strReverseP 相当于实现了接口方法func()
        String outStr = stringOp(super::strReverseP, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reserved: " + outStr);
    }
}
