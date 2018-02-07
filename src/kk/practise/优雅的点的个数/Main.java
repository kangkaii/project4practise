package kk.practise.优雅的点的个数;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/2.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();//目标数字

        int count = 0;//符合条件的点的个数

        for (int i = 0; i <= m; i++) {
            for (int j = m; j >= 0; j--) {
                if (i*i + j*j == m && i!= 0) {
                    count++;
                    System.out.println(i+","+j);
                }
            }
        }
        System.out.println(4*count);
    }



}
