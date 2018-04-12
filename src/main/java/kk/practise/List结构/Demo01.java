package kk.practise.List结构;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by  kk on 2017/9/13.
 */
public class Demo01 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        if (arrayList.isEmpty()) {
            System.out.println("arrayList默认是空");
        }
        if (linkedList.isEmpty()) {
            System.out.println("linkedList默认是空");
        }
        if (arrayList != null) {
            System.out.println("arrayList默认不是null");
        }
        if (linkedList != null) {
            System.out.println("linkedList默认不是null");
        }
        if (arrayList.size() == 0) {
            System.out.println("arrayList.size()是0");
        }
        if (linkedList.size() == 0) {
            System.out.println("linkedList.size()是0");
        }
        try {
            arrayList.get(0);
            System.out.println("arrayList.get(0)没抛异常");
        }catch (Exception e){
            System.out.println("arrayList.get(0)抛了异常");
        }
        try {
            linkedList.get(0);
            System.out.println(linkedList.get(0)+"linkedList.get(0)没抛异常");
        }catch (Exception e){
            System.out.println("linkedList.get(0)抛了异常");
        }


    }
}
