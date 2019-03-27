package kk.practise.值传递与引用传递;

/**
 * @author kangkai on 2017/10/23.
 */
public class A extends Object{

    private String name;

    private B b;

    public A(String name) {this.name = name;}

    public A() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B getB1() {
        return b;
    }

    public A setB1(B b1) {
        this.b = b1;
        return this;
    }
    class B {
        private String a;

        public String getA() {
            return a;
        }

        public B setA(String a) {
            this.a = a;
            return this;
        }
    }
}
