package kk.practise.boolean与String转化;

/**
 * @author kangkai on 2017/11/20.
 */
public class Demo03 {//String 转 boolean

    public static void main(String[] args) {
        String str = "false";
        String str2 = "falsE";
        String str3 = "true";
        String str4 = "truE";
        //1,if判断
        boolean b = str == "false"? false : true;
        System.out.println(b);
        //2,使用 Boolean类 parseBoolean方法( 不区分大小写 )
        Boolean c = Boolean.parseBoolean(str);
        Boolean d = Boolean.parseBoolean(str2);
        Boolean e = Boolean.parseBoolean(str3);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        //3,使用Boolean . valueOf().booleanValue();-----> 不区分大小写
        Boolean f = Boolean.valueOf(str).booleanValue();
        Boolean g = Boolean.valueOf(str2).booleanValue();
        Boolean h = Boolean.valueOf(str3).booleanValue();
        Boolean i = Boolean.valueOf(str4).booleanValue();
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

    }
}
