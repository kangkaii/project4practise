package kk.practise.调用Arrays的sort排序;

import java.util.Arrays;

/**
 * @author kangkai on 2017/11/3.
 */
public class Demo01 {

    public static void main(String[] args) {//正向排序

        int[] array = new int[]{8,1,2,3,4,5,6};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
