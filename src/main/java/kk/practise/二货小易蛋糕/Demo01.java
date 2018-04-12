package kk.practise.二货小易蛋糕;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/7.
 */
public class Demo01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        //int[][] array = new int[w+1][h+1];
        int count = 0;
        for (int i = 0; i < w; i++) {
            if (i%4 == 0 || i%4 == 1) {
                for (int j = 0; j < h; j++) {
                    if (j%4 ==0 || j%4 == 1) {
                        count++;
                    }
                }
            }
            else {
                for (int j = 0; j < h; j++) {
                    if (j%4 ==2 || j%4 == 3) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }


}
