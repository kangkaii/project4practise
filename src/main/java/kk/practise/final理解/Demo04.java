package kk.practise.final理解;

/**
 * @author kangkai on 2018/1/24.
 */
public class Demo04 {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String ab_add = a + b;
        String ab_new = "ab";
        System.out.println(ab_add == ab_new);//输出为 false

        final String  c = "c";
        String cd_add = c + "d";
        String cd_new = "cd";
        System.out.println(cd_add == cd_new);//输出为 true
    }
}
    /*private int a = 1;
    private final int b = 2;*/