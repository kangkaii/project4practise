package kk.practise.排序算法;

/**
 * Created by  kk on 2017/9/27.
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        //从大到小排序
        /*for (int i = 0,length = array.length; i < length-1; i++) {
            for (int j = 0; j < length-i-1; j++) {
                if (array[j] < array[j+1]) {
                    exchange(array,j,j+1);
                }
            }
        }*/
        int[] newArray = orderByTwo(array);
        System.out.print("从大到小顺序为：");
        for (int i = 0,length = newArray.length; i < length; i++) {
            System.out.print(newArray[i]);
        }
    }

    /**
    * Description:改进版冒泡排序,从低到高，再从高到底
    * @param： int[]
    * @return int[]
    */
    private static int[] orderBy(int[] array){
        int count = 0;//使用count来缩小范围
        for (int i = 0,length = array.length; i < length-1;i++) {
            for (int j = count; j < length-i-1; j++) {
                if (array[j] < array[j+1]) {//将小元素，向后放
                    exchange(array,j,j+1);
                }
            }
            for (int j = length-i-2; j >= count; j--) {
                if (array[j] < array[j+1]) {//将大元素，向前放
                    exchange(array,j,j+1);
                }
            }
            count++;
        }
        return array;
    }


    /**
    * Description:改进版冒泡排序,简单写法。。
    * @param： int[]
    * @return int[]
    */

    private static int[] orderByTwo(int[] array){
        int left = 0;
        int right = array.length-1;
        //while循环，成立条件 left<right
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (array[i] < array[i+1]) {//将小元素，向后放
                    exchange(array,i,i+1);
                }
            }
            for (int j = right-1; j > left-1; j--) {
                if (array[j] < array[j+1]) {//将小元素，向后放
                    exchange(array,j,j+1);
                }
            }
            left++;
            right--;
        }
        return array;



    }


    /**
    * Description:交换数组中2个索引位置对应数值
    * @param: int[] int a ,int b
    * @return void
    */

    static void exchange(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
     }

}
