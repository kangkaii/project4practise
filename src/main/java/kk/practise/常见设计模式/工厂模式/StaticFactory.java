package kk.practise.常见设计模式.工厂模式;

/**StaticFactory 常用的是 静态工厂模式
 * 一般工厂类不需要实例化
 * @author kangkai on 2018/3/15.
 */
public class StaticFactory {
    private StaticFactory(){}

    public static food getA(){  return new A(); }
    public static food getB(){  return new B(); }
    public static food getC(){  return new C(); }

}

interface food{}

class A implements food{}
class B implements food{}
class C implements food{}

class Client{
    //客户端代码只需要将相应的参数传入即可得到对象
    //用户不需要了解工厂类内部的逻辑。
    public void get(String name){
        food x = null ;
        if ( name.equals("A")) {
            x = StaticFactory.getA();
        }else if ( name.equals("B")){
            x = StaticFactory.getB();
        }else {
            x = StaticFactory.getC();
        }
    }
}
