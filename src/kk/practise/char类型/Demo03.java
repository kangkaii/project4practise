package kk.practise.char类型;

/**
 * @author kangkai on 2017/10/30.
 */
public class Demo03 {

    public static void main(String[] args) {
        char c = '1';
        int d = 1;
        char e = 1;
        char d1 = (char)d;
        System.out.println(e==d);//true
        System.out.println(c==d);//false
        System.out.println(c==e);//false
        System.out.println(d1==c);//false
//        System.out.println(c==d);//char c = '1' 是否 == int d = 1;
//        System.out.println((char)d-0);
//        System.out.println(c==((char)d-0));//char c = '1' 是否 == int d = 1;


    }


}
