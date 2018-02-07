package kk.practise.初始化集合指定大小;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangkai on 2017/10/16.
 */
public class MapTest {

    @Test
    public void test() {
    /**
     * Constructs an empty <tt>HashMap</tt> with the specified initial
     * capacity and the default load factor (0.75).
     *
     * @param  initialCapacity the initial capacity.
     * @throws IllegalArgumentException if the initial capacity is negative.
     */
        Map<String,String> map = new HashMap(2);
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        System.out.println("初始化定义的大小为2，添加3条数据，size为："+map.size());

        Map<String,String> map02 = new HashMap(3);
        map02.put("1","1");
        map02.put("2","3");
        System.out.println("初始化定义的大小为3，添加1条数据，size为："+map02.size());
    }

}
