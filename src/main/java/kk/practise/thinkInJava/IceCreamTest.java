package kk.practise.thinkInJava;

/**
 * @author kangkai on 2017/12/5.
 */
public class IceCreamTest {
    static String[] flav = {
            "Chocolate", "Strawberry",
            "Vanilla Fudge Swirl", "Mint Chip",
            "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };
    public static void main(String[] args) {
        int n = 18;
        while (true) {
            int m = (int)(Math.random() * flav.length);//随机了 [0,7]
            System.out.println(m);
            if (m == 7) {
                break;
            }
        }

        //System.out.println(Math.abs(n)% (flav.length + 1));//取余数；
    }

}
