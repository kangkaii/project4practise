package kk.practise.优雅的点的个数;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/2.
 */
public class Demo001 {
    //知识点1：Math.sqrt(int a)----->获取某个数的平方根(return double)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();//目标数字
        double r = Math.sqrt(m);//知识点1：直接得到半径
        int count = 0;
        //知识点2：高效循环---->计算 r的平方-i的平方 得到的数据，是不是整数的平方
        //知识点3：如何计算某个数是不是整数的平方--->Math.sqrt(m)后，得到的值，转成int是否==
        for (int i = 0; i < r; i++) {
            double j = Math.sqrt(m - i*i);//知识点2
            if ((int)j == j) {//知识点3
                count++;
            }
        }
        System.out.println(4*count);//count << 2
    }



}
