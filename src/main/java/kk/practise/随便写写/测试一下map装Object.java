package kk.practise.随便写写;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangkai on 2018/3/2.
 */
public class 测试一下map装Object {

    public static void main(String[] args) {

        Map<String,Object> map = new HashMap<>(16);


        map.put("1","11");
        map.put("x",2);

        if (null == map.get("x")) {
            System.out.println("x有内容");
        }
        String result = (String) map.get("dadas");//null
        if (!result.equals("")) {
           // System.out.println(!result.equals(""));

        }
       /* Object ob = null;
        String obStr = (String)ob;

        System.out.println(obStr.equals(""));*/
    }

}
