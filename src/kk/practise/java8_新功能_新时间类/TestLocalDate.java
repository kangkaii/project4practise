package kk.practise.java8_新功能_新时间类;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * @author kangkai on 2017/10/18.
 */
public class TestLocalDate {

    /**
     * 相比Date来说，LocalDate更安全、更精确也更明确。
     * LocalDate不包含时间，只是单纯的年月日，
     * 要精确到时分秒甚至毫秒的就需要用java.time.LocalDateTime了。
     * */

    @Test
    public void testLoalDate() {
        // 取当前日期：
        LocalDate today = LocalDate.now();//---> 2017-10-18

        // 根据年月日取日期：
        LocalDate crischristmas = LocalDate.of(2017, 10, 18); // -> 2017-10-18

        // 根据字符串取：格式不对 直接抛出异常：DateTimeParseException: Text '2017-110-18' could not be parsed at
        LocalDate endOfFeb = LocalDate.parse("2017-10-18");//---> 2017-10-18

        System.out.println(endOfFeb);



        //获取日历信息：
        // 取本月第1天：
        LocalDate firstDayOfThisMonth = today.with(TemporalAdjusters.firstDayOfMonth()); // 2017-03-01
        // 取本月第2天：
        LocalDate secondDayOfThisMonth = today.withDayOfMonth(2); // 2017-03-02
        // 取本月最后一天，再也不用计算是28，29，30还是31：
        LocalDate lastDayOfThisMonth = today.with(TemporalAdjusters.lastDayOfMonth()); // 2017-12-31
        // 取下一天：
        LocalDate firstDayOf2015 = lastDayOfThisMonth.plusDays(1); // 变成了2018-01-01
        // 取2017年1月第一个周一，用Calendar要死掉很多脑细胞：
        LocalDate firstMondayOf2015 = LocalDate.parse("2017-01-01").with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // 2017-01-02

    }

}
