package kk.practise.String的indexOf测试;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/6.
 */
public class Demo03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        String str = sc.nextLine();
        int a = str.lastIndexOf("\\");
        System.out.println(a);
        String newStr = str.substring(a+1);
        System.out.println(newStr);
    }

}
