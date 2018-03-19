package kk.practise.测试下工具类.guava;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kangkai on 2018/3/9.
 */
public class Demo01 {

    public static void main(String[] args) {

        Map<String, Map<Long, List<String>>> map = new HashMap<>();
        ImmutableList<String> of = ImmutableList.of("a", "b", "c", "d");

        System.out.println(of.reverse());
    }

}
