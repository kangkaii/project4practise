package kk.practise.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by  kk on 2017/9/26.
 */


public class NumberUtils {
    /**
    * Description:生成指定长度，指定区间的数组
    * @param1 int startNo
    * @param2 int endNo
    * @param3 int length
    * @return
    */
    static int[] getRandomNumber(int startNo,int endNo,int length){
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = NumberUtils.getRandomNo(startNo,endNo);
        }
        return array;
    }

    /**
    * Description:生成指定区间的随机数
    * @param1 int startNo ,指定开始
    * @param2 int endNo ,指定结束
    * @return int num
    */
    private static int getRandomNo(int startNo,int endNo){
        //Math.random() 生成一个 0-1 double 类型的随机数
        int returnNo = (int)(Math.random()*(endNo-startNo+1))+startNo;
        return returnNo;
    }


    /**
    * Description:打乱传入参数（数组的）的顺序
    * @param: Object[] array
    * @return int[] array
    */
    public static  Object[] getRandomArray(Object[] array){
        int length = array.length;
        Object[] resultArray = new Object[length];
        //生成一个随机数，用来取值
        Integer t1;
        //list用来装每次生成的随机数
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            t1 = NumberUtils.getRandomNo(0,length-1);
            //判断是否在list里面，如果在，重新生成
            while (true) {
                if (!list.contains(t1)) {
                    break;
                }else {
                    t1 = NumberUtils.getRandomNo(0,length-1);
                }
            }
            list.add(t1);
            //取到参数数组的某个值，赋值给，resultArray
            resultArray[i] = array[t1];
        }
        return resultArray;
    }

    /**
     * Description:打乱传入参数（数组的）的顺序
     * @param: int[] array
     * @return int[] array
     */
    public static  int[] getRandomArray(int[] array){
        int length = array.length;
        Object[] objectArray = new Object[array.length];
        //调用方法前，转成object类型
        for (int i = 0; i < array.length; i++) {
            objectArray[i] = array[i];
        }
        NumberUtils.getRandomArray(objectArray);
        int[] resultArray = new int[objectArray.length];
        for (int i = 0; i < objectArray.length; i++) {
            resultArray[i] = (int)objectArray[i];
        }
        return resultArray;
    }

    /**
     * Description:打乱传入参数（数组的）的顺序
     * @param: int[] array
     * @return int[] array
     */
    public static  String[] getRandomArray(String[] array){
        Object[] objectArray = new Object[array.length];
        //调用方法前，转成object类型
        for (int i = 0; i < array.length; i++) {
            objectArray[i] = array[i];
        }
        Object[] returnArray = NumberUtils.getRandomArray(objectArray);
        String[] resultArray = new String[objectArray.length];
        for (int i = 0; i < objectArray.length; i++) {
            resultArray[i] = (String) returnArray[i];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        Object[] objectArray = new Object[array.length];
        //调用方法前，转成object类型
        for (int i = 0; i < array.length; i++) {
            objectArray[i] = array[i];
        }
        Object[] resultAaray = NumberUtils.getRandomArray(objectArray);
        System.out.println(Arrays.asList(resultAaray));
    }
}

