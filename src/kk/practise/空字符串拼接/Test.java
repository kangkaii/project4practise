package kk.practise.空字符串拼接;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by  kk on 2017/10/11.
 */
public class Test {


    public static void main(String[] args) {

        Map<String,String> map = new HashMap();
        map.put("111",null);
        StringBuilder result = new StringBuilder("");
        result.append("12345");
        result.append("保险事故发生后，被保险人自行承担的金额，按如下约定取其中较高金额：");
        String str = "保险事故发生后，被保险人自行承担的金额，按如下约定取其中较高金额：";
        int length  = str.length();
        if (true) {
            result.delete(result.length()-length,result.length());
        }
        System.out.println(result.toString());

    }


}
