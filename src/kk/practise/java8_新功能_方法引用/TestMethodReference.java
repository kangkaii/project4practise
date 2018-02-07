package kk.practise.java8_新功能_方法引用;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by  kk on 2017/10/11.
 */
public class TestMethodReference {
    Person[] pArr = new Person[]{
            new Person("003", LocalDate.of(2016,9,1)),
            new Person("001", LocalDate.of(2016,2,1)),
            new Person("002", LocalDate.of(2016,3,1)),
            new Person("004", LocalDate.of(2016,12,1))
    };

    @Test
    public void test() {//原始写法：使用匿名类
        // 使用匿名类
        Arrays.sort(pArr, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.getBirthday().compareTo(b.getBirthday());
            }
        });
        System.out.println(Arrays.asList(pArr));
    }

    @Test
    public void test02() {//做出改进：使用 Lambda 表达式--->并不调用已经存在的方法（
        // 不需要创建Comparator接口的实现类 ，也不需要创建它的实例对象）

        // Lambda 表达式写法
        Arrays.sort(pArr, (Person a, Person b) -> {
            return a.getBirthday().compareTo(b.getBirthday());
        });
        System.out.println(Arrays.asList(pArr));
    }

    @Test
    public void test03() {//做出改进：调用已经存在的方法！
        // 使用 Lambda 表达式--->（
        // 不需要创建Comparator接口的实现类 ，也不需要创建它的实例对象）

        // Lambda 表达式写法, 使用Person类的静态方法
        Arrays.sort(pArr, (a, b) -> Person.compareByAge(a,b));

        System.out.println(Arrays.asList(pArr));
    }

    @Test
    public void test04() {//做出改进： 使用  方法引用  来替代这个Lambda表达式！
        // 使用 Lambda 表达式--->（
        // 不需要创建Comparator接口的实现类 ，也不需要创建它的实例对象）

        // Lambda 表达式写法, 使用Person类的静态方法
        Arrays.sort(pArr,Person::compareByAge);
        System.out.println(Arrays.asList(pArr));
    }


}
