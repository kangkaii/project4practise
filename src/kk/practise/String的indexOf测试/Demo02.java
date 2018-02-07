package kk.practise.String的indexOf测试;

/**
 * @author kangkai on 2017/11/6.
 */
public class Demo02 {

    public static void main(String[] args) {

        String str = "E:\\V1R2\\product\\fpgadrive.c 1325";
        int a = str.lastIndexOf("\\");
        System.out.println(a);
        String newStr = str.substring(a+1);
        System.out.println(newStr);
    }

}
