package kk.practise.数组是否为引用传递;

/**
 * @author kangkai on 2017/11/10.
 */
public class Demo01 {

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6};
        int[] newArray;
        newArray = array;
        newArray[1] = 100;
        System.out.println(array[1]);//输出 ：100 （引用传递）
    }

}
