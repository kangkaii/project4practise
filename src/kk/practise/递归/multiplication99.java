package kk.practise.递归;

import org.junit.Test;

/**
 * @author by kangkai on 2017/10/17.
 */
public class multiplication99 {

    @Test
    public void test(){
        //getByFor(9);
        getByRecursion(9);
    }

    public static void getByFor(int n) {//for 循环实现
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" * "+j+" = "+i*j+" ");
            }
            System.out.println();
        }
    }

    public static void getByRecursion(int n) {//递归 实现
        if (n == 1) {
            System.out.println("1 * 1 = 1 ");
        }
        else {
            getByRecursion(n-1);
            for (int j = 1; j <= n; j++) {
                System.out.print(n+" * "+j+" = "+n*j+" ");
            }
            System.out.println();
        }
    }
}
