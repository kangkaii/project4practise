package kk.practise.随便写写;

/**
 * @author kangkai on 2018/2/5.
 */
public class Demo09 {


    //String类 去掉空格后 ，是不是 null

    public static void main(String[] args) {

        String str = "1 2   3";//多个空格
        String str2 = "hhhh";//没有空格
        String[] newStrs = str2.split("\\s+");
        for (String s : newStrs) {
            System.out.println(s+"xxxx");
        }

        //System.out.println(str.trim() == null);
    }
}
