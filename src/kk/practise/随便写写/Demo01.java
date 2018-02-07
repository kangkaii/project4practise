package kk.practise.随便写写;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kangkai on 2017/11/14.
 */
public class Demo01 {

    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,4,5,6,7};
        int[] b = new int[]{1,2,3,4,5,6,7};
        System.arraycopy(a,3,b,4,2);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(10);

    }

}
