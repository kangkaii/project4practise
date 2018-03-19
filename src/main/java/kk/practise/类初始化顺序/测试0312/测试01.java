package kk.practise.类初始化顺序.测试0312;

/**最基本的 父类 - 子类 静态/普通/构造 调用顺序
 * ↓↓↓↓↓↓以下严格按照顺序执行↓↓↓↓↓↓
 * 父类 静态-->子类静态
 * 父类 普通-->父类构造
 * 子类 普通-->子类构造
 * @author kangkai on 2018/3/12.
 */
public class 测试01 {

    public static void main(String[] args) {

        SSS sss = new SS();
    }


}
class SSS{
    static {
        System.out.println("SSS的static块");
    }

    {
        System.out.println("SSS的普通块");
    }

    public SSS() {
        System.out.println("SSS的构造方法");
    }
}

class SS extends SSS{
    static {
        System.out.println("SS的static块");
    }

    public SS() {
        System.out.println("SS的构造方法");
    }

    {
        System.out.println("SS的普通块");
    }
}