package kk.practise.Map测试;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kangkai on 2017/10/24.
 */
public class put方法的返回值 {
    //方式：
    //1, 将 a 赋值给 b , 再改变 a 的值, 输出 b , 判断是否 b 跟着 a 改变;
    //2, 将 a 当做参数传入 changeFunction(改变了 a, 并且 return a , 返回值 赋值给 b) ,判断 a 是否也被改变成了 b;

    static int changeInt(int a) { return a+11;}

    static X changeX(X x) {
        x.setValue("111111");
        return x;
    }

    static String changeString(String s) { return s+"1111";}

    static int[] changeArray(int[] array) {
        array[0] = 1111;
        return array;
    }

    public static void main(String[] args) {
        //对于基本数据类型
        int a = 1;
        int b = a;
        a = 2;
        System.out.println("a = "+a+" ,b = " + b);//相当于复制了 一个 1 给b，所以再怎么改变a的值，也不会影响b。
        int c = 1;
        int d = changeInt(c);
        System.out.println("c = "+c+" ,d = " + d);//传入了  的值的副本 , c 不会改变。


        //对于自定义对象
        X x1 = new X("x1");
        X x2 = x1;
        //System.out.println(x1.getValue()+","+x2.getValue());
        x1.setValue("xxx");
        System.out.println("x1 = "+x1.getValue()+" ,x2 = "+x2.getValue());//传递的是引用，并没有复制一个新的值，x2依然指向x1指向的值，x2跟着改变。
        X x3 = new X("x3");
        X x4 = changeX(x3);
        System.out.println("x3 = "+x3.getValue()+" ,x4 = " + x4.getValue());//同 x1 与 x2 ，传入的是引用，x3的 值会被改变

        //对于String类型
        String str1 = "aaaa";
        String str2 = str1;
        str1 = "sssss";
        System.out.println("str1 = "+str1+" ,str2 = " + str2);//传递的是引用，但是由于String的不可变，str = "ssss"过程中，
        // 没有改变aaaa,而是新增加了一个 ssss，并使str1指向 ssss,str2仍然指向aaaa;
        String str3 = "aaaa";
        String str4 = changeString(str3);//对str1与str2结论补充：str1 = "sssss"; 与 str3 被当做参数传入changeString()
        //前者相当于 str1 = new String("sssss") ，后者相当于 String s = new String(str3);
        System.out.println("str3 = "+str3+" ,str4 = " + str4);

        /*//对于ArrayList
        List<String> list1 = new ArrayList<>(10);
        list1.add("abc");
        List<String> list02 = list1;
        list1.set(0,"def");
        System.out.println(list02.get(0));//传递的是引用，与自定义对象类似*/

        //对于数组
        int[] array01 = new int[]{1,2,3,4,5,6};
        int[] array02 = array01;
        array01[0] = 100;
        System.out.println("array01[0] = "+array01[0]+" ,array02[0] = " + array02[0]);
        //传递的也是引用，即不同于基本数据类型的复制一份值的副本形式,类似于 自定义对象
        int[] array03 = new int[]{1,2,3,4,5,6};
        int[] array04 = changeArray(array03);
        System.out.println("array03[0] = "+array03[0]+" ,array04[0] = " + array04[0]);
        //同上


        /*Map<String,X> map = new HashMap(16);
        X x = new X("x");
        map.put("2",x);
        System.out.println(map.get("2").getValue());
        x.setValue("11111");
        System.out.println(map.get("2").getValue());//传递的是引用，值的改变，直接导致map里面

        List<X> list = new ArrayList<>(10);
        list.add(x);
        System.out.println(list.get(0).getValue());
        x.setValue("22222");
        System.out.println(list.get(0).getValue());*/

        /*List<String> list02 = new ArrayList<>(10);
        String str = "ABC";
        list02.add(str);
        str = "EFG";
        System.out.println(list02.get(0));*/

    }

}
