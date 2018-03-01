package kk.practise.java8_新功能_Stream接口;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author kangkai on 2018/3/1.
 */
public class 并行Stream {

    //并行Stream则是在多个线程上同时执行
    //下面的例子展示了是如何通过并行Stream来提升性能：

    public static void main(String[] args) {

        //没有重复元素的list
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        //noneparallel(values);
        parallel(values);


    }

    /**
    * Description:串行排序时间测试(使用普通的 stream)
    * @param
    * @return
    */
    private static void noneparallel(List<String> values) {
        int t0 = LocalTime.now().getNano();
        long count = values.stream().sorted().count();
        System.out.println(count);
        int t1 = LocalTime.now().getNano();
        System.out.println(t1 - t0);
    }


    /**
     * Description:串行排序时间测试(使用parallelStream)
     * @param
     * @return
     */
    private static void parallel(List<String> values) {
        int t0 = LocalTime.now().getNano();
        long count = values.parallelStream().sorted().count();
        System.out.println(count);
        int t1 = LocalTime.now().getNano();
        System.out.println(t1 - t0);
    }

}
