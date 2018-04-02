package kk.practise.java8_新功能_集合新增方法.List中的新方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kangkai on 2018/3/1.
 */
public class ReplaceAll {

    public static void main(String[] args) {
        //对每个元素 进行操作 满足 则xxxx
        List<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.add("1");
        /*list.replaceAll(s -> {
            if (s.length() > 3) {
                return s.toUpperCase();
            }else {
                return s;
            }
        });*/
        list.replaceAll(s ->
             s.length() > 3 ? s.toUpperCase():s
        );
        list.forEach(s -> System.out.println(s));
    }

}
