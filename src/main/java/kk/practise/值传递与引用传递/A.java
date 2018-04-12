package kk.practise.值传递与引用传递;

/**
 * @author kangkai on 2017/10/23.
 */
public class A extends Object{

    private String name;

    public A(String name) {this.name = name;}

    public A() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
