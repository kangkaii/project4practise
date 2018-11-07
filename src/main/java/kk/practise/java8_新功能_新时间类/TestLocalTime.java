package kk.practise.java8_新功能_新时间类;

import org.junit.Test;

import java.time.Instant;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;


/**
 * @author kangkai on 2017/10/18.
 */
public class TestLocalTime {

    @Test
    public void testDate() {
        //获取当前时间
        int now = LocalTime.now().getNano(); // 23:11:08.006
        long instant = Instant.now().toEpochMilli();
        //构造时间：

        LocalTime zero = LocalTime.of(01, 01, 01); // 01:01:01
        LocalTime mid = LocalTime.parse("12:01:01"); // 12:01:01
        System.out.println(now);
        System.out.println(zero);
        System.out.println(mid);
        System.out.println(instant);

    }

}
