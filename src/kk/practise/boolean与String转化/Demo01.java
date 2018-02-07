package kk.practise.boolean与String转化;

/**
 * @author kangkai on 2017/11/20.
 */
public class Demo01 {

    public static void main(String[] args) {

        boolean b = false;
        String str = b + "";
        System.out.println(str);
        String str2 = ((Object)b).toString();
        System.out.println(str2);
    }


}
