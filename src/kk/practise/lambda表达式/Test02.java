package kk.practise.lambda表达式;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * @author kangkai on 2017/10/19.
 */
public class Test02 {

    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics stats = numbers
                .stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println("List中最大的数字 : " + stats.getMax());
        System.out.println("List中最小的数字 : " + stats.getMin());
        System.out.println("所有数字的总和   : " + stats.getSum());
        System.out.println("所有数字的平均值 : " + stats.getAverage());
        Number i = 1;
       /* List list1 = new ArrayList();
        List<String> list2 = new ArrayList();
        list1.add(1);
        list1.add("1");
        list2.add(1);//明显会报错
        String v1 = list1.get(0);
*/

    }

}
