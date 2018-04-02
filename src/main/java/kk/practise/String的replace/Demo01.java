package kk.practise.String的replace;

/**
 * @author kangkai on 2017/10/30.
 */
public class Demo01 {

    /*public static void main(String[] args) {
        String str = "ajksdajlks";
        String s = str.replace('a','1');
        System.out.println(str);//str没有改变
        System.out.println(s);//s是改变后的str
    }*/

    public static void main(String[] args) {
        String str = "ajksdajlks";
        String newStr = str.replace('a','1');
        System.out.println(newStr);//newStr
        System.out.println(str);//str没有改变
    }

}
