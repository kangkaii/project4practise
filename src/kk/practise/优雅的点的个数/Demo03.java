package kk.practise.优雅的点的个数;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/2.
 */
public class Demo03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(count(n));
    }

    public static int count(int n) {
        int count = 0;
        double r = Math.sqrt(n);
        for (int i = 0; i < r; i++) {
            double j = Math.sqrt(n - i * i);
            if (Math.abs(j - Math.round(j)) <= 0.000000001) {
                count++;
            }
        }
        return 4 * count;
    }
}
