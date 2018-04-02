package kk.practise.数组的clone;

import java.util.Arrays;

/**
 * @author kangkai on 2017/11/7.
 */
public class Demo01 {

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6};
        int[] newArray = new int[]{2,1,2,3,1,1};
        newArray = array.clone();
        for (int i = 0; i < 6; i++) {
            System.out.print(newArray[i]);
        }
    }

}
