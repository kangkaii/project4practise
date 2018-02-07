package kk.practise.数组的copy;

import java.util.Arrays;

/**
 * @author kangkai on 2017/11/3.
 */
public class Demo01 {

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6};
        //copy 3-5
        int[] newArray = Arrays.copyOfRange(array,2,5);
        //copy的是：索引位置2--->索引位置4
        //不谈索引copy的是：第3个到第5个（需要copy第a个-第b个，from:a-1  to:b）
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

}
