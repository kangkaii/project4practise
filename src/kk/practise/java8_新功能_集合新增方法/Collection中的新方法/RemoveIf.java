package kk.practise.java8_新功能_集合新增方法.Collection中的新方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kangkai on 2018/3/1.
 */
public class RemoveIf {


    public static void main(String[] args) {
        //对每个元素 进行操作 满足 则remove
        List<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.removeIf(str -> str.length()<3);
        list.forEach(s -> System.out.println(s));
    }
}
