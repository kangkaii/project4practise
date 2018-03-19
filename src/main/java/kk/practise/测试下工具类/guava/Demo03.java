package kk.practise.测试下工具类.guava;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**本例说明：Multiset是可以存重复元素的set
 * 提供便利方式1：add("a",10)，将a添加10次
 * 提供便利方式2:multiset.count("a")，返回a在set里面的数量
 * @author kangkai on 2018/3/9.
 */
public class Demo03 {

    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("a",10);
        multiset.add("b",1);
        multiset.add("c",2);
        multiset.forEach(k ->System.out.println(k));

        System.out.println(multiset.count("a"));

    }

}
