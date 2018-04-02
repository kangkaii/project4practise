package kk.practise.高效统计方式;

import java.util.HashMap;

/**
 * @author kangkai on 2017/10/24.
 */
public class Demo01 {
    public static void main(String[] args) {
        String strA = "www. tian tian bian ma .com 天 天 编 码";
        String[] strArr = strA.split(" ");

        HashMap<String, Integer> counter = new HashMap<String, Integer>();
        for (String str : strArr) {
            if (counter.containsKey(str)) {
                int oldValue = counter.get(str);
                counter.put(strA, oldValue + 1);

            } else {
                counter.put(strA, 1);
            }
        }

    }
}
