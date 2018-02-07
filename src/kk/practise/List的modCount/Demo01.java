package kk.practise.List的modCount;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author kangkai on 2017/11/13.
 */
public class Demo01 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(""+i);
        }
        System.out.println("list.size = "+list.size()+", list = "+list);
        //正常使用:for循环remove具体元素（不会报错）
        //正常使用：for循环romove索引（不会报错）
//        for (int i = 9; i >= 0; i--) {
//            if (i == 2) {
//                list.remove(2);
//                // list.remove((""+1));
//            }
//        }
//        list.forEach(l ->{//使用 forEach方法 add/remove 报错！！！！
//            //list.remove(0);
//            list.add("aaa");
//        });
//        list.forEach(s -> {
//                //list.remove((""+1));
//                /*if (s != null) {
//                    list.add((""+1));
//                }*/
//        });
        //如果使用迭代器 当使用 iterator.remove(); 的时候 不会报错
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            if ("0".equals(iterator.next())) {
//                iterator.remove();
//            }
//        }

        //使用 如下 同样报错。
//        for (String s : list) {
//            if ("1".equals(s)) {
//                list.add("11");
//                //list.remove(s);
//            }
//        }
        System.out.println("list.size = "+list.size()+", list = "+list);

    }

}
