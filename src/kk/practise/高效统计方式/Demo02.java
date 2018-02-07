package kk.practise.高效统计方式;

import java.util.HashMap;

/**
 * @author kangkai on 2017/10/24.
 */
public class Demo02 {

    public static void main(String[] args) {
        String strA = "1 1 2 1 2 3 4 5";
        String[] strArr = strA.split(" ");
        HashMap<String, MutableInteger> counter = new HashMap<>();

        for(String a : strArr) {
            if(counter.containsKey(a)) {
                MutableInteger oldValue = counter.get(a);//引用地址---->value(没有copy值)
                oldValue.setValue(oldValue.getValue() + 1);//通过地址--->改value(改变了值)
            } else {
                counter.put(a, new MutableInteger(1));
            }
        }
        System.out.println(counter.get("1").getValue());
    }


}
