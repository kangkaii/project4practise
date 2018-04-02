package kk.practise.java8_新功能_新时间类;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author kangkai on 2017/10/18.
 */
public class TestCalendar {

    @Test
    public void testDate() {
        Date date = new Date();
        System.out.println(date);
    }

    @Test
    public void testCalendar() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        //比当前月份少1
        int month = cal.get(Calendar.MONTH);
        //date表示日期，day表示天数，所以date与day_of_month相同
        int date = cal.get(Calendar.DATE);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        //表示本周的第几天，从周日开始计算
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
        //12小时制
        int hour = cal.get(Calendar.HOUR);
        //24小时制
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int millisecond = cal.get(Calendar.MILLISECOND);
        int maxDate = cal.getActualMaximum(Calendar.DATE);
        System.out.println("现在的年份为:" + year);
        System.out.println("现在的月份为:" + month);
        System.out.println("现在的号为:" + date);
        System.out.println("现在的号为:" + dayOfMonth);
        System.out.println("现在是星期:" + dayOfWeek);
        System.out.println("现在过了的天数为:" + dayOfYear);
        System.out.println("现在几点:" + hour);
        System.out.println("现在几点:" + hourOfDay);
        System.out.println("现在几分:" + minute);
        System.out.println("现在几秒:" + second);
        System.out.println("现在几毫秒:" + millisecond);
        System.out.println("本月最后一天是:" + maxDate);
    }

}
