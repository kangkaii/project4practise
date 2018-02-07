package kk.practise.thinkInJava;

/**
 * @author kangkai on 2017/12/5.
 */
public class IceCream01 {

    //静态变量：
    static String[] flav = {
            "Chocolate", "Strawberry",
            "Vanilla Fudge Swirl", "Mint Chip",
            "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };

    public static String[] flavorSet(int n) {
        n = Math.abs(n)%(flav.length+1);//得到的是，n/9的余数
        String[] results = new String[n];//将要返回的结果
        int[] picks = new int[n];//将要返回的结果--->数字替代
        for(int i = 0; i < picks.length; i++){//给数字替代，赋值成 -1,-1,-1,-1....
            picks[i] = -1;
        }
        for (int i = 0; i < results.length; i++) {
            w:
            while (true) {
                int t = (int)(Math.random() * picks.length);
                for (int j = 0; j < i; j++) {
                    if (picks[j] == t) {
                        continue w;
                    }
                }
                //随机到了 不同的 t,（1，数字给picks,2，值给results）
                picks[i] = t;
                results[i] = flav[t];
                break;//跳出while
            }
        }
        return results;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++) {//循环调用。
            System.out.println(
                    "flavorSet(" + i + ") = ");
            String[] fl = flavorSet(flav.length);
            for(int j = 0; j < fl.length; j++)
                System.out.println("\t" + fl[j]);
        }
    }
}
