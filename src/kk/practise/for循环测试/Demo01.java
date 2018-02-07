package kk.practise.for循环测试;

/**
 * @author kangkai on 2017/11/10.
 */
public class Demo01 {

    public static void main(String[] args) {
        int i ;
        for (i = 0; i < 10 && i != 5; i++) {;
            //只要达到第二个条件，直接跳出
        }
        System.out.println(i);
    }

}
