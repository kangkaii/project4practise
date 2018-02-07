package kk.practise.四种方法引用类型.特定实例对象的方法引用.实例上的实例方法引用;

import kk.practise.四种方法引用类型.静态方法引用.一.MyStringOps;
import kk.practise.四种方法引用类型.静态方法引用.一.StringFunc;

/**
 * Created by kk on 2017/10/13.
 */
public class MethodRefDemo2 {

    public static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "lambda add power to Java";
        MyStringOps strOps = new MyStringOps();//实例对象
        //strOps::strReverseP 相当于实现了接口方法func()
        String outStr = stringOp(strOps::strReverseP, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reserved: " + outStr);
    }

}
