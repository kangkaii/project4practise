package kk.practise.递归;

/**
 * @author kangkai on 2017/12/8.
 */
public class 斐波那契数列 {
    //第一和第二项是1，后面每一项是前二项之和，即1，1，2，3，5，8，13,...。
    //递归实现:
    public static int[] fun01(int n) {//n是第n个数，从 0 开始
        int[] array = new int[n];//
        if (n == 0) {
            array[0] = 1;
        }
        if (n == 1) {
            array[1] = 1;
        }
        array[n] = fun01(n-1)[1] + fun01(n-2)[1];
        return array;
    }

    public static int fun02(int n) {
        if (n > 1) {
            return (fun02(n-1) + fun02(n-2));
        }else {
            return 1;
        }
    }

    public static int fun03(int n) {
        if (n == 0) {
            System.out.println(1);
            return 1;
        }
        if (n == 1) {
            System.out.println(1);
            return 1;
        }else {
            System.out.println(fun03(n-1) + fun03(n-2));
            return fun03(n-1) + fun03(n-2);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            System.out.println(fun02(i));
        }
    }
}
