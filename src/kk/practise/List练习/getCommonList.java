package kk.practise.List练习;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkai on 2017/11/13.
 */
public class getCommonList {

    public static void main(String[] args) {
        List<String> list01 = new ArrayList<>(10);
        List<String> list02 = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list01.add(i+"");
        }
        for (int i = 5; i < 15; i++) {
            list02.add(i+"");
        }
        list02.retainAll(list01);
        System.out.println(list02);
    }

}
