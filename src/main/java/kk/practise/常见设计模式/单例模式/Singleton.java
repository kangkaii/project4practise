package kk.practise.常见设计模式.单例模式;

/**
 * @author kangkai on 2018/3/15.
 */
public class Singleton {

    //静态实例
    private static Singleton instance;

    //私有构造方法 防止被实例化
    private Singleton() {}

    /* 1:懒汉式，静态工程方法，创建实例 */

    public static Singleton getInstance() {
        //这是懒汉式，可以延迟加载
        //如果是饿汉是，直接在声明时赋值 instance
        //此处不判断 直接return
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void method() {}
}
class Test{
    public static void main(String[] args) {
        //调用方式
        Singleton.getInstance().method();
    }
}
