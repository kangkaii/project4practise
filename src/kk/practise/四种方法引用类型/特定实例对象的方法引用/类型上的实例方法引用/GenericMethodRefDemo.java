package kk.practise.四种方法引用类型.特定实例对象的方法引用.类型上的实例方法引用;

import org.junit.Test;

/**
 * Created by kk on 2017/10/13.
 */
public class GenericMethodRefDemo {

    public static <T> int myOp(StringFunc<T> f,T[] val,T v){
        return f.func(val,v);
    }

    @Test
    public void test() {
        Integer[] val = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] str = {"One", "Two", "Three", "Two"};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, val, 4);
        System.out.println("val contains "+count+" 4s");
        count = myOp(MyArrayOps::<String>countMatching, str, "Two");
        System.out.println("str contains "+count+" Twos");
    }

}
