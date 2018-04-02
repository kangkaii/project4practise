package kk.practise.java8_新功能_集合新增方法.List中的新方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kangkai on 2018/3/1.
 */
public class Sort {

    //原来此方法定义在 Collections 工具类中
    //现在list可以直接用了！
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        //list.sort((o1, o2) -> o1.compareTo(o2));
        list.sort((o1, o2) -> o1.length() - o2.length());
        list.forEach(s -> System.out.println(s));
    }



}
