package kk.practise.保留最大的数;

import java.util.Scanner;

/**
 * @author kangkai on 2017/10/27.
 */
public class Main {//思路错误：并不是最终要的结果（是从前向后 去掉n个最小数）
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();//目标数字
        int n = scanner.nextInt();//去除数字的数量
        String str = m+"";

        int count = 0;//记录在数组里面从0开始找到的最小值
        for (char j = '0'; count < n && j < '9'  ; j++) {
            for (int i = 0; i <= (n-count); i++) {//需要找到n个最小值，并且替换成 ' '
                if (str.charAt(i)==j) {
                    str = str.replaceFirst(Character.toString(j),Character.toString(' '));
                    count++;
                }
            }
        }
        System.out.println(str.replace(" ",""));
    }



}
