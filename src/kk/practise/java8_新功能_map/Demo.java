package kk.practise.java8_新功能_map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangkai on 2018/3/1.
 */
public class Demo {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        //神奇方法之--->  putIfAbsent
        //已经重复的key  就不会 继续 put！
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
            map.putIfAbsent(i, "valxxx" + i);
        }

        //这是 map 接口的 foreach方法
        map.forEach((id, val) -> System.out.println(val));

        map.computeIfPresent(3, (num, val) -> val + num);
        map.get(3);             // val33

        map.computeIfPresent(9, (num, val) -> null);
        map.containsKey(9);     // false

        map.computeIfAbsent(23, num -> "val" + num);
        map.containsKey(23);    // true

        map.computeIfAbsent(3, num -> "bam");
        map.get(3);             // val33
    }


}
