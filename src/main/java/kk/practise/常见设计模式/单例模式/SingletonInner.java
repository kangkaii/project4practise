package kk.practise.常见设计模式.单例模式;

/**此例：使用内部类 实现单例模式（饿汉）
 * 达到延迟加载的目的
 * @author kangkai on 2018/3/15.
 */
public class SingletonInner {


    // private static 内部类，延迟加载
    private static class SingletonInnerHolder {
        private static SingletonInner instance = new SingletonInner();
    }

    //SingletonInner 的私有构造函数---> 内部类可以访问
    private SingletonInner() {
    }

    public static SingletonInner getInstance() {
        return SingletonInnerHolder.instance;
    }

    public void method() {
        System.out.println("this is SingletonInner");
    }

}
class Test_SingletonInner{
    public static void main(String[] args) {
        SingletonInner.getInstance().method();
    }
}
