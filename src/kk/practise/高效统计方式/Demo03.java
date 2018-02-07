package kk.practise.高效统计方式;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangkai on 2017/10/24.
 */
public class Demo03 {
    public static void main(String[] args) {
        String strA = "1 1 1 1 1 1";
        String[] strArr = strA.split(" ");
        Map<String, MutableInteger> counter = new HashMap<String, MutableInteger>();
        for(String s : strArr) {
            MutableInteger newValue = new MutableInteger(1);
            MutableInteger oldValue = counter.put(s, newValue);
            if(null != oldValue) {
                newValue.setValue(oldValue.getValue() + 1);
            }
        }
        System.out.println(counter.get("1").value);
    }

}
