package kk.practise.类初始化顺序.测试0312;

/**此类用于测试：
 * 调用一个类的静态变量，会导致哪些方法被调用?
 * 如果是final修饰的变量，不会触发初始化
 * 如果不是final修饰，那么先调用其父类的静态块
 * 然后调用本类的静态块，其余不调用
 * @author kangkai on 2018/3/12.
 */
public class 测试02 {
    public static void main(String[] args) {
        System.out.println(AA.aa);
        //System.out.println(new AA().aaa);
    }

}
class AAA{

    static String aaa = "aaa";

    static {
        System.out.println("AAA的static块");
    }

    {
        System.out.println("AAA的普通块");
    }

    public AAA() {
        System.out.println("AAA的构造方法");
    }
}

class AA extends AAA{


    static {
        System.out.println("AA的static块");
    }

    public AA() {
        System.out.println("AA的构造方法");
    }

    {
        System.out.println("AA的普通块");
    }

    static String aa = "aa";

}