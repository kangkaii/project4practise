package kk.practise.扑克牌大小比较;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/6.
 */
public class Demo001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String left = str.split("-")[0];
        String right = str.split("-")[1];
        String result = "";
        String[] leftArray = left.split(" ");
        String[] rightArray = right.split(" ");
        if (left.contains("joker JOKER") || right.contains("joker JOKER")) {
            result = "joker JOKER";
        }
        else if (leftArray.length == 4 && rightArray.length != 4) {
            result = left;
        }
        else if (leftArray.length != 4 && rightArray.length == 4) {
            result = right;
        }
        else {
            //长度相等
            if (leftArray.length == rightArray.length) {
                int a = getInt(leftArray[0]);
                int b = getInt(rightArray[0]);
                result = a < b? right:left;
            }else {
                result = "ERROR";
            }
        }
        System.out.println(result);
    }









    //1,不在使用映射关系,如下：
    public static int getInt(String a) {
        String str = "345678910JQKA2jokerJOKER";
        return str.indexOf(a);
    }

}
