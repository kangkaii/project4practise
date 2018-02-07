package kk.practise.保留最大的数;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/2.
 */
public class Demo04 {//每次删除后，重头开始查找
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.next());//目标数字
        int n = scanner.nextInt();//去除数字的数量
        int count = 0;
        for (int i = 0; i < sb.length()-1 && count < n; i++) {
            if (sb.charAt(i) < sb.charAt(i+1)) {
                sb.deleteCharAt(i);
                i = -1;
                count++;
            }
        }
        if (count < n) {
            sb.delete(sb.length()-(n-count),sb.length());
        }
        System.out.println(sb.toString());

    }


}
