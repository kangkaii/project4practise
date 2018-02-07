package kk.practise.m到n的所有水仙花数;

import java.util.Scanner;

/**
 * @author kangkai on 2017/10/27.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.print(getNumbers(m,n));
        //System.out.println(test());
    }

    public static String getNumbers(int m,int n) {
        //再m,n中找到所有的水仙花数，包括m，包括n
        StringBuilder sb = new StringBuilder("");
        for (int i = m; i <= n; i++) {
            if (judge(i)) {
                sb.append(i+" ");
            }
        }
        return "".equals(sb.toString())?"no" : sb.toString().substring(0,sb.length()-1);
    }
    static String test() {
        StringBuilder sb = new StringBuilder("");
        return "".equals(sb.toString())? "yes":"no";
    }

    //判断一个数，是否是水仙花数
    public static boolean judge(int a) {//100-999
        boolean b = false;
        int first = a/100;//第一位
        int second = (a-first*100)/10;//第二位
        int third = a%10;//第三位
        if (a == ((first*first*first)+(second*second*second)+(third*third*third))) {
            b = true;
        }
        return b;
    }
}
