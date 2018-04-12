package kk.practise.List结构;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by  kk on 2017/9/11.
 */
public class ListToString {

    //list 能不能 .toString()
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list);
        System.out.println(list.toString()+"-");
        System.out.println(list.toArray());

        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("messageInfo1",list.toString());
        System.out.println(resultMap.get("messageInfo1"));
    }
}
