package kk.practise.break与continue;

/**
 * @author kangkai on 2017/12/1.
 */
public class Demo01 {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            if(i == 74) break; // Out of for loop------>直接跳出当前循环，下面的代码不再执行，for循环也结束
            if(i % 9 != 0) continue; // Next iteration------->直接跳出本次循环，下面的代码不再执行，继续下次；
            System.out.println(i);
        }
        int i = 0;
// An "infinite loop":
        /*while(true) {
            i++;
            int j = i * 27;
            if(j == 1269) break; // Out of loop
            if(i % 10 != 0) continue; // Top of loop
            System.out.println(i);
        }*/
    }
}
