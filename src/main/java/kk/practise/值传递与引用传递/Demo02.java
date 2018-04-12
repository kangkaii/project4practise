package kk.practise.值传递与引用传递;

/**
 * @author kangkai on 2017/10/23.
 */
public class Demo02 {

    //对于String(按值传递)
    public static void main(String[] args) {
        String a = "1";
        change(a);
        System.out.println(a);
    }

    public static void change(String a) {
        a = "2";
    }

}
