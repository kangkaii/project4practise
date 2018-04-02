package kk.practise.List练习;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  kk on 2017/9/14.
 */
public class ConcurrentModificationException异常信息 {
    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();
        for(int i=1;i<5;i++){
            listOne.add(i);
        }
        for(int i=2;i<6;i++){
            listTwo.add(i);
        }
        listOne.forEach(o ->{
            if (listTwo.contains(o)) {
                listOne.remove(o);
            }
        });
        System.out.println(listOne);

    }

}
