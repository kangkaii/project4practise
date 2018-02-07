package kk.practise.类的加载机制;

/**
 * @author kangkai on 2018/1/19.
 */
class SSClass {//最高层 父类
    static {
        System.out.println("SSClass init");
    }
    public SSClass(){
        System.out.println("顶层父类构造函数");
    }
}

class SuperClass extends SSClass {//中层 父类
    static {
        System.out.println("SuperClass init!");
    }
    public static int value = 123;
    public SuperClass() {
        System.out.println("中层父类构造函数");
    }
}

class SubClass extends SuperClass {//子类
    static {
        System.out.println("SubClass init");
    }
    static int a;
    public SubClass() {
        a = 3;
        System.out.println("子类构造函数");
    }
}

public class Demo01 {
    public static void main(String[] args) {
        //使用子类 去 调用 中层 父类的属性
        //SubClass subClass = new SubClass();
        //System.out.println(subClass.a);
        System.out.println(SubClass.value);
        char[] array = new char[]{'1','2'};
        String s = new String(array);
    }
}
