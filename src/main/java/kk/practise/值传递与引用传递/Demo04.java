package kk.practise.值传递与引用传递;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkai on 2017/10/23.
 */
public class Demo04 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        changeList(list);
        System.out.println(list.size());

        List<String> list02 = new ArrayList<>();
        changeListWithNew(list02);
        System.out.println(list02.size());
    }

    public static void changeList(List list) {
        list.add("1");
    }

    public static void changeListWithNew(List list) {
        list = new ArrayList<>();
        list.add("1");
    }
}
