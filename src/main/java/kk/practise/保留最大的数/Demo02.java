package kk.practise.保留最大的数;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/1.
 */
public class Demo02 {
    //只要发现一个数 小于其后面------>删除，直到 删除n个
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.next());//目标数字
        int n = scanner.nextInt();//去除数字的数量

        int count = 0;
        int t = 0;
        for (int i = 0; count < n && i < sb.length()-1; i++) {
            if (sb.charAt(i) == sb.charAt(i+1)) {
                t++;
            }
            if (sb.charAt(i) < sb.charAt(i+1)) {
                sb.deleteCharAt(i);
                count++;
                //i--;
                for (int j = 1; j <= t && count < n; j++) {
                    sb.deleteCharAt(i-j);
                    count++;
                    i--;
                }
                //i = i-t-1;
                t = 0;
                System.out.println("i="+i+",length()="+sb.length()+",sb="+sb);
            }
        }
        if (count < n) {//经过上面的循环后，剩下的 可能是 999888877776665554432221
            // n - count = 还需要删除的个数；
            sb.delete(sb.length()-(n-count),sb.length());
            //sb.delete(sb.length()-n,sb.length());
        }
        System.out.println(sb);
        System.out.println("结束length："+sb.length());
    }


}
