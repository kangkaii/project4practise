package kk.practise.java8_新功能_集合新增方法.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangkai on 2018/3/1.
 */
public class Demo01 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(16);
        map.put("1","1");
        map.forEach((k, v) -> System.out.println("key = "+k+"value="+v));
    }

}
