package kk.practise.final理解;

/**
 * @author kangkai on 2018/1/24.
 */
public class Demo05 {


    static {
        Demo05 demo05 = new Demo05();
    }
    Demo05() {
        System.out.println("a = "+a+" b = "+b);
    }

    public static void main(String[] args) {

    }

    static int a = 123;
    static final int b = 456;
}
