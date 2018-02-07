package kk.practise.asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kangkai on 2017/10/23.
 */
public class Demo02 {

    public static void main(String[] args) {

        String[] array = new String[]{"1","2","3","4","5","6"};
        List<String> list = new ArrayList<>(10);
        List<String> sList = Arrays.asList(null);
        System.out.println(Arrays.asList(array));
        //、、、、、sList.add("1");

        sList.remove("1");

        int[] array02 = new int[]{1,2,3,4,5,6};
        Object list02 = Arrays.asList(array02);
        System.out.println(Arrays.asList(array02));

        char[] mChar = { 'a', 'b' };
        System.out.println(Arrays.asList(mChar));


    }


}
