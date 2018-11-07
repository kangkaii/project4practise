package kk.practise.List练习;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by  kk on 2017/9/14.
 * 此类说明 在ArrayList 遍历删除过程中
 * 直接使用 list.remove(e),报错----18-9-2更新：只有循环中remove才会出现
 * 解决办法01：使用迭代器遍历，用 iterator.remove()
 * 解决办法02：使用CopyOnWriteArrayList，可以遍历中remove
 * 解决办法03：使用java8 新方法 listOne.removeIf(i -> i.equals(a))
 */
public class ConcurrentModificationException异常信息 {
    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();
        List<Integer> listThree = new CopyOnWriteArrayList<>();
        for(int i=1;i<5;i++){
            listOne.add(i);
        }
        for (int i = 0; i < listOne.size(); i++) {
            if (true) {
                listOne.remove(i);
            }
        }
        System.out.println(listOne);
        List<String> list = new ArrayList<>(10);
        list.add("1");
        list.add("2");
//        for (String s : list) {
//            if ("2".equals(s)) {
//                list.remove(s);
//            }
//        }
        list.forEach(s -> {
            if ("2".equals(s)) {
                list.remove(0);
            }
        });
        System.out.println(list);
        /*for(int i=2;i<6;i++){
            listTwo.add(i);
        }
        for(int i=2;i<6;i++){
            listThree.add(i);
        }

        Integer a = 1;
        listOne.removeIf(i -> i.equals(a));
        listOne.forEach(o ->{
            if (listTwo.contains(o)) {
                listOne.remove(o);
            }
        });
        Iterator<Integer> iterator =  listTwo.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            if(integer==2)
                iterator.remove();   //注意这个地方
        }
        listThree.forEach(o ->{
            if (new Integer(3).equals(o)) {
                listThree.remove(o);
            }
        });*/

        System.out.println(listTwo);
        System.out.println(listThree);

    }

}
