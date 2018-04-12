package kk.practise.Object类型拼到StringBuilder里面;

import org.junit.Test;

/**
 * Created by kk on 2017/10/12.
 */
public class splicingTest {

    @Test
    public void test() {
        Object o = "";
        StringBuilder sb = new StringBuilder("");
        sb.append(o+"s"+o==null?"":o);
        //sb.append(o==null?"":o+"s"+o==""?"":o);

    }

}
