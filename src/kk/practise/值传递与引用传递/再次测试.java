package kk.practise.值传递与引用传递;

/**
 * @author kangkai on 2017/10/25.
 */
public class 再次测试 {

    public static void main(String[] args) {
        A a = new A("aaaa");
        change01(a);
        System.out.println(a.getName());
        System.out.println("-------------");
        change02(a);
        System.out.println(a.getName());
    }

    public static void change01(A a) {
        a.setName("xxxxx");
    }


    public static void change02(A a) {
        a = new A();
        a.setName("yyyyy");
    }
}
