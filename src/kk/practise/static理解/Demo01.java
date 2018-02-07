package kk.practise.static理解;

/**
 * @author kangkai on 2017/11/22.
 */
public class Demo01 {

    public static void main(String[] args) {
        Demo d01 = new Demo();
        Demo d02 = new Demo();
        d01.b = "123";//给d01的属性，赋值
        d02.b = "456";//给d02的属性，赋值
        System.out.println(d01.b+","+d02.b);//结果是 123,456
        d01.a = "123";//a是d01，d02共享的
        d02.a = "456";
        //Demo.a = "789";
        System.out.println(d01.a+","+d02.a+","+Demo.a);//结果是 456,456,456

        d02.fun01();//d02.时，只提示fun02,fun04---->因为他们都是非静态方法，但是通过对象去调用fun01，也可以调用。
        Demo.fun03();//Demo. 时，只提示fun01,fun03---->因为他们都是静态方法，只有静态方法可以由类名直接调用。

    }
}
class Demo{


    static String a;
    String b;

    public static void fun01 () {
        System.out.println(a);
    }
    public void fun02 () {
        System.out.println(a);
    }
    public static void fun03 () {
        //System.out.println(b);
    }
    public void fun04 () {
        System.out.println(b);
    }



}