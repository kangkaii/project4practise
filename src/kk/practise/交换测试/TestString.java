package kk.practise.交换测试;

/**
 * @author kangkai on 2017/10/25.
 */
public class TestString {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";

        change(a,b);
        System.out.println(a);
        System.out.println(b);
    }

    static void exChange(String x,String y){//实际上没有赋值，应该返回新的a，b
        String temp = x;
        x = y;
        y = temp;
    }

    static void change(String x,String y){//实际上没有赋值，应该返回新的a，b
        x = "x";
        y = "y";
    }


}
