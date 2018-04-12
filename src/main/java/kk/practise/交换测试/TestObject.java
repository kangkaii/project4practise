package kk.practise.交换测试;

/**
 * @author kangkai on 2017/10/25.
 */
public class TestObject {

    public static void main(String[] args) {
        Object a = 1;
        Object b = 2;
        change(a,b);
        System.out.println(a);
        System.out.println(b);
    }

    static void exChange(Object x,Object y){//实际上没有赋值，应该返回新的a，b
        Object temp = x;
        x = y;
        y = temp;
    }

    static void change(Object x,Object y){//实际上没有赋值，应该返回新的a，b
        x = 111111111;
        x = 222222222;
    }

}
