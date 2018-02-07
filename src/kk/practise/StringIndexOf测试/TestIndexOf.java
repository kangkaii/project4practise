package kk.practise.StringIndexOf测试;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kk on 2017/10/13.
 */
public class TestIndexOf {

    @Test
    public void test() {

        String str = null;
        String param = null;
        //System.out.println("String的indexOf方法，str是null的时候："+str.indexOf("1"));
        //System.out.println("String的indexOf方法，参数是null的时候："+"1".indexOf(str));
        //根据如上测试，结果：
        //str.indexOf(param)  str param 都不能为 null，都会报空指针

        Map<String,String> map = new HashMap();
        map.put("1","1");
        String getMap = map.get("22");
        System.out.println(getMap);


        List<String> list = new ArrayList<>();
        list.forEach(l ->{
            System.out.println(1);
        });
    }

}
