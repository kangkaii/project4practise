package kk.practise.再看排序算法的java实现;

/**
 * @author kangkai on 2018/2/6.
 */
public class 直接插入排序 {


    //基本法


    //二分法：
    /**
     * 通过将较大的元素都向右移动而不总是交换两个元素，这样访问数组的次数就能减半
     *
     * @param a
     */
    public static void sort2(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int num = a[i + 1];//拿到 数组的 第 2，3,4 个数
            for (int j = 0; j <= i; j++) {//对前面的数遍历
                if (num < a[j]) {//如果某个数 大于 num
                    for (int m = i; m >= j; m--) {//将 其后面所有的数 移动到 num后面
                        //关键在：默认前面的已经排序ok，只要找到>num的数，那么后面的数都>num
                        a[m + 1] = a[m];
                    }
                    a[j] = num;
                    break;
                }
            }
        }
    }
    public static void sort_2_kangkai(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int num = a[i+1];//拿出 num
            for (int j = 0; i < i; j++) {
                if (num < a[j]) {
                    for (int k = i; k >= j; k--) {
                        a[k+1] = a[k];
                    }
                    a[j] = num;//
                }
            }
        }
    }

    public static void sort_2_kangkai01(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int num = a[i+1];
            for (int j = 0; j < i; j++) {
                if (a[j] > num) {
                    for (int k = i; k >= j; k--) {
                        a[k+1] = a[k];
                    }
                    a[j] = num;
                }
            }
        }

    }
}
