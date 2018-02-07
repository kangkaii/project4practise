package kk.practise.List练习;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkai on 2017/10/23.
 */
public class Demo02 {


    public static void main(String[] args) {
         List<String> list = new ArrayList<>(10);
         System.out.println(list.get(0));//运行报错：IndexOutOfBoundsException
    }
}
