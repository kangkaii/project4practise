package kk.practise.扑克牌大小比较;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/6.
 */
public class Demo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 按照 "-" 分割字符串
        String[] a = str.split("-");
        String sOne = a[0];
        String sTwo = a[1];
        String newsOne = sOne.replaceAll("10","t");
        String newsTwo = sTwo.replaceAll("10","t");
        newsOne = newsOne.replaceAll("JOKER","W");
        newsOne = newsOne.replaceAll("joker","w");
        newsTwo = newsTwo.replaceAll("JOKER","W");
        newsTwo = newsTwo.replaceAll("joker","w");
        String startOne = newsOne.substring(0,1);
        String startTwo = newsTwo.substring(0,1);
        int lenOne = newsOne.length();
        int lenTwo = newsTwo.length();
        if ("w W".equals(newsOne) || "w W".equals(newsTwo)) {//最先拿出 一对王
            System.out.println(newsOne.contains("w")? sOne : sTwo);
        }
        else if (lenOne == lenTwo) {//长度相同，可以直接比较第一张
            //String x = sOne.substring(0,1);
            //String y = sTwo.substring(0,1);
            if (compare(startOne,startTwo)) {//x > y
                System.out.println(sOne);
            }else {
                System.out.println(sTwo);
            }
        }
        else {//长度不同
            if (lenOne == 7 || lenTwo == 7) {
                System.out.println(lenOne == 7? sOne:sTwo);
            }else {
                System.out.println("ERROR");
            }
        }
    }
    //比较规则
    public static boolean compare(String sOne,String sTwo) {
        int iOne = getInt(sOne);
        int iTwo = getInt(sTwo);
        if (iOne < iTwo) {
            return false;
        }
        else {
            return true;
        }
    }
    //转化规则
    public static int getInt(String s) {
        if ("A".equals(s)) {
            return 111;
        }
        if ("2".equals(s)) {
            return 1111;
        }
        if ("3".equals(s)) {
            return 3;
        }
        if ("4".equals(s)) {
            return 4;
        }
        if ("5".equals(s)) {
            return 5;
        }
        if ("6".equals(s)) {
            return 6;
        }
        if ("7".equals(s)) {
            return 7;
        }
        if ("8".equals(s)) {
            return 8;
        }
        if ("9".equals(s)) {
            return 9;
        }
        if ("t".equals(s)) {
            return 10;
        }
        if ("J".equals(s)) {
            return 11;
        }
        if ("Q".equals(s)) {
            return 12;
        }
        if ("K".equals(s)) {
            return 13;
        }
        if ("w".equals(s)) {
            return 11111;
        }
        else {
            return 111111;
        }
    }
}
