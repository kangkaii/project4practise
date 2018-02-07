package kk.practise.字符串拆分;


import java.util.Arrays;

/**
 * Created by  kk on 2017/9/6.
 */
public class StringUtils方法 {
    public static void main(String[] args) {
        String str = "V001,V002,V003,V004,V005";
        System.out.println(Arrays.asList(str.split(",")));
    }


}
