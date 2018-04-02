package kk.practise.排序算法;

import org.junit.Test;

/**
 * @author kangkai on 2017/10/17.
 */
public class 快速排序 {

    @Test
    public void test() {
        int[] array = new int[]{1,6,2,3,4,5,6};
        quickSort(array,0,array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
    * Description:快速排序的核心：递归实现
    * @param
    * @return
    */

    static void quickSort(int[] array,int left,int right) {
        if (left >= right) {// <=  ///   <
            return;
        }else {
            int n = changeArray(array,left,right);
            //n是 基准 位置：可以将 数组 一分 为 2
            //调用quickSort 给 n 左边排序
            quickSort(array,left,n-1);
            //调用changeArray 给 n 右边排序
            quickSort(array,n+1,right);
        }
    }



    /**
    * Description:对数组进行处理：定义 array[left]为基数，
     * 两端分别找 大于基数/小于基数的，放置在左/右
     * 最后，找到基数应该的位置，并放置基数；
     * 该方法会被递归调用
    * @param
    * @return
    */
    static int changeArray(int[] array,int left,int right) {
        while (left < right) {
            //            基 数 （这里默认为 第一个数 array[left]）
            int n = array[left];
            //right-- ，直到找到 array[right] < n(基数)
            while (right > left && array[right] <= n) {
                right--;
            }
            //找到符合的 right ; 赋值给 基数位置
            array[left] = array[right];
            //left++ ，直到找到 array[left] > n
            while (left < right && array[left] > n) {
                left++;
            }
            //找到符合的 left ; 赋值给 right位置
            array[right] = array[left];
            //循环结束： left == right
            //找到了 基数 应该放置的位置---------------------------
            array[left] = n;
        }
        return left;
    }







}
