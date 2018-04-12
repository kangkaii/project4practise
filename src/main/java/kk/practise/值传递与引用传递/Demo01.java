package kk.practise.值传递与引用传递;

/**
 * @author kangkai on 2017/10/23.
 */
public class Demo01 {

    //对于基本数据类型(按值传递)
    public static void main(String[] args) {
          int a = 1;
          change(a);
          System.out.println(a);//输出1
    }

    public static void change(int a) {
        a = 2;
    }
}
