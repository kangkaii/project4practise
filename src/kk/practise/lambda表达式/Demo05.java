package kk.practise.lambda表达式;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author kangkai on 2018/1/30.
 */
public class Demo05 {

    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("小王","小张");
        nameList.sort((o1, o2) ->
             o1.compareTo(o2)
        );



    }

}
