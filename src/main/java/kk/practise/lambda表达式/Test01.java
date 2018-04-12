package kk.practise.lambda表达式;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author kangkai on 2017/10/18.
 */
public class Test01 {

    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e));
    }

}
