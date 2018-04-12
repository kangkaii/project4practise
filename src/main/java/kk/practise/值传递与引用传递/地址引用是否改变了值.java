package kk.practise.值传递与引用传递;

import kk.practise.Map测试.X;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangkai on 2017/10/24.
 */
public class 地址引用是否改变了值 {

    public static void main(String[] args) {
        Map<String,X> map = new HashMap(16);
        X x = new X("111");
        map.put("1",x);
        X y = map.get("1");
        y.setValue("2222");
        System.out.println(x.getValue());


    }

}
