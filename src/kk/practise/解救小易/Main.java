package kk.practise.解救小易;

import java.util.Scanner;

/**
 * @author kangkai on 2017/10/27.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        //int[][] array = new int[m][m];
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = scanner.nextInt();
        }
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            y[i] = scanner.nextInt();
        }
        //循环每一个坐标，找到距离小易 最近的一个。
        int count = x[0]-1+y[0]-1;
        for (int i = 0; i < m; i++) {
            if (count > x[i]-1+y[i]-1) {
                count = x[i]-1+y[i]-1;
            }
        }
        System.out.println(count);
    }


}
