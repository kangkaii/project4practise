package kk.practise.java8_新功能_Stream接口;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author kangkai on 2018/3/1.
 */
public class Demo {

    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");


        //重要：以下方法 只能调用(方法内输出) ,输出返回值，并未改变！！！
        //其实这也是函数式编程的一个好处：不会改变对象状态，每次都会创建一个新对象。
        //比如下方过滤方法！不管是调用xxx() 还是过滤方法内部，只要不在stream中，都不会改变！


        //过滤方法()-----> 只是过滤 并没有实际改变list！！！
        //过滤完成后，list并没有改变！！
        //filter_noreturn(stringCollection);
        reducetest(stringCollection);
        //stringCollection.forEach(s -> System.out.println(s));
        //sort_rule
        //stringCollection.forEach(System.out::println);


    }

    private static List<String> filter(List<String> stringCollection) {

        stringCollection
                .stream()
                .filter(s -> s.startsWith("a"));
                //.forEach(System.out::println);
        return stringCollection;
    }

    private static void filter_noreturn(List<String> stringCollection) {

        stringCollection
                .stream()
                .filter(s -> s.startsWith("a"))
        .forEach(System.out::println);
        //return stringCollection;
    }


    /**
    * Description:排序（不自定义规则）
    */
    private static void sort_norule(List<String> stringCollection) {

        stringCollection
                .stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("____________");
        stringCollection.forEach(System.out::println);

    }

    /**
     * Description:排序（自定义规则）
     */
    private static void sort_rule(List<String> stringCollection) {

        stringCollection
                .stream()
                //a ,b ,c ,d 排序
                .sorted((o1, o2) -> o1.compareTo(o2))

                // d,c ,b ,a 排序
                .sorted((o1, o2) -> o2.compareTo(o1))
                //.sorted(Comparator.comparing())
                .forEach(System.out::println);
        System.out.println("____________");

    }

    /**
     * Description:map映射
     */
    private static void maptest(List<String> stringCollection) {
        stringCollection.stream()
                .map(s ->  {return s+"xxx";})
                //简化如下
                .map(s ->   s+"xxx")
                .forEach(System.out::println);
        //stringCollection.forEach(s -> );
    }

    /**
     * Description:match规则，调用allMatch(自定义一个规则)，判断是否所有元素都符合规则！
     * 返回false/true
     * 还有 noneMatch() ，原理与用法 应该 == allMatch()
     */
    private static void matchtest(List<String> stringCollection) {
        boolean result =
        stringCollection.stream()
               //.allMatch(s -> {return s.startsWith("a");});
               .allMatch(s ->  s.startsWith("a"));
        System.out.println(result);
    }

    /**
     * Description:match规则，调用allMatch(自定义一个规则)，判断是否所有元素都符合规则！
     * 返回false/true
     * 还有 noneMatch() ，原理与用法 应该 == allMatch()
     */
    private static void counttest(List<String> stringCollection) {
        long count = stringCollection.stream()
                .filter(s -> s.startsWith("a"))
                .count();
        System.out.println(count+"");
    }


    /**
     * Description:Reduce这是一个最终操作
     * 允许通过指定的函数来讲stream中的多个元素规约为一个元素
     * 规越后的结果是通过Optional接口表示的：
     */
    private static void reducetest(List<String> stringCollection) {

        Optional<String> reduced = stringCollection.stream()
                .reduce((s1, s2) -> s1+"+"+s2);
        reduced.ifPresent(System.out::println);
    }




}
