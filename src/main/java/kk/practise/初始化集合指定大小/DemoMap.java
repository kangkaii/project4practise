package kk.practise.初始化集合指定大小;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangkai on 2018/2/24.
 */
public class DemoMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put(null,"2");

        map.put("w","d");
        map.put("dads","d");
        map.put("g","s");
        map.get("1");
  /*6 = 0000000000110 --->
        00000000001100*/

        int a = 7;
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("key = "+entry.getKey());
            System.out.println("value = "+entry.getValue());
        }
        System.out.println(a>>>1);
    }

}
