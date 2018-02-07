package kk.practise.String的indexOf测试;

import java.util.Scanner;

/**
 * @author kangkai on 2017/11/6.
 */
public class Demo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        String str = sc.nextLine();
        /*while (sc.hasNext()) {
            sb.append(sc.next());
        }*/
        //String str = sc.next();
        int a = str.indexOf("-");
        System.out.println(a);

    }

}
