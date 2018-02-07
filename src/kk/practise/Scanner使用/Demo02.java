package kk.practise.Scanner使用;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/7.
 */
public class Demo02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("a="+a);
        while (true) {
            int b = sc.nextInt();
            String c = sc.nextLine();
            System.out.println("b="+b);
            System.out.println("c="+c);
        }
    }

}
