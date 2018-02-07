package kk.practise.平分苹果;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/2.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println(getCount(array));

    }

    public static int getCount(int[] array) {
        int length = array.length;
        int count = 0;
        //求和：是否可以平分 && 可以平分但差的数量是否为偶数
        int sum = array[0];
        for (int i = 1; i < length; i++) {
            sum += array[i];
        }
        if (sum%length != 0) {
            return -1;
        }
        else {
            for (int i = 0; i < length; i++) {
                if ((array[i]-(sum/length))%2 != 0) {
                    return -1;
                }
            }
        }
        int avg = sum/length;
        for (int i = 0; i < length; i++) {
            if (avg < array[i]) {
                count += (array[i]-avg)/2;
            }
        }
        return count;
    }

}
