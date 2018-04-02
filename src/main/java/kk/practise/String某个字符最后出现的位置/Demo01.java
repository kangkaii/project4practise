package kk.practise.String某个字符最后出现的位置;

/**
 * @author kangkai on 2017/11/6.
 */
public class Demo01 {

    public static void main(String[] args) {

        String str = "1234\1234\1234";
        int a = str.lastIndexOf('\\');
        System.out.println(a);
    }

}
