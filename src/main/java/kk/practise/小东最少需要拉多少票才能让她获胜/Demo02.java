package kk.practise.小东最少需要拉多少票才能让她获胜;

import java.util.Scanner;

/**
 * @author kangkai on 2017/10/26.
 */
public class Demo02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] candidate = new int[num];
        for (int i = 0; i < num; i++) {
            candidate[i] = scan.nextInt();
        }
        scan.close();
        int vote = candidate[0];
        int index = 0;
        int sum = vote;
        int lowSum = 0;
        int count = 0;
        for (int i = 1; i < num; i++) { // 获取票数总和、小于小东票数的人数、小于小东票数的票数总和
            sum = candidate[i];
            if (candidate[i] < vote) {
                lowSum = candidate[i];
                count++;
                index++;
            }
        }

        int res = sum - lowSum; // 剩余票数总和
        int ave = res / (num - count); // 剩余平均票数

        if (index == (num - 1)) { // 所有人的票数都比小东少，直接输出
            System.out.println(0 + "");
        } else { // 计算应该获取的票数
            System.out.println((ave - vote + 1) + "");
        }
    }

}
