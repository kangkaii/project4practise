package kk.practise.四种方法引用类型.静态方法引用.一;

import org.junit.Test;

/**
 * Created by  kk on 2017/10/12.
 */
public class MyStringOps {

    //反转字符串
    public static String strReverse(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    //反转字符串(普通)
    public String strReverseP(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }


    @Test
    public void strReverseTest() {
        System.out.println(strReverse("123"));
    }

}
