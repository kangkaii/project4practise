package kk.practise.final理解;

/**
 * @author kangkai on 2017/11/27.
 */
public class Demo01 {

    public static void main(String[] args) {//fianl修饰变量时，会把其当做常量

        String str = "1234";
        //final String str01 = "1234";
        final String a = "123";
        String a1 = "123";
        //String b = "4";
//        String x = a + b;
//        String t = a + b;
//        String y = a + "4";
        String y1 = a1 + "4";
        String y2 = a + "4";
        System.out.println(y1 == str);
        System.out.println(y2 == str);
        //String z = a + 4;
//        System.out.println(str == x);//false , 4 不是常量
//        System.out.println(str == t);//false , a1 不是常量
//        System.out.println(str == y1);//false
//        System.out.println(str == y);//true , final 告知编译器 "123"是常量，"4"也是常量
//        System.out.println(str == z);//true
//        System.out.println(x == t);//false , 给t赋值的时候，仍然要新创建 "1234";
//        System.out.println(x == y);
//        System.out.println(x == z);
//        System.out.println(y == z);
        //System.out.println(y == z);
    }

}
