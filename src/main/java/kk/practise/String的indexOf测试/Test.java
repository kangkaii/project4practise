package kk.practise.String的indexOf测试;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by  kk on 2017/10/10.
 */
public class Test {
    public static void main(String[] args) {
        String a = null;
        String b = "1";
        //System.out.println(a.indexOf("1"));//此时会报错：NullPointerException
        //System.out.println(b.indexOf("111"));

        int x = 1;
        int y = 1;
        System.out.println(x+y+"aaaaaaaa");
        AtomicInteger atom = new AtomicInteger(1);
        int t = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.forEach(o ->{
            //atom.accumulateAndGet(1);

        });
        for (int i = 0; i < list.size(); i++) {
            t++;
        }

    }
}
