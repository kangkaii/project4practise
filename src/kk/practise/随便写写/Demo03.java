package kk.practise.随便写写;

/**
 * @author kangkai on 2017/11/15.
 */
public class Demo03 {

    public static void main(String[] args) {
        getCountByTime(331);
    }
    private static void getCountByTime(int time) {
        int left = 0;
        int right = 0;
        int a = 9;
        int j = 0;
        while (j < 10000) {
            for (int i = 0 , count = 0; count == 0; i++) {
                if ((int)(Math.random()*10) == a) {
                    count++;
                    if (i < time) {
                        left++;
                    }
                    else {
                        right++;
                    }
                }
            }
            j++;
        }
        System.out.println(time+"次之内概率："+left/10000.0);
//        System.out.println(time+"次之内："+left);
//        System.out.println(time+"次之外："+right);
    }

}
