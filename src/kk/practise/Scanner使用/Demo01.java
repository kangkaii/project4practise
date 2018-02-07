package kk.practise.Scanner使用;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/7.
 */
public class Demo01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(a);
        System.out.println("请输入字符串：");
        while (true) {
            String line = s.nextLine();//第一次 line 默认为 "" ----> 循环一次，输入不起作用
            //int n = Integer.parseInt(line.split(" ")[0]);
            if (line.equals("exit")) {break;}
            System.out.println(">>>" + line);
        }
    }

}
