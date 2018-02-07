package kk.practise.幸运数;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/2.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (f(i) == g(i)) {
                count++;
            }
        }
        System.out.println(count);

    }
    public static int f(int a) {//按照十进制拆分---->结果相加
        int sum = 0;
        while (a != 0) {
            sum += a%10;
            a = a/10;
        }
        return sum;
    }

    public static int g(int a) {//按照二进制拆分---->结果相加
        int sum = 0;
        while (a != 0) {
            sum += a%2;
            a = a/2;
        }
        return sum;
    }


}
