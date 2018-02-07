package kk.practise.字符串实现反转;

import org.junit.Test;

/**
 * Created by  kk on 2017/10/12.
 */
public class CharAtFunction {

    //核心：String类的 charAt(int i)方法
    //反转字符串
    public static String strReverseByCharAt(String str) {
        //原理：String的 转换数组，charAti[i]相当于 array[]
        if (str == null || str.length() == 0) return str;
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String strReverseByCharArray(String str) {
        //原理，使用str.toCharArray() ，将 其转化成数组
        if (str == null || str.length() == 0) return str;
        String result = "";
        char[] array  = str.toCharArray();
        for (int i = str.length()-1; i >= 0; i--) {
            result += array[i];
        }
        return result;
    }

    @Test
    public void strReverseTest02() {
        System.out.println(strReverseByCharArray("123"));
        System.out.println(strReverseByCharAt("123"));
    }


    private static String checkString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }else {
            return "success";
        }
    }


}
