package kk.practise.四种方法引用类型.构造方法引用.数组构造方法引用;

import java.util.function.IntFunction;

/**
 * Created by kk on 2017/10/13.
 */
public class Demo {

    IntFunction<int[]> arrayMaker = int[]::new;
    int[] array = arrayMaker.apply(10); // 创建数组 int[10]

}
