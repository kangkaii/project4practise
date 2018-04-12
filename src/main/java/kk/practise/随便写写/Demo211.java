package kk.practise.随便写写;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangkai on 2018/2/11.
 */
public class Demo211 {


    public static void main(String[] args) {
          String name = Demo211.class.getName();
          //输出为 ：kk.practise.随便写写.Demo211
            //完整的文件路径
          System.out.println(name);
          String s = "sss";
          s = s+ null;
    }
    static String get() {

        return "";
    }

}
