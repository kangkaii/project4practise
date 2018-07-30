package kk.practise.String类理解;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangkai on 2017/11/1.
 */
public class Demo01 {
    static void operate(String str) {
        str += "def";
    }

    static void mapAdd(Map<String, String> map) {
        map.put("aa", "aa");
    }

    public static void main(String[] args) {
        String str1 = new String("abc").intern();
        String str2 = "abc";
        String str3 = "123";


        operate(str1);
        //
        System.out.println("str1="+str1);
        System.out.println("str2="+str2);


        operate(str2);

        System.out.println("str2="+str2);

        operate(str3);
        System.out.println("str3="+str3);
        Map<String, String> map = new HashMap<String, String>();
        map.put("bb", "bb");

        // 这里没有疑问，mapAdd中传递的map为对象，传递的是引用，操作后map指向了操作后堆中的map值
        // 操作后，main方法中map中有两队值。
        mapAdd(map);
        for (String str : map.keySet()) {
            System.out.println(str);
        }

        String str4 = "123";
        System.out.println("str4初始值："+str4);
        String str5 = "str4";
        String str6 = "123";
        str5 = "456";
        System.out.println(str4);
        str6 = "789";
        System.out.println(str4);
      ;
    }
}
