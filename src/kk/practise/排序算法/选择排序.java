package kk.practise.排序算法;

/**
 * Created by  kk on 2017/9/28.
 */
public class 选择排序 {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        int[] newArray = orderBySelectionFunctionTwo(array);
        System.out.print("从大到小顺序为：");
        for (int i = 0,length = newArray.length; i < length; i++) {
            System.out.print(newArray[i]);
        }
    }


    /**
    * Description:工作原理理解：初始时在序列中找到最大（小）元素，
     * 放到序列的起始位置；
     * 然后，再从剩余未排序元素中继续寻找最大（小）元素，
     * 再次放到序列的起始位置后一位。以此类推，直到所有元素均排序完毕
    * @param
    * @return
    */
    private static int[] orderBySelectionFunctionOne(int[] array){//选择排序
        int length = array.length;
        //记录开始索引
        int start = 0;
        while (start < length-1) {
            int max = array[start];
            //记录索引位置
            int n = start;
            for (int i = start+1; i < length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    n = i;
                }
            }
            //如果 array[start] 就是最大的------>不做交换---
            if (n != start) {
                changeArray(array,start,n);
            }
            start++;
            syso(start+1,array);
        }
        return array;
    }

    /**
     * Description:工作原理理解：初始时在序列中找到最大（小）元素，
     * 放到序列的起始位置；
     * 然后，再从剩余未排序元素中继续寻找最大（小）元素，
     * 再次放到序列的起始位置后一位。以此类推，直到所有元素均排序完毕
     * 改进：每次循环，找最大值+最小值；
     * @param
     * @return
     */
    private static int[] orderBySelectionFunctionTwo(int[] array){
        int length = array.length;
        int start = 0;
        int end = length-1;
        while (start < end) {
            int max = array[start];
            int min = array[end];
            int n = start;
            int m = end;
            for (int i = start; i <= end; i++) {
                //找 最大值，并给到start位置
                if (array[i] > max) {
                    //n 用来记录 i
                    max = array[i];
                    n = i;
                }
                //找 最小值，并给到end位置
                if (array[i] < min) {
                    //m 用来记录 i
                    min = array[i];
                    m = i;
                }
            }
            if (n != start) {
                changeArray(array,start,n);
            }
            if (m != end) {
                if (m != n && m != start) {
                    changeArray(array,end,m);
                }
            }
            start++;
            end--;
            syso(start,array);
        }


        return array;
    }



    static void changeArray(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    static void syso(int i,int[] array) {
        System.out.print("第"+i+"次:");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x]+" ");
        }
        System.out.println();
    }
}
