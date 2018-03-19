package kk.practise.类初始化顺序.测试0312;

/**此类说明：使用子类/父类声明 对初始化没有影响
 * 只是与实例化对象有影响
 * @author kangkai on 2018/3/12.
 */
public class 测试03 {
    public static void main(String[] args) {
        // A a = new B();
         B b = new B();
    }

}
class A{
    static{
        System.out.println("A init");
    }
    public A(){
        System.out.println("A Instance");
    }
}

class B extends A{
    static{
        System.out.println("B init");
    }
    public B(){
        System.out.println("B Instance");
    }
}
