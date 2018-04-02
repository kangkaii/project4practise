package kk.practise.List的romoveAll测试;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by  kk on 2017/9/6.
 */
public class Test {
    public static void main(String[] args) {
        List<String> listOne = new ArrayList<>();//1,2,3,4
        List<String> listTwo = new ArrayList<>();//2,3,4,5
        listOne.add("1");
        listOne.add("2");
        listOne.add("3");
        listOne.add("4");
        listTwo.add("2");
        listTwo.add("3");
        listTwo.add("4");
        listTwo.add("5");

        if (!listOne.contains(listTwo)) {
            //listOne.removeAll(listTwo);//应该剩下1
            listOne.remove(listTwo);//应该剩下1
            System.out.println(listOne);
        }
    }


}
