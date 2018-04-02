package kk.practise.递归;

import org.junit.Test;

/**
 * @author by kangkai on 2017/10/17.
 */
public class 阶乘 {

    @Test
    public void test() {
        //10! = 10 * 9 * 8 * 。。。。1；
        System.out.println(get(36));
    }

    public static long get(int n) {
        long result = 1;
        if (n == 1) {
            result *= 1;
        }
        else {
            result = n * get(n-1);
        }
        return result;
    }

}
