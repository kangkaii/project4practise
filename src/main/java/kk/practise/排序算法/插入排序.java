package kk.practise.排序算法;

import java.util.Arrays;

/**
 * Created by  kk on 2017/9/28.
 */
public class 插入排序 {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,3,4,4,5,6,7};
        int[] newArray = insertFunction(array);
        System.out.print("从大到小顺序为：");
        for (int i = 0,length = newArray.length; i < length; i++) {
            System.out.print(newArray[i]+",");
        }
    }

    /**
    * Description:插入排序，从后向前，扫描，合适位置插入
    * @param
    * @return
    */

    private static int[] insertFunction(int[] array){//插入排序
        //第一次，直接默认第一个元素为已排序元素
        int length = array.length;
        for (int i = 1; i < length; i++) {//遍历每一个元素
            int k = i;//用 k 得到 i 的值 , k--
            while (k >= 1 && array[i] > array[k-1]) {
                k--;
            }
            //找到了 array[k-1] ,它后面的都要后移（并不包括k-1）
            //先将 array[i] 拿出来
            int temp = array[i];
            //从array[k]开始，向后移
            for (int j = i-1; j >= k; j--) {
                array[j+1] = array[j];
            }
            //将 array[i] 放在 array[k]
            array[k] = temp;
            syso(i,array);
        }
        return array;
    }

    /**
     * Description:插入排序，改进：减少比较的次数
     * 从中间开始，每次获取到的元素，大于中间元素，重新划分区间，再次取两端值
     * @param
     * @return
     */
    private static int[] insertFunctionTwo(int[] array){//插入排序
        //第一次，直接默认第一个元素为已排序元素
        //循环内容为：判断合适位置，插入
        int length = array.length;
        for (int i = 1; i < length; i++) {//对除了第一个以外的元素都要排序
            int left = 0;//左边界，0开始
            int right = i - 1;//右边界，i前面的元素结束
            int value = array[i];//把改值，取出，否则右移过程中，值被覆盖
            while (left <= right) {//限制条件：当不是一个范围，而是一个固定的索引的时候，跳出
                int mid = (left + right)/2;
                if (array[i] > array[mid]) {
                    //重新定义 "右" 边界
                    right = mid - 1;//已经判断出，边界值，接下来移动整体的时候包括边界，-1 ，减少了比较次数
                }
                else {
                    left = mid + 1;
                }
            }
            for (int j = i-1; j >= left; j--) {//包括边界的所有，向右移动
                array[j+1] = array[j];
            }
            array[left] = value;
        }
        return array;
    }


    private static int[] insertFunctionByShell(int[] array){
        int length = array.length;
        //int gap ,步长;
        for (int gap = length/2; gap > 0; gap /= 2) {// gap为步长，每次减为原来的一半。
            for (int i = 0; i < gap; i++) { // 共gap个组，对每一组都执行直接插入排序
                for (int j = i; j < length; j += gap) {//遍历:每个间隔gap的元素，组成的组
                    //对每个组里面的数据进行插入排序
                    if (j+gap < length && array[j] < array[j+gap]) {//找到array[j+gap]，寻找合适位置，插入
                        int temp = array[j+gap];//拿出array[j+gap]
                        int k = j;//用k代替j,防止j被改变
                        while (k >= 0 && array[k] < temp) {//满足该条件，需要后移
                            array[k+gap] = array[k];
                            k -= gap;
                        }
                        array[k+gap] = temp;//j+gap是把 k -= gap，减去的加回来
                    }
                }
            }
        }
        return array;
    }


    static void changeArray(int[] array,int a,int b){
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
