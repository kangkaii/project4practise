package kk.practise.交换测试;

/**
 * Created by  kk on 2017/9/27.
 */
public class TestInt {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        change(a,b);
        System.out.println(a);
        System.out.println(b);
    }

    static void exChange(int x,int y){//实际上没有赋值，应该返回新的a，b
        int temp = x;
        x = y;
        y = temp;
    }

    static void change(int x,int y){//实际上没有赋值，应该返回新的a，b
        x = 111111111;
        x = 222222222;
    }
}
