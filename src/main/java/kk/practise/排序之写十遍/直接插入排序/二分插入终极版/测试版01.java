package kk.practise.排序之写十遍.直接插入排序.二分插入终极版;

import java.util.Random;

/**遇到问题1：
 * 在 内层for循环中，不小心使用了外层for的因子 i，错误
 * 遇到问题2：
 * 递归需要 return ， 否则死循环
 * @author kangkai on 2018/3/12.
 */
public class 测试版01 {

    public static void main(String[] args) {
        int len = 100;
        int[] ary = new int[len];
        Random random = new Random();
        for (int j = 0; j < len; j++) {
            ary[j] = random.nextInt(1000);
        }
        binaryInsertSort(ary);
        /*
         * 复杂度分析： 最佳情况，即都已经排好序，则无需右移，此时时间复杂度为：O(n lg n) 最差情况，全部逆序，此时复杂度为O(n^2)
         *  无法将最差情况的复杂度提升到O(n|logn)。
         */
        // 打印数组
        printArray(ary);
    }


    public static void binaryInsertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int num = a[i];
            if (num < a[i-1]) {//升序
                int index = binarySearch01(a,num,0,i-1);
                for (int j = i; j > index; j--) {//index 后面的所有 右移 到 i
                    a[j] = a[j-1];
                }
                a[index] = num;
            }

        }

    }

    private  static int binarySearch(int[] a,int num,int from ,int to) {
        while (from <= to) {
            int mid = (from + to) >> 1;
            if (num < a[mid]) {//升序
                to = mid - 1;
            }else {
                from = mid + 1;
            }
        }
        return from;
    }
    //使用递归，升序
    private static int binarySearch01(int[] a,int num,int from ,int to) {
        while (from <= to) {
            int mid = (from + to) >> 1;
            if (num < a[mid]) {//升序
                return binarySearch01(a,num,from,mid-1);
            }else {
                return binarySearch01(a,num,mid+1,to);
            }
        }
        return from;
    }

    public static int binarySearchAsc(int[] a,int num,int from,int to) {
        while (from <= to) {
            int mid = (from + to) >> 1;
            if (a[mid] < num) {
                return binarySearchAsc(a,num,mid + 1,to);
            }else {
                return binarySearchAsc(a,num,from,mid - 1);
            }
        }
        return from;
    }

































    private static void printArray(int[] ary) {
        for (int i : ary) {
            System.out.print(i + " ");
        }
    }

}
