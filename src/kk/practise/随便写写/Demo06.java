package kk.practise.随便写写;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kangkai on 2017/11/28.
 */
public class Demo06 {

    public static void main(String[] args) {

        List<String> list01 = new ArrayList<>(10);
        LocalTime now = LocalTime.now(); // 23:11:08.006
        System.out.println(LocalTime.now());
        for (int i = 0; i < 100000000; i++) {
            list01.add("100");
        }
        System.out.println(LocalTime.now());
        System.out.println("----------");
        System.out.println(LocalTime.now());
        List<String> list02 = new LinkedList<>();
        for (int i = 0; i < 100000000; i++) {
            list02.add("100");
        }
        System.out.println(LocalTime.now());

    }

}
