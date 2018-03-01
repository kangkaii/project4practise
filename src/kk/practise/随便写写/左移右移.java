package kk.practise.随便写写;

/**
 * @author kangkai on 2018/1/24.
 */
public class 左移右移 {

    public static void main(String[] args) {

        /*int a = 2 >> 2;//10
        int b = 2 << 2;//10 ----> 1000 ----> 8
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        int maxInteger = Integer.MAX_VALUE >> 1;
        System.out.println(maxInteger);
*/
        int h = 11;
        System.out.println(h ^ (h >>> 16));
    }

}
