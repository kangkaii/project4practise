package kk.practise.初始化集合指定大小;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by kangkai on 2017/10/16.
 */
public class ListTest {

    @Test
    public void test() {
        List<String> list = new ArrayList<>(16);
        list.add("1");
        System.out.println(list.size());
    }


}
