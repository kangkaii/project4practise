package kk.practise.poker;

import kk.practise.utils.NumberUtils;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by  kk on 2017/9/26.
 */
public class Poker {
    /**
    * Description:生成三人，每人 共17张牌的算法
    * @param
    * @return List<int[]>
    */
    public static List<String[]> divideInto3(){
        String[] array1 = new String[]{"A-1","2-1","3-1","4-1","5-1","6-1","7-1","8-1","9-1","10-1","J-1","Q-1","K-1"};
        String[] array2 = new String[]{"A-2","2-2","3-2","4-2","5-2","6-2","7-2","8-2","9-2","10-2","J-2","Q-2","K-2"};
        String[] array3 = new String[]{"A-3","2-3","3-3","4-3","5-3","6-3","7-3","8-3","9-3","10-3","J-3","Q-3","K-3"};
        String[] array4 = new String[]{"A-4","2-4","3-4","4-4","5-4","6-4","7-4","8-4","9-4","10-4","J-4","Q-4","K-4"};
        String[] array5 = new String[]{"X","Y"};
        //合并
        int length = array1.length + array2.length + array3.length + array4.length + array5.length;
        String[] array6 = new String[length];
        for (int i = 0; i < length;) {
            for (int j = 0; j < array1.length;j++) {
                if (i < array1.length) {
                    array6[i] = array1[j];
                    i++;
                }
            }

            for (String s : array2) {
                if (i >= array1.length && i < array2.length + array1.length) {
                    array6[i] = s;
                    i++;
                }
            }
            for (String s : array3) {
                if (i >= array2.length + array1.length && i < array1.length + array2.length  + array3.length) {
                    array6[i] = s;
                    i++;
                }
            }

            for (String s : array4) {
                if (i >= array2.length + array1.length + array3.length && i < array1.length + array2.length  + array3.length + array4.length) {
                    array6[i] = s;
                    i++;
                }
            }
            for (String s : array5) {
                if (i >= array2.length + array1.length + array3.length + array4.length&& i < array4.length + array1.length  + array3.length + array2.length + array5.length) {
                    array6[i] = s;
                    i++;
                }
            }

        }
        System.out.println("总牌为："+Arrays.asList(array6));
        String[] returnArray = NumberUtils.getRandomArray(array6);
        String[] resultArrayOne = new String[length/3];
        String[] resultArrayTwo = new String[length/3];
        String[] resultArrayThree = new String[length/3];
        for (int i = 0; i < length; i++) {
            if (i < length/3) {
                resultArrayOne[i] = returnArray[i];
                continue;
            }
            if (i >= length/3 && i < length/3*2) {
                resultArrayTwo[i-length/3] = returnArray[i];
                continue;
            }
            else {
                resultArrayThree[i-length/3*2] = returnArray[i];
                continue;
            }
        }
        //对resultArrayOne排序，调用orderByFunctionOne
        Poker.orderByFunctionOne(resultArrayOne);
        Poker.orderByFunctionOne(resultArrayTwo);
        Poker.orderByFunctionOne(resultArrayThree);
        List<String[]> list = new ArrayList<>();
        list.add(resultArrayOne);
        list.add(resultArrayTwo);
        list.add(resultArrayThree);
        return list;
    }

    public static void main(String[] args) {
        List<String[]> list = Poker.divideInto3();
        System.out.println("牌型1"+Arrays.asList(list.get(0)));
        System.out.println("牌型2"+Arrays.asList(list.get(1)));
        System.out.println("牌型3"+Arrays.asList(list.get(2)));
    }


    /**
    * Description:将结果冒泡排序
    * @param： array
    * @return new array
    */

    private static void orderByFunctionOne(String[] array){
        for (int i = 0,length = array.length ; i < length-1; i++) {//共需要排几次，比如：三个数，排2次
            for (int j = 0;j < length-i-1; j++){//每次需要排的数量
                if (Poker.getIntByString(array[j]) < Poker.getIntByString(array[j+1])) {//小于，交换位置，大的在前面
                    Poker.exchangeStrByInt(array,j,j+1);
                }
            }
        }
    }

    /**
    * Description:交换
    * @param: String str
    * @return boolean
    */
    private static void exchangeStrByInt(String[] array,int a,int b){
        //String temp
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    /**
    * Description:返回字符串对应的 int数值
    * @param： str
    * @return int
    */

    private static double getIntByString(String str){
        //定义规则
        int result = 0;
        if (str.substring(0,1).equals("2")) {
            return 15 + getLast(str);
        }
        if (str.substring(0,1).equals("A")) {
            return 14 + getLast(str);
        }
        if (str.substring(0,1).equals("K")) {
            return 13 + getLast(str);
        }
        if (str.substring(0,1).equals("Q")) {
            return 12 + getLast(str);
        }
        if (str.substring(0,1).equals("J")) {
            return 11 + getLast(str);
        }
        if (str.substring(0,1).equals("1")) {
            return 10 + getLast(str);
        }
        if (str.substring(0,1).equals("9")) {
            return 9 + getLast(str);
        }
        if (str.substring(0,1).equals("8")) {
            return 8 + getLast(str);
        }
        if (str.substring(0,1).equals("7")) {
            return 7 + getLast(str);
        }
        if (str.substring(0,1).equals("6")) {
            return 6  + getLast(str);
        }
        if (str.substring(0,1).equals("5")) {
            return 5 + getLast(str);
        }
        if (str.substring(0,1).equals("4")) {
            return 4 + getLast(str);
        }
        if (str.substring(0,1).equals("3")) {
            return 3 + getLast(str);
        }
        if (str.substring(0,1).equals("X")) {
            return 100.0;
        }
        if (str.substring(0,1).equals("Y")) {
            return 200.0;
        }
        else {
            throw new RuntimeException("大小规则里面不包括此String");
        }
    }

    /**
    * Description:得到最后一位
    * @param
    * @return
    */
    private static double getLast(String str){
        String last = str.substring(str.length()-1,str.length());
        if (last.equals("1")) {
            return 0.1;
        }
        if (last.equals("2")) {
            return 0.2;
        }
        if (last.equals("3")) {
            return 0.3;
        }
        if (last.equals("4")) {
            return 0.4;
        }
        else {
            return 0.5;
        }
    }
}
