package kk.practise.n个正整数.连接成一排.组成一个最大的多位整数;

import java.util.Scanner;

/**
 * @author kangkai on 2017/10/27.
 */
public class Demo01 {

    /*有多组测试样例，每组测试样例包含两行，
    * 第一行为一个整数N（N<=100），
    * 第二行包含N个数(每个数不超过1000，空格分开)。
    * */
    /*https://www.nowcoder.com/practice/a6a656249f404eb498d16b2f8eaa2c60?tpId=85&&tqId=29898&rp=1&ru=/activity/oj&qru=/ta/2017test/question-ranking
    * */
    /*public static void main(String[] args) {
        //n 个数(701,123,436,246)
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(getMaxNum(array));
    }*/
    public static void main(String[] args) {
        //n 个数(701,123,436,246)
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        sort(array,0,array.length-1);
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i]+"";
        }
        System.out.println(str);
    }

    public static String getMaxNum(int[] array) {
        //对这个数组，排序（规则为题目要求）
        //调用比较规则，排序
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length-i-1; j++) {
                if (!compare(array[j],array[j+1])) {
                    int tmep = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmep;
                }
            }
        }
        String str = "";
        for (int i = 0; i < length; i++) {
            str += array[i]+"";
        }
        return str;
    }
    public static void sort(int[] array,int start,int end) {
        if (start < 0 || start > end || end > array.length - 1){return;}
        int cen = array[start];
        int i = start;
        int j = end;
        while (i < j){
            while (i < j) {
                if (compare(array[j], cen)){
                    array[i] = array[j];
                    i++;
                    break;
                }
                else{j--; }
            }
            while (i < j){
                if (compare(cen, array[i])){
                    array[j] = array[i];
                    j--;
                    break;
                }
                else{i++; }
            }
        }
        array[i] = cen;
        sort(array, start, i - 1);
        sort(array, i + 1, end);
    }
    //2.比较规则
    public static boolean compare(int a,int b) {
        int[] arrayA = change2Array(a);
        int[] arrayB = change2Array(b);
        boolean boo = false;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] > arrayB[i]) {
                boo = true;
                break;
            }
            if (arrayA[i] < arrayB[i]) {
                boo = false;
                break;
            }
            else {
                continue;
            }
        }
        return boo;
    }


    //2.转换规则
    public static int[] change2Array(int a) {//返回固定length=3的数组
        if (0 <= a && a < 10) {//1位
            int one = a;
            return new int[]{one,one,one,one};
        }
        if (10 <= a && a < 100) {//2位
            int twoFirst = a/10;//第一位
            int twoSecond = a%10;//第二位
            return new int[]{twoFirst,twoSecond,twoFirst,twoFirst<twoSecond?2:0};
        }
        else {//3位
            int threeFirst = a/100;//第一位
            int threeSecond = (a-threeFirst*100)/10;//第二位
            int twoThird = a%10;//第三位
            return new int[]{threeFirst,threeSecond,twoThird,1};
        }
    }
}
