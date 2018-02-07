package kk.practise.小东最少需要拉多少票才能让她获胜;

import java.util.Scanner;

/**
 * @author kangkai on 2017/10/26.
 */
public class Demo01 {//http://www.cnblogs.com/leesf456/p/5384566.html

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] candidate = new int[num];
        for (int i = 0; i < num; i++) {
            candidate[i] = scan.nextInt();
        }
        scan.close();
        int vote = candidate[0];//小东的票数
        int count = 0;//票数小于小东的人的，人数总和
        int index = 0;//
        for (int i = 1; i < candidate.length; i++) {
            if (candidate[i] > vote) {
                count++;//count：票数大于小东的人数；
                index += candidate[i];//index:大于小东票数的票数和；
            }
        }
        if (index == 0) {//小东就是最多的，直接return 0
            System.out.println(0);
        }
        else {
            int avg = (index + vote)%(count+1) <= 1?(index + vote)/(count+1)+1 : (index + vote)/(count+1)+2;//(小东票数 + 大于小东所有人的票数) /  1 + 大于小东所有人的人数
            System.out.println("小东最少需要让别人再投自己"+(avg-vote)+"票");
        }
    }

}
