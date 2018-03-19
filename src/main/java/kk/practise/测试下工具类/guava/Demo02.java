package kk.practise.测试下工具类.guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**本例说明：Multimap是可以存重复元素的map
 *  multimap.put("a",1);
    multimap.put("a",2);
    multimap.get("a")----> 输出的数组{1,2}
 * @author kangkai on 2018/3/9.
 */
public class Demo02 {


    public static void main(String[] args) {

        Multimap<String, Integer> multimap = ArrayListMultimap.create();

        multimap.put("a",1);
        multimap.put("a",2);
        multimap.put("a",3);
        multimap.put("b",4);
        //"key = "+k+"
        multimap.forEach((k,v) ->{System.out.println("key = "+k + ",value = "+v);});
        System.out.println(multimap.get("a"));
        System.out.println(multimap.asMap());
    }
}
