package kk.practise.thinkInJava;


import java.util.ArrayList;
import java.util.List;

/**
 * @author kangkai on 2017/12/5.
 */
public class SortList {//快速排序
    private ArrayList<Integer> list = new ArrayList<>();

    private void quickSort(int left,int right) {


    }

    private void swap(int loc1, int loc2) {//交换
        int tmp = list.get(loc1);
        list.set(loc1,list.get(loc2));
        list.set(loc2,tmp);
    }
}
