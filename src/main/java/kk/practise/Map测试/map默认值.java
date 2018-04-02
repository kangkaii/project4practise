package kk.practise.Map测试;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by  kk on 2017/9/6.
 */
public class map默认值 {
    public static void main(String[] args) {
        Map<String, String> resultMap = new HashMap();
        if (resultMap.isEmpty()) {
            System.out.println("map默认是空");
        }
        if (resultMap != null) {
            System.out.println("map默认不是null");
        }
        if (resultMap.get("message") == null) {
            System.out.println("map.get()参数不存在,是null");
        }
    }
}
