package kk.practise.四种方法引用类型.静态方法引用.二;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kk on 2017/10/12.
 */
public class UseMethodRef {

    public static int compareMC(MyClass a, MyClass b) {
        return a.getValue() - b.getValue();
    }

    @Test
    public void test() {
        List<MyClass> a1 = new ArrayList<>();
        a1.add(new MyClass(1));
        a1.add(new MyClass(4));
        a1.add(new MyClass(2));
        a1.add(new MyClass(9));
        a1.add(new MyClass(3));
        a1.add(new MyClass(7));
        //UseMethodRef::compareMC生成了抽象接口Comparator定义的compare()方法的实例。

        //使用内部类
        MyClass maxValObj01 = Collections.max(a1, new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
                return compareMC(o1,o2);
            }
        });
        System.out.println("Maximum value is: " + maxValObj01.getValue());

        //使用 lambda表达式 简化掉 内部类
        MyClass maxValObj02 = Collections.max(a1 ,(MyClass a,MyClass b) ->{
            return UseMethodRef.compareMC(a,b);
        });
        System.out.println("Maximum value is: " + maxValObj02.getValue());

        //使用 lambda表达式 简化掉 a,b 前面的声明
        MyClass maxValObj03 = Collections.max(a1 ,(a, b) ->{
            return UseMethodRef.compareMC(a,b);
        });
        System.out.println("Maximum value is: " + maxValObj03.getValue());

        //使用 lambda表达式 简化掉 a,b 前面的声明 , 简化掉 return
        MyClass maxValObj04 = Collections.max(a1,(a, b) -> UseMethodRef.compareMC(a,b));
        System.out.println("Maximum value is: " + maxValObj04.getValue());

        //简化掉 lambda表达式 -> 使用方法引用
        MyClass maxValObj05 = Collections.max(a1,UseMethodRef::compareMC);
        System.out.println("Maximum value is: " + maxValObj05.getValue());

    }


}
