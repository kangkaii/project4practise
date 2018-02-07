package kk.practise.final理解;

/**
 * @author kangkai on 2017/11/27.
 */
public class Demo03 {

    public static void main(String[] args) {
        int a = 1;
        System.out.println(change01(a)+","+a);

        StringBuffer b = new StringBuffer("1");
        System.out.println(change02(b)+","+b);

    }


    static int change01(int a) {
        a = a + 1 ;
        return a;
    }
    static String change02(final StringBuffer a) {//参数上加 final限制不了，对象的改变，可以限制的是 基本数据类型的重新赋值与对象的new 操作
        a.append("234");
        //a = new StringBuffer("1"); -->报错
        return a.toString();
    }
}
