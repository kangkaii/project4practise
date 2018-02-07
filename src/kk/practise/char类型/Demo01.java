package kk.practise.char类型;

/**
 * @author kangkai on 2017/10/30.
 */
public class Demo01 {

    public static void main(String[] args) {

        char c = '1';
        String str = "11113fsf";
        char s = str.charAt(1);
        System.out.println(c==s);//测试charAt返回的char c == (char c = '1')

        char h = ++c;//
        System.out.println(h);//输出h = 2
        System.out.println('2'==h);//输出h == 2，true

        char j = c++;
        System.out.println(h);//输出h仍然为1

        System.out.println(c++);
    }

}
