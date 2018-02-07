package kk.practise.值传递与引用传递;

/**
 * @author kangkai on 2018/1/6.
 */
public class 再次测试01 {

    private static A getA() {
        A a = new A("123");
        return a;
    }

    public static void main(String[] args) {
        A a = getA();
        a.setName("456");
        A b = getA();
        System.out.println(b.getName());
    }

}
