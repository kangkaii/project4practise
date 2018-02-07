package kk.practise.四种方法引用类型.特定实例对象的方法引用.实例上的实例方法引用;

import kk.practise.java8_新功能_方法引用.Person;import kk.practise.java8_新功能_方法引用.Person;
import org.junit.Test;
import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by kk on 2017/10/12.
 */
public class ComparisonProvider {

    Person[] rosterAsArray = new Person[]{
            new Person("003", LocalDate.of(2016,9,1)),
            new Person("001", LocalDate.of(2016,2,1)),
            new Person("002", LocalDate.of(2016,3,1)),
            new Person("004", LocalDate.of(2016,12,1))};

    public int compareByName(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }

    public int compareByAge(Person a, Person b){
        return a.getBirthday().compareTo(b.getBirthday());
    }

    @Test
    public void test() {
        ComparisonProvider myComparisonProvider = new ComparisonProvider();
        //实例化对象 直接引用方法
        Arrays.sort(rosterAsArray, myComparisonProvider::compareByName);
        System.out.println(Arrays.asList(rosterAsArray));
        Arrays.sort(rosterAsArray, myComparisonProvider::compareByAge);
        System.out.println(Arrays.asList(rosterAsArray));
    }

}
