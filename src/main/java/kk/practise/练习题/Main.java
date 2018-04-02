package kk.practise.练习题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kangkai on 2017/11/3.
 */
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//学生的数量
        int m = sc.nextInt();//操作的数量
        //定义数组（学生的成绩）
        int[] array = new int[n];
        for (int i = 0;i < n ;i++) {
            array[i] = sc.nextInt();//存入学生的成绩
        }
        for (int i = 0;i < m ;i++) {//遍历所有操作
            String s = sc.next();
            if ("Q".equals(s)) {//查询操作
                int start = sc.nextInt();
                int end = sc.nextInt();
                int max = getMax(array,start,end);
                System.out.println(max);
            }
            if ("U".equals(s)) {//更新操作
                int a = sc.nextInt();
                int b = sc.nextInt();
                array[a-1] = b;
            }
        }

    }
    public static int getMax(int[] array,int a,int b) {
        //从 a - > b 的最大值
        //copy a-b
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int[] newArray = Arrays.copyOfRange(array,a-1,b);
        Arrays.sort(newArray);
        return newArray[b-a];
    }

}
