package kk.practise.四种方法引用类型.任意对象的实例方法引用;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by kk on 2017/10/13.
 */
public class Demo {

    @Test
    public void test() {
        String[] stringArray = { "Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        System.out.println(Arrays.asList(stringArray));
    }



}
